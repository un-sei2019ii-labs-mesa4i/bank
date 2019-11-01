package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;

import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.repository.SavingsAccountRepository;

public class SavingsAccountController extends Controller{

    private SavingsAccountRepository savingsAccountRepository;

    public SavingsAccountController(Context context) {
        super(context);
    }

    public boolean sendMoney(int sourceId, int targetId, double value, Context context) {

        savingsAccountRepository = new SavingsAccountRepository(context);

        final ApplicationUser sourceUser = applicationUserRepository.getUserById(sourceId);
        System.out.println("Source User - ID: " + sourceUser.getAppUserId() +
                ", Name: " + sourceUser.getAppUserName()+
                ", Account: " + sourceUser.getSavingsAccount());

        if (sourceUser.getBalance() >= value) {

            final ApplicationUser targetUser = userRepository.getUserById(targetId);
            System.out.println("Target User - ID: " + targetUser.getId() +
                    ", Name: " + targetUser.getName() +
                    ", Balance: " + targetUser.getBalance());

            sourceUser.setBalance(sourceUser.getBalance() - value);
            targetUser.setBalance(targetUser.getBalance() + value);
            userRepository.updateUser(sourceUser);
            userRepository.updateUser(targetUser);

            final ApplicationUser updatedSourceUser = userRepository.getUserById(sourceId);
            System.out.println("Source User (updated) - ID: " + updatedSourceUser.getId() +
                    ", Name: " + updatedSourceUser.getName() +
                    ", Balance: " + updatedSourceUser.getBalance());

            final ApplicationUser updatedTargetUser = userRepository.getUserById(targetId);
            System.out.println("Target User (updated) - ID: " + updatedTargetUser.getId() +
                    ", Name: " + updatedTargetUser.getName() +
                    ", Balance: " + updatedTargetUser.getBalance());

            return true;

        } else {

            return false;
        }

    }
}

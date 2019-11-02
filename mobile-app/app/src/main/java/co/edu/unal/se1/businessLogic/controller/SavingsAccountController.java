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

        final ApplicationUser sourceUser = savingsAccountRepository.getSavingsAccountById(sourceId).getOwner();
        final SavingsAccount sourceAccount = savingsAccountRepository.getSavingsAccountById(sourceId);

        System.out.println("Source User - ID: " + sourceUser.getAppUserId() +
                ", Name: " + sourceUser.getAppUserName()+
                ", Account: " + sourceUser.getSavingsAccount()+
                ", Balance: "+sourceAccount.getBalance());

        if (savingsAccountRepository.getSavingsAccountById(sourceId).getBalance() >= value) {

            final ApplicationUser targetUser = savingsAccountRepository.getSavingsAccountById(targetId).getOwner();
            final SavingsAccount targetAccount=savingsAccountRepository.getSavingsAccountById(targetId);

            System.out.println("Target User - ID: " + targetUser.getAppUserId() +
                    ", Name: " + targetUser.getAppUserName() +
                    ", Account: " + targetUser.getSavingsAccount()+
                    ", Balance: "+targetAccount.getBalance());

            sourceAccount.setBalance(sourceAccount.getBalance() - value);
            targetAccount.setBalance(targetAccount.getBalance() + value);
            savingsAccountRepository.updateSavingsAccount(sourceAccount);
            savingsAccountRepository.updateSavingsAccount(targetAccount);

            final ApplicationUser updatedSourceUser = savingsAccountRepository.getSavingsAccountById(sourceId).getOwner();
            final SavingsAccount updatedSourceAccount = savingsAccountRepository.getSavingsAccountById(sourceId);

            System.out.println("Source User (updated) - ID: " + updatedSourceUser.getAppUserId() +
                    ", Name: " + updatedSourceUser.getAppUserName() +
                    ", Account: " + updatedSourceUser.getSavingsAccount()+
                    ", Balance: "+updatedSourceAccount.getBalance());

            final ApplicationUser updatedTargetUser = savingsAccountRepository.getSavingsAccountById(targetId).getOwner();
            final SavingsAccount updatedTargetAccount = savingsAccountRepository.getSavingsAccountById(targetId);

            System.out.println("Target User (updated) - ID: " + updatedTargetUser.getAppUserId()+
                    ", Name: " + updatedTargetUser.getAppUserName()+
                    ", Account: " + updatedTargetUser.getSavingsAccount()+
                    ", Balance: " + updatedTargetAccount.getBalance());

            return true;

        } else {

            return false;
        }

    }
}

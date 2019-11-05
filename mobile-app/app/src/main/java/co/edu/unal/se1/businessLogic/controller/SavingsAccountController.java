package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
<<<<<<< HEAD
=======

import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.repository.ApplicationUserRepository;
import co.edu.unal.se1.dataAccess.repository.SavingsAccountRepository;

public class SavingsAccountController extends Controller{

    private SavingsAccountRepository savingsAccountRepository;
    private ApplicationUserRepository applicationUserRepository;

    public SavingsAccountController(Context context) {
        super(context);
<<<<<<< HEAD
=======

        savingsAccountRepository = new SavingsAccountRepository(context);

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
    }

    public void createSavingsAccount(SavingsAccount account, Context context) {

<<<<<<< HEAD
        savingsAccountRepository = new SavingsAccountRepository(context);
        savingsAccountRepository.createSavingsAccount(account);
        System.out.println("¡Cuenta creada satisfactoriamente!");
    }
=======

        savingsAccountRepository.createSavingsAccount(account);
        System.out.println("¡Cuenta creada satisfactoriamente!");
    }
    public SavingsAccount getAccount(int id,Context context){

        return savingsAccountRepository.getSavingsAccountById(id);
    }
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

    public boolean sendMoney(int sourceId, int targetId, double value, Context context) {

        savingsAccountRepository = new SavingsAccountRepository(context);
        applicationUserRepository=new ApplicationUserRepository(context);

        final ApplicationUser sourceUser = applicationUserRepository.getUserById(sourceId);
        final SavingsAccount sourceAccount = savingsAccountRepository.getSavingsAccountById(sourceUser.getSavingsAccount());

        System.out.println("Source User - ID: " + sourceUser.getAppUserId() +
                ", Name: " + sourceUser.getAppUserName()+
                ", Account: " + sourceUser.getSavingsAccount()+
                ", Balance: "+sourceAccount.getBalance());

        if (savingsAccountRepository.getSavingsAccountById(sourceUser.getSavingsAccount()).getBalance() >= value) {

            final ApplicationUser targetUser = applicationUserRepository.getUserById(targetId);
            final SavingsAccount targetAccount=savingsAccountRepository.getSavingsAccountById(targetUser.getSavingsAccount());

            System.out.println("Target User - ID: " + targetUser.getAppUserId() +
                    ", Name: " + targetUser.getAppUserName() +
                    ", Account: " + targetUser.getSavingsAccount()+
                    ", Balance: "+targetAccount.getBalance());

            sourceAccount.setBalance(sourceAccount.getBalance() - value);
            targetAccount.setBalance(targetAccount.getBalance() + value);
            savingsAccountRepository.updateSavingsAccount(sourceAccount);
            savingsAccountRepository.updateSavingsAccount(targetAccount);

            final ApplicationUser updatedSourceUser = applicationUserRepository.getUserById(sourceId);
            final SavingsAccount updatedSourceAccount = savingsAccountRepository.getSavingsAccountById(updatedSourceUser.getSavingsAccount());

            System.out.println("Source User (updated) - ID: " + updatedSourceUser.getAppUserId() +
                    ", Name: " + updatedSourceUser.getAppUserName() +
                    ", Account: " + updatedSourceUser.getSavingsAccount()+
                    ", Balance: "+updatedSourceAccount.getBalance());

            final ApplicationUser updatedTargetUser = applicationUserRepository.getUserById(targetId);
            final SavingsAccount updatedTargetAccount = savingsAccountRepository.getSavingsAccountById(updatedTargetUser.getSavingsAccount());

            System.out.println("Target User (updated) - ID: " + updatedTargetUser.getAppUserId()+
                    ", Name: " + updatedTargetUser.getAppUserName()+
                    ", Account: " + updatedTargetUser.getSavingsAccount()+
                    ", Balance: " + updatedTargetAccount.getBalance());

            return true;

        } else {

            return false;
        }

    }
<<<<<<< HEAD
=======
    public SavingsAccount extractSavingsAccountById(ApplicationAccount appAcc) {
        return savingsAccountRepository.getSavingsAccountById(appAcc.getSavingsAccount());



    }
    public int extractOwner(SavingsAccount acc) {

        return acc.getOwner();

    }
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
}

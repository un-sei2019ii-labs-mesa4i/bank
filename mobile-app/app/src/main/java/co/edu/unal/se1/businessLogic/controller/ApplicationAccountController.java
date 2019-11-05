package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
import java.util.ArrayList;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;

public class ApplicationAccountController extends Controller {
    private ApplicationAccountRepository applicationAccountRepository;

    public ApplicationAccountController(Context context) {
        super(context);
    }

    public void createApplicationAccount(ApplicationAccount applicationAccount, Context context) {
        applicationAccountRepository = new ApplicationAccountRepository(context);
        applicationAccountRepository.createAppAccount((applicationAccount));

        System.out.println("¡Cuenta en la aplicacion creada satisfactoriamente!");
    }
    public ArrayList<ApplicationAccount> extractAllAppAccounts(){
        return (ArrayList)applicationAccountRepository.getAllAppAccounts();
    }
    public ApplicationAccount extractUserByEmail(String eMail) {
        return  applicationAccountRepository.getUserByEmail(eMail);

    }
    public boolean verifyLogin(ApplicationAccount appAcc, int pass) {
        if(appAcc.getPassword()==pass) return true;
        else return false;
    }
}






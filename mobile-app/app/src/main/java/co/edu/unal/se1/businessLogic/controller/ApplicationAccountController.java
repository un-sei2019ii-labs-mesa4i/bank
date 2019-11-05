package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
<<<<<<< HEAD

import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;
import co.edu.unal.se1.dataAccess.repository.ApplicationUserRepository;
import co.edu.unal.se1.dataAccess.repository.Repository;
=======
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import co.edu.unal.se1.dataAccess.model.ApplicationAccount;

import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

public class ApplicationAccountController extends Controller {
    private ApplicationAccountRepository applicationAccountRepository;

    public ApplicationAccountController(Context context) {
        super(context);
<<<<<<< HEAD
=======
        applicationAccountRepository = new ApplicationAccountRepository(context);
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
    }

    public void createApplicationAccount(ApplicationAccount applicationAccount, Context context) {

<<<<<<< HEAD
        applicationAccountRepository = new ApplicationAccountRepository(context);
=======

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
        //applicationUserRepository.database= super.repository.database;//revisar como estaba antes
        applicationAccountRepository.createAppAccount((applicationAccount));

        System.out.println("¡Cuenta en la aplicacion creada satisfactoriamente!");
    }
<<<<<<< HEAD


}
=======
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




>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

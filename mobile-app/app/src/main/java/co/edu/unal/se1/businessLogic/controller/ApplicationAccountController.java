package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
<<<<<<< HEAD
import java.util.ArrayList;
=======
<<<<<<< HEAD
import android.widget.ArrayAdapter;

import java.util.ArrayList;
=======
>>>>>>> ncontrerasn-feature

>>>>>>> 45021a8eb130fc53d36462c321d8eaab739a61b4
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;

public class ApplicationAccountController extends Controller {
    private ApplicationAccountRepository applicationAccountRepository;

    public ApplicationAccountController(Context context) {
        super(context);
<<<<<<< HEAD
        applicationAccountRepository = new ApplicationAccountRepository(context);
=======
>>>>>>> ncontrerasn-feature
    }

    public void createApplicationAccount(ApplicationAccount applicationAccount, Context context) {
<<<<<<< HEAD
        applicationAccountRepository = new ApplicationAccountRepository(context);
=======

<<<<<<< HEAD

=======
        applicationAccountRepository = new ApplicationAccountRepository(context);
>>>>>>> ncontrerasn-feature
        //applicationUserRepository.database= super.repository.database;//revisar como estaba antes
>>>>>>> 45021a8eb130fc53d36462c321d8eaab739a61b4
        applicationAccountRepository.createAppAccount((applicationAccount));

        System.out.println("¡Cuenta en la aplicacion creada satisfactoriamente!");
    }
<<<<<<< HEAD
    public ArrayList<ApplicationAccount> extractAllAppAccounts(){
        return (ArrayList)applicationAccountRepository.getAllAppAccounts();
    }
    public ApplicationAccount extractUserByEmail(String eMail) {
        return  applicationAccountRepository.getUserByEmail(eMail);
=======
<<<<<<< HEAD
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




=======
>>>>>>> 45021a8eb130fc53d36462c321d8eaab739a61b4

    }
    public boolean verifyLogin(ApplicationAccount appAcc, int pass) {
        if(appAcc.getPassword()==pass) return true;
        else return false;
    }
}
<<<<<<< HEAD





=======
>>>>>>> ncontrerasn-feature
>>>>>>> 45021a8eb130fc53d36462c321d8eaab739a61b4

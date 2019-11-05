package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;
import co.edu.unal.se1.dataAccess.repository.ApplicationUserRepository;
import co.edu.unal.se1.dataAccess.repository.Repository;

public class ApplicationAccountController extends Controller {
    private ApplicationAccountRepository applicationAccountRepository;

    public ApplicationAccountController(Context context) {
        super(context);
    }

    public void createApplicationAccount(ApplicationAccount applicationAccount, Context context) {

        applicationAccountRepository = new ApplicationAccountRepository(context);
        //applicationUserRepository.database= super.repository.database;//revisar como estaba antes
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





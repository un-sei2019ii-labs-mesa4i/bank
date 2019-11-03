package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;

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


}

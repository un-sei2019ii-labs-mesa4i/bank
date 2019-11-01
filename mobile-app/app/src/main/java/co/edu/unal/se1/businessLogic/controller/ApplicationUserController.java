package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;

import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.repository.ApplicationUserRepository;
import co.edu.unal.se1.dataAccess.repository.Repository;

public class ApplicationUserController extends Controller {

    private ApplicationUserRepository applicationUserRepository;

    public ApplicationUserController(Context context) {
        super(context);
    }

    public void createApplicationUser(ApplicationUser applicationUser, Context context) {

        applicationUserRepository = new ApplicationUserRepository(context);
        applicationUserRepository.database= super.repository.database;//revisar como estaba antes
        applicationUserRepository.createUser(applicationUser);
        System.out.println("¡Usuario creado satisfactoriamente!");
    }

}
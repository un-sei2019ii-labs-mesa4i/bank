package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.repository.ApplicationUserRepository;

public class ApplicationUserController extends Controller {

    private ApplicationUserRepository applicationUserRepository;

    public ApplicationUserController(Context context) {
        super(context);
    }

    public void createApplicationUser(ApplicationUser applicationUser, Context context) {

        applicationUserRepository = new ApplicationUserRepository(context);
        applicationUserRepository.createUser(applicationUser);
        System.out.println("¡Usuario creado satisfactoriamente!");
    }

    public ApplicationUser getUser(int userId,Context context){
        applicationUserRepository = new ApplicationUserRepository(context);
        ApplicationUser user=applicationUserRepository.getUserById(userId);
        return user;
    }
}
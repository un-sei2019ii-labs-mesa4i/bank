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
<<<<<<< HEAD
        //applicationUserRepository.database= super.repository.database;//revisar como estaba antes
        applicationUserRepository.createUser(applicationUser);
        System.out.println("¡Usuario creado satisfactoriamente!");
    }
=======
        applicationUserRepository.createUser(applicationUser);
        System.out.println("¡Usuario creado satisfactoriamente!");
    }

    public ApplicationUser getUser(int userId,Context context){
        applicationUserRepository = new ApplicationUserRepository(context);
        ApplicationUser user=applicationUserRepository.getUserById(userId);
        return user;
    }
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
}
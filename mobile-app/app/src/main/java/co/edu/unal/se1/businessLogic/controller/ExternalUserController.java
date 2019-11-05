package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
import co.edu.unal.se1.dataAccess.model.ExternalUser;
import co.edu.unal.se1.dataAccess.repository.ExternalUserRepository;

public class ExternalUserController extends Controller {

    private ExternalUserRepository externalUserRepository;

    public ExternalUserController(Context context) {
        super(context);
    }

    public void createExternalUser(ExternalUser externalUser, Context context) {

        externalUserRepository = new ExternalUserRepository(context);
        externalUserRepository.createExternalUser(externalUser);
        System.out.println("¡Usuario creado satisfactoriamente!");
    }
}

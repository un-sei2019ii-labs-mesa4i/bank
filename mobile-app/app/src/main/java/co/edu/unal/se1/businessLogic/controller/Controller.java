package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
import co.edu.unal.se1.dataAccess.repository.Repository;

public class Controller {

    public Repository repository;

    public Controller(Context context) {
        repository = new Repository(context);
    }
}

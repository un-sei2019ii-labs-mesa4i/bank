package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;

public class Repository {

    private String DB_NAME = "se1_db_bank";
    public Database database;

    public Repository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }


}
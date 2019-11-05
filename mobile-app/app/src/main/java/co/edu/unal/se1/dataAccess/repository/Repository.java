package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;

import co.edu.unal.se1.dataAccess.db.Database;

public class Repository {

    private String DB_NAME = "se1_db_bank";
    public Database database;

    public Repository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }
}
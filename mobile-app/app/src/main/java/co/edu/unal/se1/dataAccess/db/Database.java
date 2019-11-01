package co.edu.unal.se1.dataAccess.db;

import androidx.room.RoomDatabase;

import co.edu.unal.se1.dataAccess.dao.UserDao;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;

@androidx.room.Database(entities = {ApplicationUser.class}, version = 1)
public abstract class Database extends RoomDatabase {

    public abstract UserDao userDao();
}
package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;

public class UserRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public UserRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<ApplicationUser> getAllUsers() {
        return database.userDao().getAllUsers();
    }

    public ApplicationUser getUserById(int id) {
        return database.userDao().getUserById(id);
    }

    public void createUser(final ApplicationUser user) {
        database.userDao().createUser(user);
    }

    public void updateUser(ApplicationUser user) {
        database.userDao().updateUser(user);
    }

    public void deleteUser(int id) {
        ApplicationUser user = database.userDao().getUserById(id);
        database.userDao().deleteUser(user);
    }
}
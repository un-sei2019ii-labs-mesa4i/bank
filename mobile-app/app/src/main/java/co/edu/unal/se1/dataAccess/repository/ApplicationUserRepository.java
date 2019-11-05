package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import java.util.List;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;

public class ApplicationUserRepository extends  Repository{

    public ApplicationUserRepository(Context context) {
        super(context);
    }

    public List<ApplicationUser> getAllApplicationUsers() {
        return database.applicationUserDao().getAllUsers();
    }

    public ApplicationUser getUserById(int id) {
        return database.applicationUserDao().getUserById(id);
    }

    public void createUser(final ApplicationUser user) {
        database.applicationUserDao().createUser(user);
    }

    public void updateUser(ApplicationUser user) {

        database.applicationUserDao().updateUser(user);
    }

    public void deleteUser(int id) {
        ApplicationUser user = database.applicationUserDao().getUserById(id);
        database.applicationUserDao().deleteUser(user);
    }
}

package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import java.util.List;
import co.edu.unal.se1.dataAccess.model.ExternalUser;

public class ExternalUserRepository extends Repository {

    public ExternalUserRepository(Context context) {
        super(context);
    }

    public List<ExternalUser> getAllExternalUsers() {
        return database.externalUserDao().getAllUsers();
    }

    public ExternalUser getExternalUserById(int id) {
        return database.externalUserDao().getExternalUserById(id);
    }

    public void createExternalUser(final ExternalUser user) {
        database.externalUserDao().createExternalUser(user);
    }

    public void updateExternalUser(ExternalUser user) {
        database.externalUserDao().updateExternalUser(user);
    }

    public void deleteExternalUser(int id) {
        ExternalUser user = database.externalUserDao().getExternalUserById(id);
        database.externalUserDao().deleteExternalUser(user);
    }

    /*





    */
}

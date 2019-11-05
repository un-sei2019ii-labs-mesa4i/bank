package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;

import java.util.List;

import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;

<<<<<<< HEAD
public class ApplicationAccountRepository extends Repository {
=======
public class ApplicationAccountRepository extends  Repository {
>>>>>>> ncontrerasn-feature
    public ApplicationAccountRepository(Context context) {
        super(context);
    }

    public List<ApplicationAccount> getAllAppAccounts() {
        return database.applicationAccountDao().getAllAppAccounts();
    }

    public ApplicationAccount getUserByEmail(String email) {
        return database.applicationAccountDao().getUserByEmail(email);
    }

    public void createAppAccount(final ApplicationAccount appAccount) {
        database.applicationAccountDao().createAppAccount(appAccount);
    }

    public void updateAppAccount(ApplicationAccount appAccount) {
        database.applicationAccountDao().updateAppAccount(appAccount);
    }

    public void deleteUser(String email) {
        ApplicationAccount appAccount = database.applicationAccountDao().getUserByEmail(email);
        database.applicationAccountDao().deleteAppAccount(appAccount);
    }
}

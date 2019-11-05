package co.edu.unal.se1.dataAccess.db;

import androidx.room.RoomDatabase;

import co.edu.unal.se1.dataAccess.dao.ApplicationAccountDao;
import co.edu.unal.se1.dataAccess.dao.ApplicationUserDao;
import co.edu.unal.se1.dataAccess.dao.ExternalUserDao;
import co.edu.unal.se1.dataAccess.dao.SavingsAccountDao;
import co.edu.unal.se1.dataAccess.dao.TransferDao;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.ExternalUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.model.Transfer;
<<<<<<< HEAD

@androidx.room.Database(entities = {ApplicationUser.class, SavingsAccount.class, Transfer.class, ApplicationAccount.class, ExternalUser.class}, version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {
    public abstract ApplicationUserDao applicationUserDao();
    public abstract SavingsAccountDao savingsAccountDao();
    public abstract TransferDao transferDao();
    public abstract ApplicationAccountDao applicationAccountDao();
    public abstract ExternalUserDao externalUserDao();
=======


@androidx.room.Database(entities = {ApplicationUser.class, SavingsAccount.class, Transfer.class, ApplicationAccount.class, ExternalUser.class}, version = 1, exportSchema = false)



public abstract class Database extends RoomDatabase {
    public abstract ApplicationUserDao applicationUserDao();

    public abstract SavingsAccountDao savingsAccountDao();
    public abstract TransferDao transferDao();
    public abstract ApplicationAccountDao applicationAccountDao();

    public abstract ExternalUserDao externalUserDao();

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
}
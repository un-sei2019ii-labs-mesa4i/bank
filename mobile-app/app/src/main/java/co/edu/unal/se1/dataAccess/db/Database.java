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
=======

@androidx.room.Database(entities = {ApplicationUser.class, SavingsAccount.class, Transfer.class, ApplicationAccount.class}, version = 1,exportSchema = false)
>>>>>>> ncontrerasn-feature
public abstract class Database extends RoomDatabase {
    public abstract ApplicationUserDao applicationUserDao();

    public abstract SavingsAccountDao savingsAccountDao();
    public abstract TransferDao transferDao();
    public abstract ApplicationAccountDao applicationAccountDao();
<<<<<<< HEAD
    public abstract ExternalUserDao externalUserDao();
=======
>>>>>>> ncontrerasn-feature
}
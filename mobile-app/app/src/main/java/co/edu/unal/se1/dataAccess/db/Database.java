package co.edu.unal.se1.dataAccess.db;

import androidx.room.RoomDatabase;
import co.edu.unal.se1.dataAccess.dao.ApplicationUserDao;
import co.edu.unal.se1.dataAccess.dao.SavingsAccountDao;
import co.edu.unal.se1.dataAccess.dao.TransferDao;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.model.Transfer;


@androidx.room.Database(entities = {ApplicationUser.class, SavingsAccount.class, Transfer.class}, version = 1,exportSchema = false)
public abstract class Database extends RoomDatabase {

    public abstract ApplicationUserDao applicationUserDao();
    public abstract SavingsAccountDao savingsAccountDao();
    public abstract TransferDao transferDao();
}
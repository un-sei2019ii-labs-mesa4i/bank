package co.edu.unal.se1.dataAccess.db;

import androidx.room.RoomDatabase;
import co.edu.unal.se1.dataAccess.dao.ApplicationUserDao;
import co.edu.unal.se1.dataAccess.dao.SavingsAccountDao;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;

@androidx.room.Database(entities = {ApplicationUser.class, SavingsAccount.class}, version = 1,exportSchema = false)
public abstract class Database extends RoomDatabase {

    public abstract ApplicationUserDao applicationUserDao();
    public abstract SavingsAccountDao savingsAccountDao();
}
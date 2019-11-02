package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;

@Dao
public interface SavingsAccountDao {

    @Query("SELECT * FROM savingsaccount")
    List<SavingsAccount> getAllSavingsAccounts();

    @Query("SELECT * FROM savingsaccount WHERE savingsAccountId = :id")
    SavingsAccount getSavingsAccountById(int id);

    @Insert
    void createAccount(SavingsAccount savingsAccount);

    @Update
    void updateAccount(SavingsAccount savingsAccount);

    @Delete
    void deleteAccount(SavingsAccount savingsAccount);
}
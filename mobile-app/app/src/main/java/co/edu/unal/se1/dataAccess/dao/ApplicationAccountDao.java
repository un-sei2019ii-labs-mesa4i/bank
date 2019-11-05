package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;



@Dao
public interface ApplicationAccountDao {
    @Query("SELECT * FROM applicationaccount")
    List<ApplicationAccount> getAllAppAccounts();

    @Query("SELECT * FROM applicationaccount WHERE appAccountEmail = :email")
    ApplicationAccount getUserByEmail(String email);

    @Insert
    void createAppAccount(ApplicationAccount appAccount);

    @Update
    void updateAppAccount( ApplicationAccount appAccount);

    @Delete
    void deleteAppAccount( ApplicationAccount appAccount);



}

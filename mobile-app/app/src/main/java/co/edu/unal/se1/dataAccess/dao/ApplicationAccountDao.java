package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
<<<<<<< HEAD
import java.util.List;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;

=======

import java.util.List;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;



>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
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

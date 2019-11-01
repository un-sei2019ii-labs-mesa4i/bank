package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.ApplicationUser;

@Dao
public interface ApplicationUserDao {

    @Query("SELECT * FROM applicationuser")
    List<ApplicationUser> getAllUsers();

    @Query("SELECT * FROM applicationuser WHERE appUserId = :id")
    ApplicationUser getUserById(int id);

    @Insert
    void createUser(ApplicationUser user);

    @Update
    void updateUser(ApplicationUser user);

    @Delete
    void deleteUser(ApplicationUser user);
}
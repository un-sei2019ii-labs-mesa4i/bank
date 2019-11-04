package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import co.edu.unal.se1.dataAccess.model.ExternalUser;

public interface ExternalUserDao {

    @Query("SELECT * FROM externaluser")
    List<ExternalUser> getAllUsers();

    @Query("SELECT * FROM externaluser WHERE externalUserId = :id")
    ExternalUser getExternalUserById(int id);

    @Insert
    void createExternalUser(ExternalUser user);

    @Update
    void updateExternalUser(ExternalUser user);

    @Delete
    void deleteExternalUser(ExternalUser user);
}

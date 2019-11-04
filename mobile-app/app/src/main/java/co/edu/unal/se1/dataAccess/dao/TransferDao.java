package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import co.edu.unal.se1.dataAccess.model.Transfer;

@Dao
public interface TransferDao {

    @Query("SELECT * FROM Transfer")
    List<Transfer> getAllTransfers();

    @Query("SELECT transferId FROM Transfer")
    List<Integer> getTransferIds();

    @Query("SELECT depositorId FROM Transfer")
    List<Integer> getTransferDepositors();

    @Query("SELECT receiverId FROM Transfer")
    List<Integer> getTransferReceivers();

    @Query("SELECT amount FROM Transfer")
    List<Double> getTransferAmount();

    @Query("SELECT * FROM transfer WHERE transferId = :id")
    Transfer getTransferById(int id);

    @Insert
    void createTransfer(Transfer transfer);

}

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

    @Query("SELECT * FROM transfer WHERE depositorId = :id")
    List<Transfer> getTransferByDepositorId(int id);

    @Insert
    void createTransfer(Transfer transfer);

}

package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import java.util.List;
import co.edu.unal.se1.dataAccess.model.Transfer;


public class TransferRepository extends Repository{

    public TransferRepository(Context context) {
        super(context);
    }

    public List<Transfer> getAllTransfers() {
        return database.transferDao().getAllTransfers();
    }

    public List<Transfer> getTransferByDepositorId(int id) {
        return database.transferDao().getTransferByDepositorId(id);
    }

    public void createTransfer(final Transfer transfer) {
        database.transferDao().createTransfer(transfer);
    }

}

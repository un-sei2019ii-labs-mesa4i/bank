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

    public List<Integer> getTransferIds() {
        return database.transferDao().getTransferIds();
    }

    public List<Integer> getTransferDepositors() {
        return database.transferDao().getTransferDepositors();
    }

    public List<Integer> getTransferReceivers() {
        return database.transferDao().getTransferReceivers();
    }

    public List<Double> getTransferAmount() {
        return database.transferDao().getTransferAmount();
    }

    public Transfer getTransferById(int id) {
        return database.transferDao().getTransferById(id);
    }

    public void createTransfer(final Transfer transfer) {
        database.transferDao().createTransfer(transfer);
    }

}

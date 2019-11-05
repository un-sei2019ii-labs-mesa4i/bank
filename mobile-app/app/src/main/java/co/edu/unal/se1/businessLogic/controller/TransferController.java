package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
<<<<<<< HEAD
=======

import java.util.ArrayList;

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
import co.edu.unal.se1.dataAccess.model.Transfer;
import co.edu.unal.se1.dataAccess.repository.TransferRepository;

public class TransferController extends Controller{

    private TransferRepository transferRepository;

    public TransferController(Context context) {
        super(context);
    }

    public void createTransfer(Transfer transfer, Context context) {

        transferRepository = new TransferRepository(context);
        transferRepository.createTransfer(transfer);
        System.out.println("¡Transacción creada satisfactoriamente!");
    }

<<<<<<< HEAD
=======
    public ArrayList transferListByUser(int userId, Context context){
        transferRepository = new TransferRepository(context);
        ArrayList<Transfer> userTransfers=(ArrayList)transferRepository.getTransferByDepositorId(userId);
        ArrayList<String> infoArray = new ArrayList<>();

        for (int i=0; i<userTransfers.size(); i++)
            infoArray.add(userTransfers.get(i).getTransferId() + " - "+userTransfers.get(i).getReceiverId()+" - "+userTransfers.get(i).getAmount());

        return infoArray;
    }

    public ArrayList transferList(Context context){
        transferRepository = new TransferRepository(context);
        ArrayList<Transfer> userTransfers=(ArrayList)transferRepository.getAllTransfers();
        return userTransfers;
    }

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
}


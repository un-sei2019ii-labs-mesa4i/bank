package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
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

}


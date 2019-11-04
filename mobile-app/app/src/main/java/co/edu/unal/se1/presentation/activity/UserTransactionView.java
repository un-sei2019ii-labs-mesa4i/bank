package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;
import co.edu.unal.se1.businessLogic.controller.TransferController;
import co.edu.unal.se1.dataAccess.model.Transfer;

public class UserTransactionView extends AppCompatActivity {

    private SavingsAccountController savingsAccountController;
    private TransferController transferController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_transaction_view);

        final int userId=getIntent().getIntExtra("usuario",0);

        final TextView targetIdInput = findViewById(R.id.receiverUser);
        final TextView valueInput = findViewById(R.id.amountUser);

        Button sendMoneyButton = findViewById(R.id.transferUserBtn);
        sendMoneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                savingsAccountController = new SavingsAccountController(getApplicationContext());
                transferController=new TransferController(getApplicationContext());

                int sourceId = userId;
                int targetId = Integer.parseInt(targetIdInput.getText().toString());
                double value = Double.parseDouble(valueInput.getText().toString());

                boolean transaction = savingsAccountController.sendMoney(sourceId, targetId, value, getApplicationContext());

                if (transaction) {
                    Transfer transfer=new Transfer();
                    transfer.setAmount(value);
                    transfer.setReceiverId(targetId);
                    transfer.setDepositorId(sourceId);
                    transferController.createTransfer(transfer,getApplicationContext());

                    System.out.println("¡Transacción satisfactoria!");
                } else {
                    System.out.println("¡Transacción no satisfactoria!");
                }
            }
        });

        Button backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),UserView.class);
                i.putExtra("usuario",userId);
                startActivity(i);
                finish();
            }
        });

    }
}
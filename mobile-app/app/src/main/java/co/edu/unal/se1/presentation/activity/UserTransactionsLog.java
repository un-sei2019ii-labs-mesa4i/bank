package co.edu.unal.se1.presentation.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import co.edu.unal.se1.R;
<<<<<<< HEAD
=======
import co.edu.unal.se1.businessLogic.controller.TransferController;
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
import co.edu.unal.se1.dataAccess.model.Transfer;
import co.edu.unal.se1.dataAccess.repository.TransferRepository;

public class UserTransactionsLog extends AppCompatActivity {

<<<<<<< HEAD
    private TransferRepository transferRepository;
=======
    private TransferController transferController;
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_transactions_log);

        final int userId=getIntent().getIntExtra("usuario",0);
        final ListView list = findViewById(R.id.list);
<<<<<<< HEAD
        transferRepository = new TransferRepository(getApplicationContext());
        ArrayList<Transfer> userTransfers=(ArrayList)transferRepository.getTransferByDepositorId(userId);
        ArrayList<String> infoArray = new ArrayList<>();

        for (int i=0; i<userTransfers.size(); i++)
            infoArray.add(userTransfers.get(i).getTransferId() + " - "+userTransfers.get(i).getReceiverId()+" - "+userTransfers.get(i).getAmount());
=======
        transferController=new TransferController(getApplicationContext());
        ArrayList<String> infoArray=transferController.transferListByUser(userId,getApplicationContext());
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, infoArray);
        list.setAdapter(adapter);

        Button backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), UserView.class);
                i.putExtra("usuario",userId);
                startActivity(i);
                finish();
            }
        });
    }
}
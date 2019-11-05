package co.edu.unal.se1.presentation.activity;

<<<<<<< HEAD
import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;
import co.edu.unal.se1.businessLogic.controller.TransferController;
import co.edu.unal.se1.dataAccess.dao.TransferDao;
import co.edu.unal.se1.dataAccess.model.Transfer;
import co.edu.unal.se1.dataAccess.repository.TransferRepository;
=======
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.TransferController;
import co.edu.unal.se1.dataAccess.model.Transfer;
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
import java.util.ArrayList;

import android.widget.ArrayAdapter;

public class TransactionsLog extends AppCompatActivity {

<<<<<<< HEAD
    private TransferRepository transferRepository;
=======
    private TransferController transferController;
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transactions_log);

<<<<<<< HEAD
        transferRepository=new TransferRepository(getApplicationContext());
        final ListView list=findViewById(R.id.list);
        ArrayList<Transfer> transferArrayList=(ArrayList) transferRepository.getAllTransfers();
=======
        transferController=new TransferController(getApplicationContext());
        final ListView list=findViewById(R.id.list);
        ArrayList<Transfer> transferArrayList=(ArrayList) transferController.transferList(getApplicationContext());
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
        ArrayList<String> transfersData=new ArrayList<>();

        for ( int i=0; i<transferArrayList.size();i++)
            transfersData.add(transferArrayList.get(i).getTransferId()+ " "+ transferArrayList.get(i).getDepositorId()+ " "+
                    transferArrayList.get(i).getReceiverId()+ " "+ transferArrayList.get(i).getAmount());

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, transfersData);
        list.setAdapter(adapter);

        Button backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),AdminView.class);
                startActivity(i);
                finish();
            }
        });

    }
}
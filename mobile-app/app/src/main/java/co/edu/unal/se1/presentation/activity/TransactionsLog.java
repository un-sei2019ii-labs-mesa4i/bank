package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.TransferController;
import co.edu.unal.se1.dataAccess.model.Transfer;
import java.util.ArrayList;

import android.widget.ArrayAdapter;

public class TransactionsLog extends AppCompatActivity {

    private TransferController transferController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transactions_log);

        transferController=new TransferController(getApplicationContext());
        final ListView list=findViewById(R.id.list);
        ArrayList<Transfer> transferArrayList=(ArrayList) transferController.transferList(getApplicationContext());
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
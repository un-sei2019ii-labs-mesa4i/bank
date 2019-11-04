package co.edu.unal.se1.presentation.activity;

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
import java.util.ArrayList;

import android.widget.ArrayAdapter;

public class TransactionsLog extends AppCompatActivity {

    private TransferRepository transferRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transactions_log);

        transferRepository=new TransferRepository(getApplicationContext());
        final ListView list=findViewById(R.id.list);
        ArrayList<Integer> id=new ArrayList<>();
        ArrayList<Integer> depositor=new ArrayList<>();
        ArrayList<Integer> receiver=new ArrayList<>();
        ArrayList<Double> amount=new ArrayList<>();
        ArrayList<String> mixed=new ArrayList<>();

        id= (ArrayList)transferRepository.getTransferIds();
        depositor=(ArrayList)transferRepository.getTransferDepositors();
        receiver=(ArrayList)transferRepository.getTransferReceivers();
        amount=(ArrayList)transferRepository.getTransferAmount();

        for (int i=0; i<=id.size()-1; i++)
            mixed.add(id.get(i) + " - "+depositor.get(i)+" - "+receiver.get(i)+" - "+amount.get(i));

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mixed);
        list.setAdapter(adapter);

        Button backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),TransactionView.class);
                startActivity(i);
            }
        });

    }
}
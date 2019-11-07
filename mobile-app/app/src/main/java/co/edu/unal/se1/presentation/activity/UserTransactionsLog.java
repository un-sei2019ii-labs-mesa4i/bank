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
import co.edu.unal.se1.businessLogic.controller.TransferController;
import co.edu.unal.se1.dataAccess.model.Transfer;
import co.edu.unal.se1.dataAccess.repository.TransferRepository;

public class UserTransactionsLog extends AppCompatActivity {

    private TransferController transferController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_transactions_log);

        final int userId=getIntent().getIntExtra("usuario",0);
        final ListView list = findViewById(R.id.list);
        transferController=new TransferController(getApplicationContext());
        ArrayList<String> infoArray=transferController.transferListByUser(userId,getApplicationContext());

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
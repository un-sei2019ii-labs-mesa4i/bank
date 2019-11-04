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
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;
import co.edu.unal.se1.dataAccess.repository.TransferRepository;

public class AppAccountsLog extends AppCompatActivity {
    private ApplicationAccountRepository appAccountRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appaccount_log);

        appAccountRepository = new ApplicationAccountRepository(getApplicationContext());
        final ListView list = findViewById(R.id.list);
        ArrayList<ApplicationAccount> appAccountObjects=new ArrayList<>();
        ArrayList<String> accountData = new ArrayList<>();
        ArrayList<String> mixed = new ArrayList<>();

        appAccountObjects = (ArrayList) appAccountRepository.getAllAppAccounts();
        //esta es otra manera de halar los datos de la tabla
        for ( int i=0; i<appAccountObjects.size();i++){
            accountData.add(appAccountObjects.get(i).getAppAccountEmail()+ " "+
                    appAccountObjects.get(i).getPassword()+ " "+
                    appAccountObjects.get(i).getSavingsAccount());
        }

        for (int i = 0; i <= accountData.size() - 1; i++)
            mixed.add(accountData.get(i));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mixed);
        list.setAdapter(adapter);

        Button backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}

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
import co.edu.unal.se1.businessLogic.controller.ApplicationAccountController;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;

public class AppAccountsLog extends AppCompatActivity {

    private ApplicationAccountController appAccountController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appaccount_log);
        appAccountController=new ApplicationAccountController(getApplicationContext());


        final ListView list = findViewById(R.id.list);
        ArrayList<ApplicationAccount> appAccountObjects=(ArrayList) appAccountController.extractAllAppAccounts();
        ArrayList<String> accountData = new ArrayList<>();

        for ( int i=0; i<appAccountObjects.size();i++)
            accountData.add(appAccountObjects.get(i).getAppAccountEmail()+ " "+ appAccountObjects.get(i).getPassword()+ " "+
                    appAccountObjects.get(i).getSavingsAccount());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, accountData);
        list.setAdapter(adapter);

        Button backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AdminView.class);
                startActivity(i);
                finish();
            }
        });
    }
}


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
import co.edu.unal.se1.businessLogic.controller.ApplicationAccountController;
=======
<<<<<<< HEAD
import co.edu.unal.se1.businessLogic.controller.ApplicationAccountController;
=======
>>>>>>> ncontrerasn-feature
>>>>>>> 45021a8eb130fc53d36462c321d8eaab739a61b4
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;

public class AppAccountsLog extends AppCompatActivity {
<<<<<<< HEAD

    private ApplicationAccountController appAccountController;
=======
<<<<<<< HEAD

    private ApplicationAccountController appAccountController;
=======
    private ApplicationAccountRepository appAccountRepository;
>>>>>>> ncontrerasn-feature
>>>>>>> 45021a8eb130fc53d36462c321d8eaab739a61b4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appaccount_log);
<<<<<<< HEAD
        appAccountController=new ApplicationAccountController(getApplicationContext());

=======
<<<<<<< HEAD
    appAccountController=new ApplicationAccountController(getApplicationContext());


        final ListView list = findViewById(R.id.list);
        ArrayList<ApplicationAccount> appAccountObjects=(ArrayList) appAccountController.extractAllAppAccounts();
=======
>>>>>>> 45021a8eb130fc53d36462c321d8eaab739a61b4

        final ListView list = findViewById(R.id.list);
<<<<<<< HEAD
        ArrayList<ApplicationAccount> appAccountObjects=(ArrayList) appAccountController.extractAllAppAccounts();
=======
        ArrayList<ApplicationAccount> appAccountObjects=(ArrayList) appAccountRepository.getAllAppAccounts();
>>>>>>> ncontrerasn-feature
>>>>>>> 45021a8eb130fc53d36462c321d8eaab739a61b4
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


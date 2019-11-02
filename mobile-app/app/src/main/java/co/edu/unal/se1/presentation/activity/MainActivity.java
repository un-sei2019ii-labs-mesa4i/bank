package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.ApplicationUserController;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;

public class MainActivity extends AppCompatActivity {

    private ApplicationUserController applicationUserController;
    private SavingsAccountController savingsAccountController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText idInput = findViewById(R.id.depositor);
        final EditText nameInput = findViewById(R.id.receiver);
        final EditText accountInput = findViewById(R.id.amount);
        final EditText balanceInput = findViewById(R.id.balance);

        Button createButton = findViewById(R.id.createBtn);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ApplicationUser user = new ApplicationUser();
                SavingsAccount account=new SavingsAccount();

                user.setAppUserId(Integer.parseInt(idInput.getText().toString()));
                user.setAppUserName(nameInput.getText().toString());
                user.setSavingsAccount(account);

                account.setSavingsAccountId(Integer.parseInt(accountInput.getText().toString()));
                account.setBalance(Double.parseDouble(balanceInput.getText().toString()));
                //account.setBalance(100);
                account.setAppAccount("");
                account.setOwner(user);

                applicationUserController = new ApplicationUserController(getApplicationContext());
                savingsAccountController = new SavingsAccountController(getApplicationContext());

                applicationUserController.createApplicationUser(user, getApplicationContext());
                savingsAccountController.createSavingsAccount(account, getApplicationContext());
            }
        });

        Button tranferButton = findViewById(R.id.TransferBtn);
        tranferButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),TransactionView.class);
                startActivity(i);
            }
        });
    }
}
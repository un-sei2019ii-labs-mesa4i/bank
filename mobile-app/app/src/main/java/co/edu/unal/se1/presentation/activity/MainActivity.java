package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.ApplicationAccountController;
import co.edu.unal.se1.businessLogic.controller.ApplicationUserController;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;

public class MainActivity extends AppCompatActivity {

    private ApplicationUserController applicationUserController;
    private SavingsAccountController savingsAccountController;
    private ApplicationAccountController applicationAccountController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText idInput = findViewById(R.id.depositor);
        final EditText nameInput = findViewById(R.id.receiver);
        final EditText accountInput = findViewById(R.id.amount);
        final EditText balanceInput = findViewById(R.id.balance);
        final EditText emailInput = findViewById(R.id.email);
        final EditText newPasswordInput = findViewById(R.id.newPassword);

        Button createButton = findViewById(R.id.createBtn);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ApplicationUser user = new ApplicationUser();
                SavingsAccount account=new SavingsAccount();
                ApplicationAccount appAccount= new ApplicationAccount();

                user.setAppUserId(Integer.parseInt(idInput.getText().toString()));
                user.setAppUserName(nameInput.getText().toString());
                user.setSavingsAccount(Integer.parseInt(accountInput.getText().toString()));

                account.setSavingsAccountId(Integer.parseInt(accountInput.getText().toString()));
                account.setBalance(Double.parseDouble(balanceInput.getText().toString()));
                account.setAppAccount("");
                account.setOwner(Integer.parseInt(idInput.getText().toString()));

                appAccount.setAppAccountEmail(emailInput.getText().toString());
                appAccount.setPassword(newPasswordInput.getText().toString());
                appAccount.setSavingsAccount(Integer.parseInt(accountInput.getText().toString()));

                applicationUserController = new ApplicationUserController(getApplicationContext());
                savingsAccountController = new SavingsAccountController(getApplicationContext());
                applicationAccountController=new ApplicationAccountController(getApplicationContext());

                savingsAccountController.createSavingsAccount(account, getApplicationContext());
                applicationUserController.createApplicationUser(user, getApplicationContext());
                applicationAccountController.createApplicationAccount(appAccount, getApplicationContext());
            }
        });

        Button transferButton = findViewById(R.id.transferBtn);
        transferButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),TransactionView.class);
                startActivity(i);
            }
        });
        Button appAccountsLogButton = findViewById(R.id.appAccountsLogButton);
        appAccountsLogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),AppAccountsLog.class);
                startActivity(i);
            }
        });
    }
}
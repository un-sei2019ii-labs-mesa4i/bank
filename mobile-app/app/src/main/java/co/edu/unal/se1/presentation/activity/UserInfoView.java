package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.ApplicationUserController;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;
import co.edu.unal.se1.dataAccess.repository.ApplicationUserRepository;
import co.edu.unal.se1.dataAccess.repository.SavingsAccountRepository;

public class UserInfoView extends AppCompatActivity {

    private ApplicationUserController applicationUserController;
    private SavingsAccountController savingsAccountController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_view);

        final int userId=getIntent().getIntExtra("usuario",0);

        applicationUserController=new ApplicationUserController(getApplicationContext());
        savingsAccountController=new SavingsAccountController(getApplicationContext());

        final TextView name=findViewById(R.id.nameUser);
        final TextView eMail=findViewById(R.id.eMailUser);
        final TextView savingsAcc=findViewById(R.id.savingsAccTV);
        final TextView balance=findViewById(R.id.balanceTV);

        ApplicationUser user=applicationUserController.getUser(userId,getApplicationContext());
        SavingsAccount savingsAccount=savingsAccountController.getAccount(user.getSavingsAccount(),getApplicationContext());

        name.setText(user.getAppUserName());
        eMail.setText(savingsAccount.getAppAccount());
        savingsAcc.setText(String.valueOf(user.getSavingsAccount()));
        balance.setText(String.valueOf(savingsAccount.getBalance()));

        Button backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),UserView.class);
                i.putExtra("usuario",userId);
                startActivity(i);
                finish();
            }
        });
    }
}
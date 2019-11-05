package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import co.edu.unal.se1.R;
<<<<<<< HEAD
=======
import co.edu.unal.se1.businessLogic.controller.ApplicationUserController;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
import co.edu.unal.se1.dataAccess.model.ApplicationUser;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;
import co.edu.unal.se1.dataAccess.repository.ApplicationUserRepository;
import co.edu.unal.se1.dataAccess.repository.SavingsAccountRepository;

public class UserInfoView extends AppCompatActivity {

<<<<<<< HEAD
    private ApplicationAccountRepository applicationAccountRepository;
    private SavingsAccountRepository savingsAccountRepository;
    private ApplicationUserRepository applicationUserRepository;
=======
    private ApplicationUserController applicationUserController;
    private SavingsAccountController savingsAccountController;
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_view);

        final int userId=getIntent().getIntExtra("usuario",0);

<<<<<<< HEAD
        applicationAccountRepository=new ApplicationAccountRepository(getApplicationContext());
        savingsAccountRepository=new SavingsAccountRepository(getApplicationContext());
        applicationUserRepository=new ApplicationUserRepository(getApplicationContext());
=======
        applicationUserController=new ApplicationUserController(getApplicationContext());
        savingsAccountController=new SavingsAccountController(getApplicationContext());
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

        final TextView name=findViewById(R.id.nameUser);
        final TextView eMail=findViewById(R.id.eMailUser);
        final TextView savingsAcc=findViewById(R.id.savingsAccTV);
        final TextView balance=findViewById(R.id.balanceTV);

<<<<<<< HEAD
        ApplicationUser user=applicationUserRepository.getUserById(userId);
        SavingsAccount savingsAccount=savingsAccountRepository.getSavingsAccountById(user.getSavingsAccount());
=======
        ApplicationUser user=applicationUserController.getUser(userId,getApplicationContext());
        SavingsAccount savingsAccount=savingsAccountController.getAccount(user.getSavingsAccount(),getApplicationContext());
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

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
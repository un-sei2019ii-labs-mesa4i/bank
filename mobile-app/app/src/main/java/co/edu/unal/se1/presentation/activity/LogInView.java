package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import co.edu.unal.se1.R;
<<<<<<< HEAD
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;
import co.edu.unal.se1.dataAccess.repository.SavingsAccountRepository;

public class LogInView extends AppCompatActivity {

    private ApplicationAccountRepository applicationAccountRepository;
    private SavingsAccountRepository savingsAccountRepository;
=======

import co.edu.unal.se1.businessLogic.controller.ApplicationAccountController;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;

import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;

public class LogInView extends AppCompatActivity {


    private ApplicationAccountController applicationAccountController;
    private SavingsAccountController savingsAccountController;

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

<<<<<<< HEAD
        applicationAccountRepository=new ApplicationAccountRepository(getApplicationContext());
        savingsAccountRepository=new SavingsAccountRepository(getApplicationContext());
=======

        applicationAccountController=new ApplicationAccountController(getApplicationContext());
        savingsAccountController =new SavingsAccountController(getApplicationContext());




>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0

        Button logInButton = findViewById(R.id.logInBtn);
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final TextView eMail = findViewById(R.id.Email);
                final TextView password = findViewById(R.id.Password);

<<<<<<< HEAD
                final ApplicationAccount appAcc=applicationAccountRepository.getUserByEmail(eMail.getText().toString());
                final int pass=Integer.parseInt(password.getText().toString());
                final String eMailAdmin =eMail.getText().toString();

=======

                final ApplicationAccount appAcc=applicationAccountController.extractUserByEmail(eMail.getText().toString());
                final int pass=Integer.parseInt(password.getText().toString());
                final String eMailAdmin =eMail.getText().toString();



>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
                if (eMailAdmin.equals("admin")&&pass==1234){
                    Intent i=new Intent(v.getContext(),AdminView.class);
                    startActivity(i);
                    finish();
<<<<<<< HEAD
                }else if(appAcc!=null && appAcc.getPassword()==pass){
                    SavingsAccount acc=savingsAccountRepository.getSavingsAccountById(appAcc.getSavingsAccount());
                    Intent i=new Intent(v.getContext(),UserView.class);
                    i.putExtra("usuario",acc.getOwner());
                    startActivity(i);
                    finish();
=======



                }else if(appAcc!=null && applicationAccountController.verifyLogin(appAcc,pass)){


                    SavingsAccount acc=savingsAccountController.extractSavingsAccountById(appAcc);
                    Intent i=new Intent(v.getContext(),UserView.class);
                    i.putExtra("usuario",savingsAccountController.extractOwner(acc));
                    startActivity(i);
                    finish();

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
                }else{
                    System.out.println("Usuario o contraseña incorrectas");
                }
            }
        });
    }
}
package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.ApplicationAccountController;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;

public class LogInView extends AppCompatActivity {

    private ApplicationAccountController applicationAccountController;
    private SavingsAccountController savingsAccountController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        applicationAccountController=new ApplicationAccountController(getApplicationContext());
        savingsAccountController =new SavingsAccountController(getApplicationContext());

        Button logInButton = findViewById(R.id.logInBtn);
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final TextView eMail = findViewById(R.id.Email);
                final TextView password = findViewById(R.id.Password);

                final ApplicationAccount appAcc=applicationAccountController.extractUserByEmail(eMail.getText().toString());
                final int pass=Integer.parseInt(password.getText().toString());
                final String eMailAdmin =eMail.getText().toString();

                if (eMailAdmin.equals("admin")&&pass==1234){
                    Intent i=new Intent(v.getContext(),AdminView.class);
                    startActivity(i);
                    finish();
                }else if(appAcc!=null && applicationAccountController.verifyLogin(appAcc,pass)){
                    SavingsAccount acc=savingsAccountController.extractSavingsAccountById(appAcc);
                    Intent i=new Intent(v.getContext(),UserView.class);
                    i.putExtra("usuario",savingsAccountController.extractOwner(acc));
                    startActivity(i);
                    finish();
                }else{
                    System.out.println("Usuario o contraseña incorrectas");
                }
            }
        });
    }
}
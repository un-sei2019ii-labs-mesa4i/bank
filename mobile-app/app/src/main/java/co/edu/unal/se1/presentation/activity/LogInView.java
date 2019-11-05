package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import co.edu.unal.se1.R;
<<<<<<< HEAD
import co.edu.unal.se1.businessLogic.controller.ApplicationAccountController;
import co.edu.unal.se1.businessLogic.controller.SavingsAccountController;
=======
>>>>>>> ncontrerasn-feature
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.repository.ApplicationAccountRepository;
import co.edu.unal.se1.dataAccess.repository.SavingsAccountRepository;

public class LogInView extends AppCompatActivity {

<<<<<<< HEAD

    private ApplicationAccountController applicationAccountController;



    private SavingsAccountController savingsAccountController;
=======
    private ApplicationAccountRepository applicationAccountRepository;
    private SavingsAccountRepository savingsAccountRepository;
>>>>>>> ncontrerasn-feature

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

<<<<<<< HEAD


        applicationAccountController=new ApplicationAccountController(getApplicationContext());
        savingsAccountController =new SavingsAccountController(getApplicationContext());
=======
        applicationAccountRepository=new ApplicationAccountRepository(getApplicationContext());
        savingsAccountRepository=new SavingsAccountRepository(getApplicationContext());
>>>>>>> ncontrerasn-feature

        Button logInButton = findViewById(R.id.logInBtn);
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final TextView eMail = findViewById(R.id.Email);
                final TextView password = findViewById(R.id.Password);

<<<<<<< HEAD
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
=======
                final ApplicationAccount appAcc=applicationAccountRepository.getUserByEmail(eMail.getText().toString());
                final String pass=password.getText().toString();
                final String eMailAdmin =eMail.getText().toString();//por ahora machete asi

                if (eMailAdmin.equals("admin")&&pass.equals("1234")){//ojo machete
                    Intent i=new Intent(v.getContext(),AdminView.class);
                    startActivity(i);
                    finish();
                }else if(appAcc!=null && appAcc.getPassword().equals(pass)){
                    SavingsAccount acc=savingsAccountRepository.getSavingsAccountById(appAcc.getSavingsAccount());
                    Intent i=new Intent(v.getContext(),UserView.class);
                    i.putExtra("usuario",acc.getOwner());
>>>>>>> ncontrerasn-feature
                    startActivity(i);
                    finish();
                }else{
                    System.out.println("Usuario o contraseña incorrectas");
                }
            }
        });
    }
}
package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import co.edu.unal.se1.R;

public class AdminView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_view);

        Button createBtn = findViewById(R.id.createUserByAdminBtn);
        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button accBtn = findViewById(R.id.accListBtn);
        accBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),AppAccountsLog.class);
                startActivity(i);
                finish();
            }
        });

        Button transBtn = findViewById(R.id.transLogBtn);
        transBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),TransactionsLog.class);
                startActivity(i);
                finish();
            }
        });

        Button transferBtn = findViewById(R.id.makeTransByAdminBtn);
        transferBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),TransactionView.class);
                startActivity(i);
                finish();
            }
        });

        Button logOutBtn = findViewById(R.id.logOutAdminBtn);
        logOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),LogInView.class);
                startActivity(i);
                finish();
            }
        });
    }
}
package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import co.edu.unal.se1.R;

public class UserView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_view);

        final int userId=getIntent().getIntExtra("usuario",0);

        Button transferBtn = findViewById(R.id.makeTransferByUserBtn);
        transferBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),UserTransactionView.class);
                i.putExtra("usuario",userId);
                startActivity(i);
                finish();
            }
        });

        Button infoBtn = findViewById(R.id.myInfoBtn);
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),UserInfoView.class);
                i.putExtra("usuario",userId);
                startActivity(i);
                finish();
            }
        });

        Button logBtn = findViewById(R.id.transLogUserBtn);
        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),UserTransactionsLog.class);
                i.putExtra("usuario",userId);
                startActivity(i);
                finish();
            }
        });

        Button logOutBtn = findViewById(R.id.logOutUserBtn);
        logOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),LogInView.class);
                i.putExtra("usuario",userId);
                startActivity(i);
                finish();
            }
        });
    }
}

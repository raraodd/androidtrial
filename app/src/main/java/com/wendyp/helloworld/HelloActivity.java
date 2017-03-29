package com.wendyp.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HelloActivity extends AppCompatActivity {

    Button login1, login2, login3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        AutoFitTextView test = new AutoFitTextView(this);
        test = (AutoFitTextView)findViewById(R.id.achievment);

        login1 = (Button) findViewById(R.id.login1);
        login2 = (Button) findViewById(R.id.login2);
        login3 = (Button) findViewById(R.id.login3);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(HelloActivity.this, LoginActivity.class);
                startActivity(login);
            }
        });

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(HelloActivity.this, LoginSvtActivity.class);
                startActivity(login);
            }
        });

        login3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(HelloActivity.this, Login3Activity.class);
                startActivity(login);
            }
        });
    }
}

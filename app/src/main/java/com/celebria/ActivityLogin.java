package com.celebria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mitesh on 8/7/16.
 */
public class ActivityLogin extends AppCompatActivity implements View.OnClickListener{

    private TextView txtLogin;
    private TextView txtCreateAccount;
    private TextView txtForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();

    }

    private void initComponents() {

        txtLogin = (TextView)findViewById(R.id.textViewLogin);
        txtCreateAccount = (TextView)findViewById(R.id.textViewCreateAccount);
        txtForgotPassword = (TextView)findViewById(R.id.textViewForgotPassword);

        txtLogin.setOnClickListener(this);
        txtCreateAccount.setOnClickListener(this);
        txtForgotPassword.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textViewLogin:
                Intent intent = new Intent(ActivityLogin.this, ActivityActiveTrivia.class);
                startActivity(intent);
                break;
            case R.id.textViewCreateAccount:
                break;
            case R.id.textViewForgotPassword:
                break;
        }
    }
}

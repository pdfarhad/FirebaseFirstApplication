package com.example.farhad.firebasefirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity {

    EditText etEmail;
    EditText etPassword;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etEmail = (EditText)findViewById(R.id.etEmailRegistration);
        etPassword = (EditText)findViewById(R.id.etPasswordRegistration);
        btnRegister = (Button)findViewById(R.id.btnRegisterRegistration);


    }

    public void btnRegister(View view) {
    }
}

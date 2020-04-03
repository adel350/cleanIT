package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class EmailSignUp extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_sign_up);
    }

    public void goToAdditionalSignUpPage(View view) {

        //Get email and password before clickinng the button
        emailEditText = findViewById(R.id.emailInputText);
        passwordEditText = findViewById(R.id.passwordInputText);

        if (validForm()) {
            Intent intent = new Intent(this, AdditionalSignUpStage.class);
            startActivity(intent);
        }
    }

    public boolean validForm() {
        boolean error = true;

        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();


        if (TextUtils.isEmpty(email)) {
            emailEditText.setError("Email cannot be empty");
            error = false;
        }

        if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("Password cannot be empty");
            error = false;
        }

        return error;
    }
}

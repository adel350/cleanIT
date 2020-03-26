package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToGoogleSignUpPage(View view) {
        Intent intent = new Intent(this, GoogleSignUp.class);
        startActivity(intent);
    }

    public void goToFacebookSignUpPage(View view) {
        Intent intent = new Intent(this, FacebookSignUp.class);
        startActivity(intent);
    }

    public void goToEmailSignUpPage(View view) {
        Intent intent = new Intent(this, EmailSignUp.class);
        startActivity(intent);
    }

    public void goToSignInPage(View view) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}

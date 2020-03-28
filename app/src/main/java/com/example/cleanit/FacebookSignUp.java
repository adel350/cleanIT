package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FacebookSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_sign_up);
    }

    public void goToAdditionalSignUpPage(View view) {
        Intent intent = new Intent(this, AdditionalSignUpStage.class);
        startActivity(intent);
    }
}

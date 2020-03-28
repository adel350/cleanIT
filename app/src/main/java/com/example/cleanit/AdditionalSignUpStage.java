package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdditionalSignUpStage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_sign_up_stage);
    }

    public void goToPaymentInformation(View view) {
        Intent intent = new Intent(this, PaymentInformation.class);
        startActivity(intent);
    }
}

package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpdateInfoScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info_screen);
    }

    public void goToAccountDetails(View view) {
        Intent intent = new Intent(this, AccountDetails.class);
        startActivity(intent);
    }

    public void goToPaymentInformation(View view) {
        Intent intent = new Intent(this, PaymentInformation.class);
        startActivity(intent);
    }
}

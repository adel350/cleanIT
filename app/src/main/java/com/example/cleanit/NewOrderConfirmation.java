package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewOrderConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order_confirmation);
    }

    public void gotToMainAccount(View view) {
        Intent intent = new Intent(this, AccountDetails.class);
        startActivity(intent);
    }
}

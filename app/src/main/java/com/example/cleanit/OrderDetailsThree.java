package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderDetailsThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details_three);
    }

    public void goBackToAccount(View view) {
        Intent intent = new Intent(this, AccountDetails.class);
        startActivity(intent);
    }
}

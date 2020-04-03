package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AccountDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_details);


    }

    public void goToNewOrderPage(View view) {
        Intent intent = new Intent(this, OrderDetails.class);
        startActivity(intent);
    }

    public void editInfo(View view) {
        Intent intent = new Intent(this, UpdateInfoScreen.class);
        startActivity(intent);
    }

    public void goToFirstOrderPage(View view) {
        Intent intent = new Intent(this, OrderDetailsOne.class);
        startActivity(intent);
    }

    public void goToSecondOrderPage(View view) {
        Intent intent = new Intent(this, OrderDetailsTwo.class);
        startActivity(intent);
    }

    public void goToThirdOrderPage(View view) {
        Intent intent = new Intent(this, OrderDetailsThree.class);
        startActivity(intent);
    }
}

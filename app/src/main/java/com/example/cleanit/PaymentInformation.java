package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PaymentInformation extends AppCompatActivity {

    private Spinner spinner1;
    private ArrayAdapter<CharSequence> spinner_adapter1;

    private Spinner spinner2;
    private ArrayAdapter<CharSequence> spinner_adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_information);

        spinner1 = findViewById(R.id.update_month_expiration);
        spinner_adapter1 = ArrayAdapter.createFromResource(this, R.array.month, android.R.layout.simple_spinner_item);
        spinner_adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(spinner_adapter1);

        spinner2 = findViewById(R.id.update_year_expiration);
        spinner_adapter2 = ArrayAdapter.createFromResource(this, R.array.year, android.R.layout.simple_spinner_item);
        spinner_adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(spinner_adapter2);
    }

    public void addPaymentInformation(View view) {
        Intent intent = new Intent(this, BeforeFinalizingScreen.class);
        startActivity(intent);
    }
}

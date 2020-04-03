package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class PaymentInformation extends AppCompatActivity {

    private Spinner spinner1;
    private ArrayAdapter<CharSequence> spinner_adapter1;

    private Spinner spinner2;
    private ArrayAdapter<CharSequence> spinner_adapter2;

    private EditText nameOnCardEditText;
    private EditText cardNumberEditText;
    private EditText cvcCodeEditTExt;

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
        //Get info before going forward
        nameOnCardEditText = findViewById(R.id.nameOnCardInput);
        cardNumberEditText = findViewById(R.id.cardNumberInput);;
        cvcCodeEditTExt = findViewById(R.id.cvcCodeInput);

        if (validForm()) {
            Intent intent = new Intent(this, BeforeFinalizingScreen.class);
            startActivity(intent);
        }
    }

    public boolean validForm() {
        boolean error = true;

        String nameOnCard = nameOnCardEditText.getText().toString().trim();
        String cardNumber = cardNumberEditText.getText().toString().trim();
        String cvcCode = cvcCodeEditTExt.getText().toString().trim();


        if (TextUtils.isEmpty(nameOnCard)) {
            nameOnCardEditText.setError("Name on card cannot be empty");
            error = false;
        }

        if (TextUtils.isEmpty(cardNumber)) {
            cardNumberEditText.setError("Card number cannot be empty");
            error = false;
        }

        if (TextUtils.isEmpty(cvcCode)) {
            cvcCodeEditTExt.setError("CVC code cannot be empty");
            error = false;
        }

        return error;
    }
}

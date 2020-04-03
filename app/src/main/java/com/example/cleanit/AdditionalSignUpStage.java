package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class AdditionalSignUpStage extends AppCompatActivity {

    private EditText phoneNumberEditText;
    private EditText streetAddressEditText;
    private EditText apartmentNumberEditText;
    private EditText cityEditText;
    private EditText postalCodeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_sign_up_stage);
    }

    public void goToPaymentInformation(View view) {
        Intent intent = new Intent(this, PaymentInformation.class);
        startActivity(intent);
    }

    public void goToAccountDetails(View view) {

        //Get info before going to the next page
        phoneNumberEditText = findViewById(R.id.phoneNumberInput);
        streetAddressEditText = findViewById(R.id.streetAddressInput);;
        apartmentNumberEditText = findViewById(R.id.apartmentNumberInput);
        cityEditText = findViewById(R.id.cityInput);
        postalCodeEditText = findViewById(R.id.postalCodeInput);

        if (validForm()) {
            Intent intent = new Intent(this, AccountDetails.class);
            startActivity(intent);
        }
    }

    public boolean validForm() {
        boolean error = true;

        String phoneNumber = phoneNumberEditText.getText().toString().trim();
        String streetAddress = streetAddressEditText.getText().toString().trim();
        String apartmentNumber = apartmentNumberEditText.getText().toString().trim();
        String city = cityEditText.getText().toString().trim();
        String postalCode = postalCodeEditText.getText().toString().trim();


        if (TextUtils.isEmpty(phoneNumber)) {
            phoneNumberEditText.setError("Phone number cannot be empty");
            error = false;
        }

        if (TextUtils.isEmpty(streetAddress)) {
            streetAddressEditText.setError("Street address cannot be empty");
            error = false;
        }

        if (TextUtils.isEmpty(apartmentNumber)) {
            apartmentNumberEditText.setError("Apartment number cannot be empty");
            error = false;
        }

        if (TextUtils.isEmpty(city)) {
            cityEditText.setError("City cannot be empty");
            error = false;
        }

        if (TextUtils.isEmpty(postalCode)) {
            postalCodeEditText.setError("Postal Code cannot be empty");
            error = false;
        }

        return error;
    }
}

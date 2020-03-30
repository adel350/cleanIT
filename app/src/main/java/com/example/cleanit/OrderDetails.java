package com.example.cleanit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class OrderDetails extends AppCompatActivity {

    private Spinner spinner1;
    private ArrayAdapter<CharSequence> spinner_adapter1;

    private Spinner spinner2;
    private ArrayAdapter<CharSequence> spinner_adapter2;

    private Spinner spinner3;
    private ArrayAdapter<CharSequence> spinner_adapter3;

    private Spinner spinner4;
    private ArrayAdapter<CharSequence> spinner_adapter4;

    private Spinner spinner5;
    private ArrayAdapter<CharSequence> spinner_adapter5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);


        spinner1 = findViewById(R.id.update_items_number);
        spinner_adapter1 = ArrayAdapter.createFromResource(this, R.array.numberOfItems, android.R.layout.simple_spinner_item);
        spinner_adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(spinner_adapter1);

        spinner2 = findViewById(R.id.update_day_pickup);
        spinner_adapter2 = ArrayAdapter.createFromResource(this, R.array.day, android.R.layout.simple_spinner_item);
        spinner_adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(spinner_adapter2);

        spinner3 = findViewById(R.id.update_time_pickup);
        spinner_adapter3 = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_item);
        spinner_adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(spinner_adapter3);

        spinner4 = findViewById(R.id.update_day_delivery_pickup);
        spinner_adapter4 = ArrayAdapter.createFromResource(this, R.array.day, android.R.layout.simple_spinner_item);
        spinner_adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(spinner_adapter4);

        spinner5 = findViewById(R.id.update_time_delivery_pickup);
        spinner_adapter5 = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_item);
        spinner_adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(spinner_adapter5);
    }
}

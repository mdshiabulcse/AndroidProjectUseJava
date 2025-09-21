package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputValue;
    Button convertBtn;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValue = findViewById(R.id.inputValue);
        convertBtn = findViewById(R.id.convertBtn);
        resultText = findViewById(R.id.resultText);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputValue.getText().toString();
                if (!input.isEmpty()) {
                    double meters = Double.parseDouble(input);

                    // Polymorphism: one interface, multiple implementations
                    Converter cmConverter = new MeterToCmConverter();
                    Converter kmConverter = new MeterToKmConverter();

                    double cm = cmConverter.convert(meters);
                    double km = kmConverter.convert(meters);

                    resultText.setText("Meters: " + meters +
                            "\nCentimeters: " + cm +
                            "\nKilometers: " + km);
                } else {
                    resultText.setText("Please enter a value!");
                }
            }
        });
    }
}
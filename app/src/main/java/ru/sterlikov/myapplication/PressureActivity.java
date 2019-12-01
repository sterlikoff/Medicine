package ru.sterlikov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class PressureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
    }

    public void addPressure(View view) {

        EditText upperPressureEditText = findViewById(R.id.upperPressureEditText);
        EditText lowerPressureEditText = findViewById(R.id.lowerPressureEditText);
        EditText pulseEditText = findViewById(R.id.pulseEditText);
        CheckBox tachycardia = findViewById(R.id.tachycardia);

        int upper = 0, lower = 0, pulse = 0;
        boolean isTachycardia = false;

        boolean hasErrors = false;

        try {

            upper = Integer.parseInt(upperPressureEditText.getText().toString());
            lower = Integer.parseInt(lowerPressureEditText.getText().toString());
            pulse = Integer.parseInt(pulseEditText.getText().toString());
            isTachycardia = tachycardia.isChecked();

        } catch (Exception e) {

            hasErrors = true;
            Toast.makeText(this, "Неверное значение в одном из полей", Toast.LENGTH_LONG).show();

        }

        if (upper <= 0) {
            hasErrors = true;
        }

        if (lower <= 0) {
            hasErrors = true;
        }

        if (pulse <= 0) {
            hasErrors = true;
        }

        if (hasErrors) {

            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show();

        } else {

            Application.addPressure(new Pressure(upper, lower, pulse, isTachycardia));
            finish();

        }

    }

}

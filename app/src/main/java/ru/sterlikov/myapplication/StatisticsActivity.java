package ru.sterlikov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StatisticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
    }

    public void addStatistics(View view) {

        EditText weightEditText = findViewById(R.id.weightEditText);
        EditText stepsCountEditText = findViewById(R.id.stepsCountEditText);

        int weight = 0, stepsCount = 0;
        boolean hasErrors = false;

        try {

            weight = Integer.parseInt(weightEditText.getText().toString());
            stepsCount = Integer.parseInt(stepsCountEditText.getText().toString());

        } catch (Exception e) {

            hasErrors = true;
            Toast.makeText(this, "Неверное значение в одном из полей", Toast.LENGTH_LONG).show();

        }


        if (weight <= 0) {
            hasErrors = true;
        }

        if (stepsCount <= 0) {
            hasErrors = true;
        }

        if (hasErrors) {

            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show();

        } else {

            Application.addStatistics(new Statistics(weight, stepsCount));
            finish();

        }

    }

}

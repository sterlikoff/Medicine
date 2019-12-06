package ru.sterlikov.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View view) {

        EditText nameEditText = findViewById(R.id.nameEditText);
        String name = nameEditText.getText().toString();

        EditText ageEditText = findViewById(R.id.ageEditText);

        int age = 0;
        try {
            age = Integer.parseInt(ageEditText.getText().toString());
        } catch (Exception e) {}

        ConstraintLayout personalLayout = findViewById(R.id.personalLayout);
        ConstraintLayout chooseLayout = findViewById(R.id.chooseLayout);

        boolean hasErrors = false;

        if (name.isEmpty()) {

            hasErrors = true;
            Toast.makeText(this, R.string.nameError, Toast.LENGTH_LONG).show();

        }

        if (age <= 0) {

            hasErrors = true;
            Toast.makeText(this, R.string.ageError, Toast.LENGTH_LONG).show();

        }

        if (!hasErrors) {

            Application.signIn(name, age);
            chooseLayout.setVisibility(View.VISIBLE);
            personalLayout.setVisibility(View.GONE);

        }

    }

    public void openPressureActivity(View view) {

        Intent myIntent = new Intent(MainActivity.this, PressureActivity.class);
        MainActivity.this.startActivity(myIntent);

        Log.i("userLog", "Переход к странице давления");

    }

    public void openStatisticsActivity(View view) {

        Intent myIntent = new Intent(MainActivity.this, StatisticsActivity.class);
        MainActivity.this.startActivity(myIntent);

        Log.i("userLog", "Переход к странице показателей");


    }

}

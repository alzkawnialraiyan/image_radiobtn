package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton starters = findViewById(R.id.radiobtn);
        RadioButton meal = findViewById(R.id.radiobtn2);
        RadioButton dessert = findViewById(R.id.radiobtn3);

    }

}
package com.example.healthcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        getSupportActionBar().setTitle("Importance of Food");
    }
}

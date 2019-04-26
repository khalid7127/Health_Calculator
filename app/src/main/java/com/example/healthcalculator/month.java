package com.example.healthcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class month extends AppCompatActivity {

    Button firstweek,secondweek,thirdweek,fourthweek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        getSupportActionBar().setTitle("For A Month");

        firstweek =(Button)findViewById(R.id.first_week);
        firstweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "First Week!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(month.this,firstweek.class);
                startActivity(i);

            }
        });

        secondweek =(Button)findViewById(R.id.second_week);
        secondweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Second Week!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(month.this,secondweek.class);
                startActivity(i);

            }
        });

        thirdweek =(Button)findViewById(R.id.third_week);
        thirdweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Third Week!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(month.this,thirdweek.class);
                startActivity(i);

            }
        });

        fourthweek =(Button)findViewById(R.id.fourth_week);
        fourthweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Fourth Week!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(month.this,fourthweek.class);
                startActivity(i);

            }
        });
    }
}

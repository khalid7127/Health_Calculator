package com.example.healthcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tips extends AppCompatActivity {

    Button diet,exercise,food,advice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        getSupportActionBar().setTitle("Health Tips");

        diet=(Button)findViewById(R.id.diet);
        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Diet Control!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(tips.this,diet.class);
                startActivity(i);

            }
        });

        exercise=(Button)findViewById(R.id.exercise);
        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Exercise Tips!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(tips.this,exercise.class);
                startActivity(i);

            }
        });

        food=(Button)findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Food Tips!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(tips.this,food.class);
                startActivity(i);

            }
        });

        advice=(Button)findViewById(R.id.advice);
        advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Advice!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(tips.this,advice.class);
                startActivity(i);

            }
        });


    }
}

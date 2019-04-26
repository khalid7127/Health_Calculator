package com.example.healthcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class exercise extends AppCompatActivity {

    Button shoulder,spinal,flutter,fish,blast,thigh,balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        getSupportActionBar().setTitle("Exercise");

        shoulder =(Button)findViewById(R.id.shoulder_shrugs);
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Shoulder Shrugs!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(exercise.this,shoulder.class);
                startActivity(i);

            }
        });

        spinal =(Button)findViewById(R.id.spinal_twist);
        spinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Spinal Twist!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(exercise.this,spinal.class);
                startActivity(i);

            }
        });

        flutter =(Button)findViewById(R.id.flutter_kicks);
        flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Flutter Kicks!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(exercise.this,flutter.class);
                startActivity(i);

            }
        });

        fish =(Button)findViewById(R.id.fish_pose);
        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Fish Pose!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(exercise.this,fish.class);
                startActivity(i);

            }
        });

        blast =(Button)findViewById(R.id.blast);
        blast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Blast Glute Muscles!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(exercise.this,blast.class);
                startActivity(i);

            }
        });

        thigh =(Button)findViewById(R.id.thigh_lift);
        thigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thigh Lift!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(exercise.this,thigh.class);
                startActivity(i);

            }
        });

        balance =(Button)findViewById(R.id.better_balance);
        balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Better Balance!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(exercise.this,balance.class);
                startActivity(i);

            }
        });
    }
}

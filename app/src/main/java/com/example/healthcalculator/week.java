package com.example.healthcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class week extends AppCompatActivity {

    Button first,second,third,fourth,fifth,sixth,seventh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        getSupportActionBar().setTitle("For A Week");

        first =(Button)findViewById(R.id.first);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "First Day!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(week.this,firstday.class);
                startActivity(i);

            }
        });

        second =(Button)findViewById(R.id.second);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Second Day!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(week.this,secondday.class);
                startActivity(i);

            }
        });

        third =(Button)findViewById(R.id.third);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Third Day!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(week.this,thirdday.class);
                startActivity(i);

            }
        });

        fourth =(Button)findViewById(R.id.fourth);
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Fourth Day!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(week.this,fourthday.class);
                startActivity(i);

            }
        });

        fifth =(Button)findViewById(R.id.fifth);
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Fifth Day!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(week.this,fifthday.class);
                startActivity(i);

            }
        });

        sixth =(Button)findViewById(R.id.sixth);
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sixth Day!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(week.this,sixth.class);
                startActivity(i);

            }
        });

        seventh =(Button)findViewById(R.id.seventh);
        seventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Seventh Day!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(week.this,seventhday.class);
                startActivity(i);

            }
        });
    }
}

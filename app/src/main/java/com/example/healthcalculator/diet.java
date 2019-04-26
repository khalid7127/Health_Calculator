package com.example.healthcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class diet extends AppCompatActivity {

    Button btncircle,btncircle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        getSupportActionBar().setTitle("Diet Control");

        btncircle=(Button)findViewById(R.id.btncircle);
        btncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Week!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(diet.this,week.class);
                startActivity(i);

            }
        });
        btncircle1=(Button)findViewById(R.id.btncircle1);
        btncircle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Month!!! Yeahhhooo...", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(diet.this, month.class);
                startActivity(i);

            }
        });
    }
}

package com.example.healthcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.Mybutton1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "WE are Going For BMI Test!!! Yeahhh...", Toast.LENGTH_SHORT).show();//this method shows a message
                //Connected to BMI Calculator Class//
                Intent i = new Intent(MainActivity.this, bmi.class);

                startActivity(i);

            }
        });

    }
}


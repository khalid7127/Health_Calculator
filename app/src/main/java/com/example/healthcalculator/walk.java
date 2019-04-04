package com.example.healthcalculator;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class walk extends AppCompatActivity implements SensorEventListener {
    SensorManager sensorManager;
    Sensor sensor;
    TextView display, calView;
    float i=0;
    float st=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk);

        getSupportActionBar().setTitle("Step & Calorie");

        display=findViewById(R.id.textView1);

        calView=findViewById(R.id.calview);

        sensorManager=(SensorManager)getSystemService(Context.SENSOR_SERVICE);

    }

    @Override
    protected void onResume() {
        super.onResume();
        sensor=sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(sensor!=null)
        {
            sensorManager.registerListener(this,sensor,sensorManager.SENSOR_DELAY_UI);
        }else
        {
            Toast.makeText(getApplicationContext(), "Your phone does not have sensor...", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        st = event.values[0] - i;
        display.setText("" + (event.values[0] - st) + ".");     //printing the value of steps.
        double value = i * 0.046;
        String result = String.valueOf(value);
        calView.setText(result +"cal");
        i++;
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}

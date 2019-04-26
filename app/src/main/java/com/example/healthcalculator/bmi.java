package com.example.healthcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class bmi extends AppCompatActivity {

    private Spinner unit;
    float height;
    float unit_field;
    float weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        getSupportActionBar().setTitle("BMI Calculator");

        final EditText e1 = (EditText) findViewById(R.id.et1);
        final EditText e2 = (EditText) findViewById(R.id.et2);
        final TextView tv4 = (TextView) findViewById(R.id.tv4);

        final EditText foot=findViewById(R.id.et3);
        final EditText inch=findViewById(R.id.et4);
        final TextView display=findViewById(R.id.tv6);
        final Button convert=findViewById(R.id.ib2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str3 = foot.getText().toString().trim();
                String str4= inch.getText().toString().trim();

                if (TextUtils.isEmpty(str3)){
                    foot.setError("Please enter foot");
                    foot.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(str4)){
                    inch.setError("Please enter inch");
                    inch.requestFocus();
                    return;
                }

                float float_foot=Float.parseFloat(str3);
                float float_inch=Float.parseFloat(str4);
                float float_meter= (float) (((float_foot*12) + float_inch)*0.0254);

                display.setText((String.valueOf(float_meter))+" meters");
            }
        });

        findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();



                if (TextUtils.isEmpty(str1)){
                    e1.setError("Please enter your weight");
                    e1.requestFocus();
                    return;
                }


                if(TextUtils.isEmpty(str2)){
                    e2.setError("Please enter your height");
                    e2.requestFocus();
                    return;
                }

                weight = Float.parseFloat(str1);
                unit_field = Float.parseFloat(str2);

                unit=findViewById(R.id.spinner1);
                String input_unit=unit.getSelectedItem().toString();
                if (input_unit.equals("Meter")) {
                    height=unit_field;
                }
                if (input_unit.equals("Centimeter")) {
                    height=unit_field/100;
                }
                if (input_unit.equals("Inch")) {
                    height= (float) (unit_field*0.0254);
                }



                float bmiValue;
                bmiValue = calculateBMI(weight, height);

                String bmiInterpretation = interpretBMI(bmiValue);

                tv4.setText(String.valueOf(bmiValue) + "-" + bmiInterpretation);

            }
        });

    }

    //Process of BMI CalCuLation
    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }


    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return " Severely underweight\nTips:-\n" +
                    "You should walk atleast 5000 steps in a day";
        } else if (bmiValue < 18.5) {

            return " Underweight\nTips:-\n" +
                    "You have to walk atleast 6000 steps in a day";
        }else if (bmiValue < 20) {
            return " Normal \nTips:-\n" +
                    "You should walk atleast 7000 steps in a day";
        }
        else if (bmiValue < 23) {
            return " Normal \nTips:-\n" +
                    "You should walk atleast 8000 steps in a day";
        }
        else if (bmiValue < 25) {

            return " Normal\nTips:-\n" +
                    "You should Walk atleast 10000 steps in a day";
        }
        else if (bmiValue <28) {

            return " Overweight\nTips:-\n" +
                    "You have to walk atleast 12000 in a day";
        }
        else if (bmiValue>=28) {

            return " Overweight\nTips:-\n" +
                    "You have to walk atleast 15000 in a day";
        }

        else {
            return " Invalid";
        }
    }
}

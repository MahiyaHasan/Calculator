package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_advanced_calculator extends AppCompatActivity {

    private Button sin_bt,cos_bt,sqroot_bt,sq_bt;
    private EditText number_et;
    private TextView result_tv;

    double result;
    double number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calculator);

        sin_bt=findViewById(R.id.sin_bt);
        cos_bt=findViewById(R.id.cos_bt);
        sqroot_bt=findViewById(R.id.sqroot_bt);
        sq_bt=findViewById(R.id.sq_bt);
        number_et=findViewById(R.id.number_et);
        result_tv=findViewById(R.id.result_tv);

        sin_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num;
                num=number_et.getText().toString();
                if(num.isEmpty()){
                    Toast.makeText(activity_advanced_calculator.this, "No Number Entered in field", Toast.LENGTH_SHORT).show();
                    return;
                }
                number= Double.parseDouble(num);
                result=Math.sin(number);
                result_tv.setText(String.valueOf(result));

            }
        });




        cos_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num;
                num=number_et.getText().toString();
                if(num.isEmpty()){
                    Toast.makeText(activity_advanced_calculator.this, "No Number Entered in field", Toast.LENGTH_SHORT).show();
                    return;
                }
                number= Double.parseDouble(num);
                result=Math.cos(number);
                result_tv.setText(String.valueOf(result));

            }
        });


        sqroot_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num;
                num=number_et.getText().toString();
                if(num.isEmpty()){
                    Toast.makeText(activity_advanced_calculator.this, "No Number Entered in field", Toast.LENGTH_SHORT).show();
                    return;
                }
                number= Double.parseDouble(num);
                if(number<0) {
                    Toast.makeText(activity_advanced_calculator.this, "Number entered cannot be negative.", Toast.LENGTH_SHORT).show();

                }
                result=Math.pow(number,0.5);
                result_tv.setText(String.valueOf(result));
                }


    });

                sq_bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String num;
                        num=number_et.getText().toString();
                        if(num.isEmpty()){
                            Toast.makeText(activity_advanced_calculator.this, "No Number Entered in field", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        number= Double.parseDouble(num);
                        result=number*number;
                        result_tv.setText(String.valueOf(result));

                    }
                });

    }


}

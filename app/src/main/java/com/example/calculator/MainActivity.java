package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    //First we make variables.
    EditText etNum1 , etNum2;
    TextView tvResult;
    Button btnAdd , btnSub , btnDiv , btnMul;
    double num1 , num2 , result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Then We Initialize variables
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvResult = findViewById(R.id.tvResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        //Then We perform other function on each variable
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 num1 = Double.parseDouble(etNum1.getText().toString());
                 num2 = Double.parseDouble(etNum2.getText().toString());
                 result = num1 + num2;
                 tvResult.setText(""+result);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(etNum1.getText().toString());
                num2 = Double.parseDouble(etNum2.getText().toString());
                result = num1 - num2;
                tvResult.setText(""+result);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(etNum1.getText().toString());
                num2 = Double.parseDouble(etNum2.getText().toString());
                result = num1 / num2;
                tvResult.setText(""+result);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(etNum1.getText().toString());
                num2 = Double.parseDouble(etNum2.getText().toString());
                result = num1 * num2;
                tvResult.setText(""+result);
            }
        });



    }
}
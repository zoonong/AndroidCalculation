package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText myedit1, myedit2;
    Button btnPls, btnMin, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        myedit1 = (EditText) findViewById(R.id.edittext1);
        myedit2 = (EditText) findViewById(R.id.edittext2);
        btnPls = (Button) findViewById(R.id.button1);
        btnMin = (Button) findViewById(R.id.button2);
        btnMul = (Button) findViewById(R.id.button3);
        btnDiv = (Button) findViewById(R.id.button4);
        textResult = (TextView) findViewById(R.id.textview1);

        btnPls.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = myedit1.getText().toString();
                num2 = myedit2.getText().toString();
                if(num1.isEmpty() || num2.isEmpty()) {
                    System.out.println("숫자를 입력하세요.");

                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
                return  false;
            }

        });
        btnMin.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = myedit1.getText().toString();
                num2 = myedit2.getText().toString();
                if(num1.isEmpty() || num2.isEmpty()) {
                    System.out.println("숫자를 입력하세요.");

                }
                else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
                return  false;
            }

        });
        btnMul.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = myedit1.getText().toString();
                num2 = myedit2.getText().toString();
                if(num1.isEmpty() || num2.isEmpty()) {
                    System.out.println("숫자를 입력하세요.");

                }
                else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
                return  false;
            }

        });
        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = myedit1.getText().toString();
                num2 = myedit2.getText().toString();
                if(num1.isEmpty() || num2.isEmpty()) {
                    System.out.println("숫자를 입력하세요.");
                }
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
                return  false;
            }

        });
    }
}
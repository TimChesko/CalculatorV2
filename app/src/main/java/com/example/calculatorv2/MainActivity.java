package com.example.calculatorv2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button clear, delete, percent, division,
            firstNum, secondNum, thirdNum, multiplication,
            fourthNum, fifthNum, sixthNum, minus,
            seventhNum, eighthNum, ninthNum, plus,
            save, zeroNum, dote, equally;

    EditText input;
    TextView history;

    float valueOne, valueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zeroNum = (Button) findViewById(R.id.zeroNum);
        firstNum = (Button) findViewById(R.id.firstNum);
        secondNum = (Button) findViewById(R.id.secondNum);
        thirdNum = (Button) findViewById(R.id.thirdNum);
        fourthNum = (Button) findViewById(R.id.fourthNum);
        fifthNum = (Button) findViewById(R.id.fifthNum);
        sixthNum = (Button) findViewById(R.id.sixthNum);
        seventhNum = (Button) findViewById(R.id.seventhNum);
        eighthNum = (Button) findViewById(R.id.eighthNum);
        ninthNum = (Button) findViewById(R.id.ninthNum);
        dote = (Button) findViewById(R.id.dote);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.division);
        clear = (Button) findViewById(R.id.clear);
        equally = (Button) findViewById(R.id.equally);
        input = (EditText) findViewById(R.id.input);
        history = (TextView) findViewById(R.id.history);
        save = (Button) findViewById(R.id.save);
        delete = (Button) findViewById(R.id.delete);
        percent = (Button) findViewById(R.id.percent);


        firstNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });

        secondNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });

        thirdNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });

        fourthNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });

        fifthNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });

        sixthNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });

        seventhNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });

        eighthNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });

        ninthNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });

        zeroNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(input.getText() + "");
                crunchifyAddition = true;
                input.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(input.getText() + "");
                mSubtract = true;
                input.setText(null);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(input.getText() + "");
                crunchifyMultiplication = true;
                input.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(input.getText() + "");
                crunchifyDivision = true;
                input.setText(null);
            }
        });

        equally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(input.getText() + "");

                if (crunchifyAddition == true) {
                    input.setText(valueOne + valueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    input.setText(valueOne - valueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    input.setText(valueOne * valueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    input.setText(valueOne / valueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
            }
        });

        dote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + ".");
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                history.setText(input.getText());
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = input.getText().toString();
                input.setText(num1.substring(0,num1.length()-1));
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(Double.parseDouble(input.getText().toString()) / 100.0+"");
            }
        });
    }
}
package com.xasan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtFirstDigit, editTxtSecondDigit;
    private TextView editTxtViewResult;
    private String firstNum, secondNum;
    private int s1, s2, answer;
    private calculate calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtFirstDigit = (EditText)findViewById(R.id.editTxtFirstDigit);
        editTxtSecondDigit = (EditText) findViewById(R.id.editTxtSecondDigit);
        editTxtViewResult = (EditText)findViewById(R.id.editTxtViewResult);

    }

    public void btnCalculate(View v){
        firstNum = editTxtFirstDigit.getText().toString();
        secondNum = editTxtSecondDigit.getText().toString();

        if(!TextUtils.isEmpty(firstNum) && !TextUtils.isEmpty(secondNum)){
            s1 = Integer.valueOf(firstNum);
            s2 = Integer.valueOf(secondNum);
            calculate = new calculate(s1, s2);

            switch (v.getId()){
                case R.id.btnPlus:
                    answer = calculate.sum();
                    break;

                case R.id.btnMinus:
                    answer = calculate.difference();
                    break;

                case R.id.btnMultiply:
                    answer = calculate.times();
                    break;

                case R.id.btnDivide:
                    answer = calculate.division();
                    break;

            }
            editTxtViewResult.setText("Result: " + answer);
        }else
            editTxtViewResult.setText("You can't input empty digits...");
    }
}


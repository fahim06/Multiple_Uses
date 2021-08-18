package com.example.multipleuses;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    TextView primaryView, secondaryView;
    double num1, result, num2;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        primaryView = findViewById(R.id.primaryTextViewID);
        secondaryView = findViewById(R.id.secondaryTextViewID);
    }

    @SuppressLint("SetTextI18n")
    public void calculation(View view) {
        if (view.getId() == R.id.button1) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("1");
            } else {
                primaryView.setText(primaryValue + "1");
            }

        } else if (view.getId() == R.id.button2) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("2");
            } else {
                primaryView.setText(primaryValue + "2");
            }

        } else if (view.getId() == R.id.button3) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("3");
            } else {
                primaryView.setText(primaryValue + "3");
            }

        } else if (view.getId() == R.id.button4) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("4");
            } else {
                primaryView.setText(primaryValue + "4");
            }

        } else if (view.getId() == R.id.button5) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("");
            } else {
                primaryView.setText(primaryValue + "5");
            }

        } else if (view.getId() == R.id.button6) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("6");
            } else {
                primaryView.setText(primaryValue + "6");
            }

        } else if (view.getId() == R.id.button7) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("7");
            } else {
                primaryView.setText(primaryValue + "7");
            }

        } else if (view.getId() == R.id.button8) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("8");
            } else {
                primaryView.setText(primaryValue + "8");
            }

        } else if (view.getId() == R.id.button9) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("9");
            } else {
                primaryView.setText(primaryValue + "9");
            }

        } else if (view.getId() == R.id.button0) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText("0");
            } else {
                primaryView.setText(primaryValue + getString(R.string._0));
            }

        } else if (view.getId() == R.id.buttonSum) {
            String primaryValue = primaryView.getText().toString();
            secondaryView.setText(primaryValue + " " + "+");
            num1 = Double.parseDouble(primaryValue);
            operator = "+";
            primaryView.setText("0");
        } else if (view.getId() == R.id.buttonSub) {
            String primaryValue = primaryView.getText().toString();
            secondaryView.setText(primaryValue + " " + "-");
            num1 = Double.parseDouble(primaryValue);
            operator = "-";
            primaryView.setText("0");
        } else if (view.getId() == R.id.buttonMul) {
            String primaryValue = primaryView.getText().toString();
            secondaryView.setText(primaryValue + " " + "*");
            num1 = Double.parseDouble(primaryValue);
            operator = "*";
            primaryView.setText("0");
        } else if (view.getId() == R.id.buttonDiv) {
            String primaryValue = primaryView.getText().toString();
            secondaryView.setText(primaryValue + " " + "/");
            num1 = Double.parseDouble(primaryValue);
            operator = "/";
            primaryView.setText("0");
        } else if (view.getId() == R.id.buttonResult) {
            String primaryValue = primaryView.getText().toString();
            num2 = Double.parseDouble(primaryValue);
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            secondaryView.setText("" + num1 + " " + operator + " " + num2);
            primaryView.setText("" + result);
        } else if (view.getId() == R.id.buttonC) {
            primaryView.setText("0");
            secondaryView.setText("");
            operator = "";
        } else if (view.getId() == R.id.buttonCE) {
            primaryView.setText("0");
        } else if (view.getId() == R.id.buttonPoint) {
            String primaryValue = primaryView.getText().toString();
            if (primaryValue.equals("0")) {
                primaryView.setText(".");
            } else {
                primaryView.setText(primaryValue + ".");
            }
        } else if (view.getId() == R.id.buttonDel) {
            if (primaryView.getText().length() > 0) {
                CharSequence primaryValue = primaryView.getText().toString();
                primaryView.setText(primaryValue.subSequence(0, primaryValue.length() - 1));
            } else {
                num1 = Double.NaN;
                num2 = Double.NaN;
                primaryView.setText(null);
            }
        }
    }
}
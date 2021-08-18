package com.example.multipleuses;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] options;
    String record;
    Spinner mySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySpinner = findViewById(R.id.spinnerID);
        options = getResources().getStringArray(R.array.Options);
        ArrayAdapter<CharSequence> myAdapter = ArrayAdapter.createFromResource(this, R.array.Options, android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.simple_view, R.id.textviewID, options);
        mySpinner.setAdapter(adapter);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                record = "Option";
                DefaultFragment defaultFrag = new DefaultFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID, defaultFrag).commit();
                break;

            case 1:
                record = "Calculator";
                CalculatorFragment calcFrag = new CalculatorFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID, calcFrag).commit();
                break;

            case 2:
                record = "Bmi Calculator";
                BmiFragment bmiFrag = new BmiFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID, bmiFrag).commit();
                break;

            case 3:
                record = "Quiz App";
                QuizFragment quizFag = new QuizFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID, quizFag).commit();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

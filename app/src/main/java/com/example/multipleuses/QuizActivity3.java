package com.example.multipleuses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity3 extends AppCompatActivity {
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        resultView = findViewById(R.id.resultID);
        Intent myGetIntent = getIntent();
        int number = myGetIntent.getIntExtra(QuizActivity2.TotalMarksData, 0);
        resultView.setText("You got " + number + " out of 30");
    }

    public void tryAgainFunction(View view) {
        Intent myIntent = new Intent(this, QuizActivity1.class);
        startActivity(myIntent);
    }

}
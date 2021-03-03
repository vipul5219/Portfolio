package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CareerGoal extends AppCompatActivity {

    TextView CareerGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_goal);

        CareerGoal = findViewById(R.id.CareerGoal);
        CareerGoal.setText("As I am on Study Visa in Canada right now, my first goal is to become a Permanent Residence in Canada. After that I want to " +
                "countinue my dream of becoming a Software Developer by getting a Job in IT company.");
    }
}
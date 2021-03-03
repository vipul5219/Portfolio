package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfessionalSummary extends AppCompatActivity {
    TextView ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_summary);
        ps = findViewById(R.id.txtPS);
        ps.setText("In terms of Professional Work Experience, I don't have any as I am Still a student. But, as " +
                "you can see in my resume I worked for some surviving jobs. I don't have any Volunteer experience is well. I have some awards in sports from my " +
                "school but I don't have any Hard Copy of Those. I also have certificate of Microsoft Excel, that I achieved in my Diploma.");
    }
}
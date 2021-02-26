package com.example.portfolio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class Personal_data extends AppCompatActivity {

    TextView bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        bio = findViewById(R.id.bio);
        bio.setText("My name is Vipulkumar Chaudhari. I am an Indian pursuing my IT Career in Canada. I am doing my Post Graduate DIploma in Computer Programmer Analyst at George Brown College. I did my Diploma in Informtion Technology In India.");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.personal_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.resume:
                startActivity(new Intent(Personal_data.this, Resume.class));
                return true;
            case R.id.cl:
                startActivity(new Intent(Personal_data.this,CoverLetter.class));
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
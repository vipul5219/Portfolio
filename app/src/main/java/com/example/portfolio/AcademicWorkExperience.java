package com.example.portfolio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class AcademicWorkExperience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_work_experience);

        findViewById(R.id.fstxt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked("https://github.com/vipul5219/FullStack-2");
            }
        });

        findViewById(R.id.rgtxt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked("https://github.com/vipul5219/Restaurant-Guide");
            }
        });

        findViewById(R.id.rntxt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked("https://github.com/vipul5219/React-Native-Assignment-2");
            }
        });

        findViewById(R.id.javatxt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked("https://github.com/Fahima345/COMP3095Assignment1");
            }
        });

        findViewById(R.id.iostxt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked("https://github.com/vipul5219/labTest1");
            }
        });
    }

    public void clicked(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.academic_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.capstone:
                startActivity(new Intent(AcademicWorkExperience.this, CapstoneProject.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
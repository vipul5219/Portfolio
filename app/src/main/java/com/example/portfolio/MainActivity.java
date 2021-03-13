package com.example.portfolio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.personal_data:
                startActivity(new Intent(MainActivity.this, Personal_data.class));
                return true;
            case R.id.credentials:
                startActivity(new Intent(MainActivity.this, Credentials.class));
                return true;
            case R.id.ps:
                startActivity(new Intent(MainActivity.this, ProfessionalSummary.class));
                return true;
            case R.id.awe:
                startActivity(new Intent(MainActivity.this,AcademicWorkExperience.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}

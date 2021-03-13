package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CapstoneProject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capstone_project);

        findViewById(R.id.doctxt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked("https://github.com/DevarshiKSagar/capstoneProject");
            }
        });

        findViewById(R.id.codetxt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked("https://github.com/vipul5219/RestaurantScheduler2");
            }
        });
    }


    public void clicked(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}
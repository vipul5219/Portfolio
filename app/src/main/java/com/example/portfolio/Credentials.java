package com.example.portfolio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class Credentials extends AppCompatActivity {

    PDFView pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials);

        pdf = (PDFView) findViewById(R.id.pdfViewCredentials);
        pdf.fromAsset("DC.pdf").load();
       // pdf.fromAsset("DiplomaCertificate.pdf").load();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.credential_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.transcript:
                startActivity(new Intent(Credentials.this, Transcript.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
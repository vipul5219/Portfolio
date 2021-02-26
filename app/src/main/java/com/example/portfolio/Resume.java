package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Resume extends AppCompatActivity {

    PDFView pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        pdf = (PDFView) findViewById(R.id.pdfViewCl);
        pdf.fromAsset("Resume.pdf").load();
    }
}
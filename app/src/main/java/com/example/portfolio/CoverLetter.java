package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CoverLetter extends AppCompatActivity {

    PDFView pdf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_letter);

        pdf = (PDFView) findViewById(R.id.pdfViewCl);
        pdf.fromAsset("CoverLetter.pdf").load();
    }
}
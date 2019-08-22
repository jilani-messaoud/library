package com.example.library.data.model;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.example.library.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class ajouter extends AppCompatActivity {
PDFView pdfView ;
//Uri pdffile = Uri.parse(getIntent().getStringExtra("stockage"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter);
 pdfView = findViewById(R.id.pdfview
 );
  //      pdfView =(PDFView) findViewById(R.id.pdfview);
        pdfView.fromAsset("doc.pdf").load();
       // pdfView.fromUri(pdffile).load();
    }
}

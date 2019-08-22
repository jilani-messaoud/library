package com.example.library.data.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.library.R;
import com.github.barteksc.pdfviewer.PDFView;

public class afficher extends AppCompatActivity {

    PDFView pdfView = findViewById(R.id.pdfview);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afficher_activity);
        //pdfView.fromAsset("doc.pdf").load();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, AfficherFragment.newInstance())
                    .commitNow();
        }

    }
}

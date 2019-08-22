package com.example.library.data.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.library.Controleur.ControleurMenu;
import com.example.library.R;

public class menu extends AppCompatActivity {
     Button buttonLister ,buttonAjouter;
     Intent  intent;
     ControleurMenu controleurMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
itial();
setView();

    }

void itial()
{
    controleurMenu = new ControleurMenu(menu.this);
   buttonLister =(Button
            ) findViewById(R.id.lister);
    buttonAjouter =(Button) findViewById(R.id.ajouter);

}
void  setView()
{
    buttonAjouter.setOnClickListener(controleurMenu);
    buttonLister.setOnClickListener(controleurMenu);
}
}

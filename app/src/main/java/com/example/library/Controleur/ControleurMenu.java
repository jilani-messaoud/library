package com.example.library.Controleur;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.library.R;
import com.example.library.data.model.afficher;
import com.example.library.data.model.ajouter;

public class ControleurMenu implements View.OnClickListener {
   Context context ;
Intent intent ;
    public ControleurMenu(Context context)
    {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.lister){
            intent=new Intent(context.getApplicationContext(), afficher.class);
            context.startActivity(intent);
            //           Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
        }
        if (view.getId()==R.id.ajouter){
            intent = new Intent(context.getApplicationContext(), ajouter.class);
            // Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            context.startActivity(intent);
        }

    }
}

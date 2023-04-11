package com.example.moncvmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*********** Partie langage ***********/
        ArrayList<Langage> langages = new ArrayList<>();
        langages.add(new Langage("PHP", 4));
        langages.add(new Langage("SQL", 4));
        langages.add(new Langage("JavaScript",3));
        langages.add(new Langage("Java",3));

        ListView listViewLangage = findViewById(R.id.listViewLangage);
        LangageBaseAdapter langageAdapter = new LangageBaseAdapter(langages, this);
        listViewLangage.setAdapter(langageAdapter);
        /*********** Partie projet ***********/
        ArrayList<Projet> projets = new ArrayList<>();
        projets.add(new Projet("Lomography", "Site d'e-commerce de photographie"));
        projets.add(new Projet("Lomography App", "Application mobile de lomgoraphy"));

        ListView listViewProjet = findViewById(R.id.listViewProjet);
        ProjetBaseAdapter projetAdapter = new ProjetBaseAdapter(projets, this);
        listViewProjet.setAdapter(projetAdapter);
        /*********** Fin Partie projet ***********/

        ImageButton myButton = (ImageButton) findViewById(R.id.imageButtonRetour);

        myButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
    }
}
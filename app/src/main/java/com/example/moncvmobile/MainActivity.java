package com.example.moncvmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /************ Partie Experience ************/
        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("Septembre 2021", "Aout 2022", "Isphers", "Développeur web"));
        experiences.add(new Experience("Septembre 2023", "Aout 2023", "AB6", "Concepteur développeur d'application"));

        ListView listViewExperiences = findViewById(R.id.ListViewExp);
        ExperienceBaseAdapter experienceAdapter = new ExperienceBaseAdapter(experiences, this);
        listViewExperiences.setAdapter(experienceAdapter);

        /************ Partie Formations ************/
        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2022", "BTS SIO SLAM", "PARIS"));
        formations.add(new Formation("2023", "Concepteur Developpeur d'Application", "PARIS"));

        ListView listViewFormations = findViewById(R.id.ListViewFormation);
        FormationBaseAdapter formationAdapter = new FormationBaseAdapter(formations, this);
        listViewFormations.setAdapter(formationAdapter);

        /************ Button pour second activity ************/

        Button myButton = (Button) findViewById(R.id.ButtonCompetences);

        myButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }
}
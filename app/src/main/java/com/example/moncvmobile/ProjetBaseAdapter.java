package com.example.moncvmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {

    private ArrayList<Projet> projets;

    private Context context;

    public ProjetBaseAdapter(ArrayList<Projet> projets, Context context) {
        this.projets = projets;
        this.context = context;
    }

    @Override
    public int getCount() {
        return projets.size();
    }

    @Override
    public Object getItem(int i) {
        return projets.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_projet, viewGroup, false);
        }

        TextView textViewNomProjet = view.findViewById(R.id.textViewNomProjet);
        textViewNomProjet.setText(projets.get(i).getNom());
        TextView textViewDescriptionProjet = view.findViewById(R.id.textViewDescriptionProjet);
        textViewDescriptionProjet.setText(projets.get(i).getDescription());
        return view;
    }
}

package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recycler.adapter.GalloAdapter;
import com.example.recycler.models.Gallo;
import com.example.recycler.models.Pico;

public class Recycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        List<Gallo> gallos = new ArrayList<>();
        gallos.add(new Gallo("Paco", "Alakin", new Pico("Grande", "Rojo")));
        gallos.add(new Gallo("Pepe", "Shamo", new Pico("Chico", "Amarillo")));
        gallos.add(new Gallo("Jose", "Giro", new Pico("Grande", "Blanco")));

        GalloAdapter ga = new GalloAdapter(gallos);
        RecyclerView rv = findViewById(R.id.rvGallo);
        rv.setAdapter(ga);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}
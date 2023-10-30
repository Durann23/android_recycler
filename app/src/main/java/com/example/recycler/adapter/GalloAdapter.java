package com.example.recycler.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler.R;
import com.example.recycler.models.Gallo;

import java.util.List;

public class GalloAdapter extends RecyclerView.Adapter<GalloAdapter.ViewHolder> {


    private List<Gallo> gallos;

    public GalloAdapter(List<Gallo> gallos) {
        this.gallos = gallos;
    }



    @NonNull
    @Override
    public GalloAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.galloitem, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull GalloAdapter.ViewHolder holder, int position) {
        Gallo g = gallos.get(position);
        holder.setData(g);

    }

    @Override
    public int getItemCount() {
        return gallos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        Gallo galloHolder;
        TextView txtnombre, txtraza, txtpico;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.tvNombre);
            txtraza = itemView.findViewById(R.id.tvRaza);
            txtpico = itemView.findViewById(R.id.tvPico);


        }

        public void setData(Gallo g) {
            this.galloHolder = g;
            txtnombre.setText(g.getNombre());
            txtraza.setText(g.getPico().getTamano());


        }
    }
}

package com.example.myislandbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Map_Adapt extends RecyclerView.Adapter<MapViewHolder> {

    public Map_Adapt() {

    }

    @NonNull
    @Override
    public MapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.grid_cell,parent,false);
        MapViewHolder myViewHolder = new MapViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MapViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }
}

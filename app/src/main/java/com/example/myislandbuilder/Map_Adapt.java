package com.example.myislandbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Map_Adapt extends RecyclerView.Adapter<MapViewHolder> {

    MapData md;
    MapElement me;
    public Map_Adapt() {
        md = MapData.get();
        me = md.get(2,6);
    }

    @NonNull
    @Override
    public MapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.grid_cell,parent,false);
        MapViewHolder myViewHolder = new MapViewHolder(v);
        return myViewHolder;*/

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_cell, parent, false);
        MapViewHolder myViewHolder = new MapViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MapViewHolder holder, int position) {
        int row = position % MapData.HEIGHT;
        int col = position / MapData.HEIGHT;
        MapElement me = md.get(row, col);
        holder.TL.setImageResource(me.getNorthWest());
        holder.TR.setImageResource(me.getNorthEast());
        holder.BL.setImageResource(me.getSouthWest());
        holder.BR.setImageResource(me.getSouthEast());
    }

    @Override
    public int getItemCount() {

        int height = md.HEIGHT;
        return height;
    }


}

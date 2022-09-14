package com.example.myislandbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Map_Adapt extends RecyclerView.Adapter<MapViewHolder> {

    MapData md;
    View pv;
    public Map_Adapt(MapData md, View pv) {
       this.md = md;
       this.pv = pv;
    }

    @NonNull
    @Override
    public MapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.grid_cell,parent,false);
        int size = pv.getMeasuredHeight() / MapData.HEIGHT + 1;// no idea what the fuck is going on
        ViewGroup.LayoutParams lp = v.getLayoutParams();
        lp.width = size;
        lp.height = size;
        MapViewHolder myViewHolder = new MapViewHolder(v);
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
        //holder.full.setImageResource(me.getStructure().getDrawableId());
    }

    @Override
    public int getItemCount() {
        return MapData.HEIGHT*MapData.WIDTH;
    }


}

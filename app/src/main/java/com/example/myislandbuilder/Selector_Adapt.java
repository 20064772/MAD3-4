package com.example.myislandbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Selector_Adapt extends RecyclerView.Adapter<SelectorViewHolder> {

    StructureData sd;
    public Selector_Adapt() {
        this.sd = StructureData.get();
    }

    @NonNull
    @Override
    public SelectorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.list_selection,parent,false);
        SelectorViewHolder myViewHolder = new SelectorViewHolder(v);
        return myViewHolder;
    }


    @Override
    public  void onBindViewHolder(@NonNull SelectorViewHolder holder, int position) {

        Structure structure = sd.get(position);
        holder.selectorImageName.setText(""+structure.getLabel());
        holder.selectorImage.setImageResource(structure.getDrawableId());

    }

    @Override
    public int getItemCount() {

        return sd.size();
    }
}

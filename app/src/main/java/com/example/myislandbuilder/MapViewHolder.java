package com.example.myislandbuilder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MapViewHolder extends RecyclerView.ViewHolder {

        ImageView full;
        ImageView TL;
        ImageView TR;
        ImageView BL;
        ImageView BR;

    public MapViewHolder(@NonNull View itemView) {
        super(itemView);
        /*int size = pv.getMeasuredHeight() / MapData.HEIGHT + 1;// no idea what the fuck is going on
        ViewGroup.LayoutParams lp = pv.getLayoutParams();
        lp.width = size;
        lp.height = size;*/
        full = itemView.findViewById(R.id.full);
        TL = itemView.findViewById(R.id.topLeft);
        TR = itemView.findViewById(R.id.topRight);
        BL = itemView.findViewById(R.id.bottomLeft);
        BR = itemView.findViewById(R.id.bottomRight);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}

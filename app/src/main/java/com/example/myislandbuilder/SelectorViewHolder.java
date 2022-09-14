package com.example.myislandbuilder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorViewHolder extends RecyclerView.ViewHolder {

    ImageView selectorImage;
    TextView selectorImageName;

    public SelectorViewHolder(@NonNull View itemView) {
        super(itemView);
        selectorImage = itemView.findViewById(R.id.image);
        selectorImageName = itemView.findViewById(R.id.imageName);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    
            }
        });
    }
}

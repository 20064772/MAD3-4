package com.example.myislandbuilder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Map_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Map_Fragment extends Fragment {


    public Map_Fragment() {
        // Required empty public constructor
    }



    // TODO: Rename and change types and number of parameters
    public static Map_Fragment newInstance() {
        Map_Fragment fragment = new Map_Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        MapData md = MapData.get();
        View v = inflater.inflate(R.layout.fragment_map, container, false);
        RecyclerView rv = v.findViewById(R.id.mapRecyclerView);
        rv.setLayoutManager(new GridLayoutManager(getActivity(), MapData.HEIGHT, GridLayoutManager.HORIZONTAL, false));
        Map_Adapt mapAdaptor = new Map_Adapt(md, v);
        rv.setAdapter(mapAdaptor);
        return v;

    }
}
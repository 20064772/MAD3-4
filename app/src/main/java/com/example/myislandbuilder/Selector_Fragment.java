package com.example.myislandbuilder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Selector_Fragment extends Fragment {

    public Selector_Fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Selector_Fragment newInstance(String param1, String param2) {
        Selector_Fragment fragment = new Selector_Fragment();
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

        View v =  inflater.inflate(R.layout.fragment_selector, container, false);
        RecyclerView rv = v.findViewById(R.id.SelectorRecyclerView);
        rv.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        Selector_Adapt selectorAdaptor = new Selector_Adapt();
        rv.setAdapter(selectorAdaptor);
        return v;
    }
}
package com.example.myislandbuilder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.nio.channels.Selector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment map = (Map_Fragment) fm.findFragmentById(R.id.map);
        Fragment selector = (Selector_Fragment) fm.findFragmentById(R.id.selector); //need to create the view like Map_Fragment

        if (map == null){
            map = new Map_Fragment();
            fm.beginTransaction().add(R.id.map, map).commit();
        }

        if (selector == null){
            selector = new Selector_Fragment();
            fm.beginTransaction().add(R.id.selector, selector).commit();
        }
    }
}
package com.example.latihan2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class belah_ketupat extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_belah_ketupat, container, false);
    }

    public String getDiameter1(){
        EditText d1 = getView().findViewById(R.id.diameter1);
        return d1.getText().toString();
    }

    public String getDiameter2(){
        EditText d2 = getView().findViewById(R.id.diameter2);
        return d2.getText().toString();
    }
}

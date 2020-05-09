package com.example.latihan2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class trapesium extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trapesium, container, false);
    }

    public String getNilaiA(){
        EditText nilaiA = getView().findViewById(R.id.a);
        return nilaiA.getText().toString();
    }

    public String getNilaiC(){
        EditText nilaiC = getView().findViewById(R.id.c);
        return nilaiC.getText().toString();
    }

    public String getTinggi(){
        EditText tinggi = getView().findViewById(R.id.t);
        return tinggi.getText().toString();
    }
}

package com.example.latihan2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class jajar_genjang extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jajar_genjang, container, false);
    }

    public String getNilaiA(){
        EditText a = getView().findViewById(R.id.a);
        return a.getText().toString();
    }

    public String getTinggi(){
        EditText t = getView().findViewById(R.id.t);
        return t.getText().toString();
    }
}

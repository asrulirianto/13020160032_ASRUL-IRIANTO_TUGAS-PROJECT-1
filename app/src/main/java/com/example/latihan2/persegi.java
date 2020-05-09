package com.example.latihan2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class persegi extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi, container, false);
    }

    public String getSisi() {
        EditText sisi = getView().findViewById(R.id.sisi);
        return sisi.getText().toString();
    }
}

package com.example.latihan2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link persegi_panjang#newInstance} factory method to
 * create an instance of this fragment.
 */
public class persegi_panjang extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false);
    }

    public String getPanjang() {
        EditText panjang = getView().findViewById(R.id.panjang);
        return panjang.getText().toString();
    }

    public String getLebar(){
        EditText lebar = getView().findViewById(R.id.lebar);
        return lebar.getText().toString();
    }
}

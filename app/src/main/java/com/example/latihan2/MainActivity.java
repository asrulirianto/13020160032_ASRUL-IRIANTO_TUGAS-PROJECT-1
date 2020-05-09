package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    persegi persegi;
    persegi_panjang persegiPanjang;
    belah_ketupat belahKetupat;
    jajar_genjang jajarGenjang;
    layang_layang layangLayang;
    trapesium trapesium;
    Button btn;
    EditText tinggiLimas;
    TextView hasilHitung;
    float s,tl,a,t,c,p,l,d1,d2,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        btn = findViewById(R.id.btn_hitung);
        hasilHitung = findViewById(R.id.hasil);
        tinggiLimas = findViewById(R.id.tinggi_limas);
        persegi = new persegi();
        persegiPanjang = new persegi_panjang();
        belahKetupat = new belah_ketupat();
        jajarGenjang = new jajar_genjang();
        layangLayang = new layang_layang();
        trapesium = new trapesium();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.category));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1 : setFragment(persegi);
                        break;
                    case 2 : setFragment(persegiPanjang);
                        break;
                    case 3 : setFragment(belahKetupat);
                        break;
                    case 4 : setFragment(jajarGenjang);
                        break;
                    case 5 : setFragment(layangLayang);
                        break;
                    case 6 : setFragment(trapesium);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = spinner.getSelectedItemPosition();
                switch (i){
                    case 1 : s = Float.parseFloat(persegi.getSisi());
                        tl = Float.parseFloat(tinggiLimas.getText().toString());
                        hasil = s*s*tl/3;
                        hasilHitung.setText(String.valueOf(hasil+" cm"));
                        break;
                    case 2 :   p = Float.parseFloat(persegiPanjang.getPanjang());
                        l = Float.parseFloat(persegiPanjang.getLebar());
                        tl = Float.parseFloat(tinggiLimas.getText().toString());
                        hasil = p*l*tl/3;
                        hasilHitung.setText(String.valueOf(hasil+" cm"));
                        break;
                    case 3 : d1 = Float.parseFloat(belahKetupat.getDiameter1());
                             d2 = Float.parseFloat(belahKetupat.getDiameter2());
                             tl = Float.parseFloat(tinggiLimas.getText().toString());
                             hasil = (d1*d2*tl/2)/3;
                             hasilHitung.setText(String.valueOf(hasil+" cm"));
                             break;
                    case 4 : a = Float.parseFloat(jajarGenjang.getNilaiA());
                             t = Float.parseFloat(jajarGenjang.getTinggi());
                             tl = Float.parseFloat(tinggiLimas.getText().toString());
                             hasil = a*t*tl/3;
                             hasilHitung.setText(String.valueOf(hasil+" cm"));
                             break;
                    case 5 : d1 = Float.parseFloat(layangLayang.getDiameter1());
                             d2 = Float.parseFloat(layangLayang.getDiameter2());
                             tl = Float.parseFloat(tinggiLimas.getText().toString());
                             hasil = (d1*d2*tl/2)/3;
                             hasilHitung.setText(String.valueOf(hasil+" cm"));
                             break;
                    case 6 : a = Float.parseFloat(trapesium.getNilaiA());
                             c = Float.parseFloat(trapesium.getNilaiC());
                             t = Float.parseFloat(trapesium.getTinggi());
                             tl = Float.parseFloat(tinggiLimas.getText().toString());
                             hasil = ((a+c)*t*tl/2)/3;
                             hasilHitung.setText(String.valueOf(hasil+" cm"));
                }

            }
        });
    }

    public void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
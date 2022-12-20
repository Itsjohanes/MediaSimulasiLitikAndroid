package com.johanes.loop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForLoopActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_loop);
        b1 = findViewById(R.id.hasilButton);
        t1 = findViewById(R.id.hasil);
        e1 = findViewById(R.id.angkaBawah);
        e2 = findViewById(R.id.angkaAtas);
        b1.setOnClickListener(v -> {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()){
                    e1.setText("Masukkan Angka");
                    e2.setText("Masukkan Angka");
                }else {
                    int angkaBawah = Integer.parseInt(e1.getText().toString());
                    int angkaAtas = Integer.parseInt(e2.getText().toString());
                    String hasil = "";
                    for (int i = angkaBawah; i <= angkaAtas; i++) {
                        hasil += i;
                    }
                    t1.setText(hasil);

                }
        });

    }
}
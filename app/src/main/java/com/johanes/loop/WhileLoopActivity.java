package com.johanes.loop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WhileLoopActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_while_loop);
        b1 = findViewById(R.id.hasilButton);
        t1 = findViewById(R.id.hasil);
        e1 = findViewById(R.id.angka);
        b1.setOnClickListener(v -> {
            if(e1.getText().toString().isEmpty()){
                e1.setText("Masukkan Angka");
            }else {
                int angka = Integer.parseInt(e1.getText().toString());
                String hasil = "";
                while (angka < 11){
                    hasil += angka;
                    angka++;
                }
                t1.setText(hasil);
            }
        });
    }
}
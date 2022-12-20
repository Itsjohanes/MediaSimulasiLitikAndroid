package com.johanes.loop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class HalamanAwal extends AppCompatActivity {

    private int waktu_loading=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_halaman_awal);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //Menghilangkan Title Bar
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity
                Intent launch=new Intent(HalamanAwal.this, MainActivity.class);
                startActivity(launch);
                finish();
            }
        },waktu_loading);
    }
}
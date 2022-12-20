package com.johanes.loop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.forLoopButton);
        b2 = findViewById(R.id.whileLoopButton);
        b3 = findViewById(R.id.doWhileLoopButton);
        b1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ForLoopActivity.class));
        });
        b2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, WhileLoopActivity.class));
        });
        b3.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DoWhileLoop.class));
        });

    }
}
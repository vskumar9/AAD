package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String n=getIntent().getStringExtra("key");
        Toast.makeText(this, "welcome to "+n, Toast.LENGTH_SHORT).show();
    }
}
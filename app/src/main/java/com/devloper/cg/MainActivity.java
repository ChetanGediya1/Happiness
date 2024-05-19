package com.devloper.cg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.devloper.cgdeveloper.WildClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WildClass.createToast(this,"ddd");


    }
}
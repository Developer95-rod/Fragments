package com.example.fragments;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btnFragment1);
        button2 = findViewById(R.id.btnFragment2);



        button1.setOnClickListener(view -> {
            fragment = new Fragment_1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault, fragment);
            ft.commit();
        });

        button2.setOnClickListener(view -> {
            fragment = new Fragment_2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault, fragment);
            ft.commit();
        });

    }
}
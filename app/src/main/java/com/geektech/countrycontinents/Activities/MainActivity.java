package com.geektech.countrycontinents.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.countrycontinents.UI.Adapter.ContinentFragments;
import com.geektech.countrycontinents.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragments()).commit();
    }
}
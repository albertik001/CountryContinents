package com.geektech.countrycontinents.ui.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.countrycontinents.databinding.ActivityMainBinding;
import com.geektech.countrycontinents.ui.fragments.ContinentFragments;
import com.geektech.countrycontinents.R;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragments()).commit();
    }
}
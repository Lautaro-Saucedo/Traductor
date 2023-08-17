package com.example.ejemplointent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.ejemplointent.databinding.ActivityTraducirBinding;

public class TraducirActivity extends AppCompatActivity {

    TraducirActivityViewModel tavm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTraducirBinding bind = ActivityTraducirBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        tavm = ViewModelProvider.AndroidViewModelFactory
            .getInstance(getApplication())
            .create(TraducirActivityViewModel.class);
        tavm.getMldPalabra().observe(this, s -> {
            bind.tvTraducido.setText(s);
            });
        tavm.getMldImagen().observe(this, i -> {
            bind.ivImagen.setImageResource(i);
        });
        tavm.algo(getIntent().getStringExtra("palabra"));
    }
}
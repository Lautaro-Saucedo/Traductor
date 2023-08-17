package com.example.ejemplointent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejemplointent.databinding.ActivityMainBinding;
import com.example.ejemplointent.databinding.ActivityTraducirBinding;

public class MainActivity extends AppCompatActivity {
    MainActivityViewModel mavm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        mavm= ViewModelProvider.AndroidViewModelFactory
                .getInstance(getApplication())
                .create(MainActivityViewModel.class);
        bind.bTraducir.setOnClickListener(view -> mavm.traducir(bind.etPalabra.getText().toString()));
    }
}

/*

bind = ActivityTraducirBinding.inflate(getLayoutInflater());
View view = bind.getRoot();
setContentView(view);
Intent i = new Intent();

bTraducir=findViewById(R.id.bTraducir);
bTraducir.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, TraducirActivity.class);
        i.putExtra("edad",etEdad.getText().toString());
        startActivity(i);
    }
});

*/
package com.example.ejemplointent;

import android.app.Application;
import android.content.Context;
import android.media.Image;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.HashMap;
import java.util.Map;

public class TraducirActivityViewModel extends AndroidViewModel {
    MutableLiveData<String> mldPalabra = new MutableLiveData<>();
    MutableLiveData<Integer> mldImagen = new MutableLiveData<>();
    Context context;
    public TraducirActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public void algo(String palabra){
        switch (palabra){
            case "tortuga": {
                mldPalabra.setValue("turtle");
                mldImagen.setValue(R.drawable.img1);
                break;
            }
            case "ardilla": {
                mldPalabra.setValue("squirrel");
                mldImagen.setValue(R.drawable.img2);
                break;
            }
            case "caballo": {
                mldPalabra.setValue("horse");
                mldImagen.setValue(R.drawable.img3);
                break;
            }
            case "perro": {
                mldPalabra.setValue("dog");
                mldImagen.setValue(R.drawable.img4);
                break;
            }
            case "gato": {
                mldPalabra.setValue("cat");
                mldImagen.setValue(R.drawable.img5);
                break;
            }
            default: {
                mldPalabra.setValue("Sin Resultados");
                mldImagen.setValue(R.drawable.noimg);
            }

        }

    }

    public LiveData<String> getMldPalabra() {
        return mldPalabra;
    }
    public LiveData<Integer> getMldImagen() {
        return mldImagen;
    }
}
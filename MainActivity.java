package com.example.ejemplofragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaccion;
    Fragment rojo, verde, azul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rojo = new RojoFragment();
        verde = new VerdeFragment();
        azul = new AzulFragment();

    }

    public void onClick(View view) {

        transaccion = getSupportFragmentManager().beginTransaction();

        switch (view.getId()) {

            case R.id.buttonRojo:
                transaccion.replace(R.id.contenedorFragmentos, rojo);
                transaccion.addToBackStack(null);
                break;
            case R.id.buttonAzul:
                transaccion.replace(R.id.contenedorFragmentos, azul);
                transaccion.addToBackStack(null);
                break;
            case R.id.buttonVerde:
                transaccion.replace(R.id.contenedorFragmentos, verde);
                transaccion.addToBackStack(null);
                break;

        }
        transaccion.commit();

    }
}
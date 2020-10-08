package com.marcosledesma.ejemplo01_introandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 1. CREAR LAS VARIABLES
    private TextView txtTitulo;
    private TextView txtContador;
    private Button btnAnonimo;
    private Button btnMetodo;

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Aquí asociamos el xml a la clase Main (res/layout/activity_main.xml)

        // 2. ASOCIAR LA VISTA CON LAS VARIABLES
        inicializaVariables();

        // 3. TRABAJAR CON LA VISTA (Variable)
        txtTitulo.setText("Primera App");
        btnAnonimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                txtContador.setText(String.valueOf(contador));
            }
        });
    }

    private void inicializaVariables() {
        txtTitulo = findViewById(R.id.txtTituloMain);
        txtContador = findViewById(R.id.txtContadorMain);
        btnAnonimo = findViewById(R.id.btnAnonimoMain);
        btnMetodo = findViewById(R.id.btnMetodoMain);
    }

    public void clickMetodo(View view){
        contador++;
        txtContador.setText(String.valueOf(contador));
    }
}
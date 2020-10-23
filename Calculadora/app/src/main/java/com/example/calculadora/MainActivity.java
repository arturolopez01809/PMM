package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double operando1 = 0.0;
    private double operando2 = 0.0;
    private String operador;

    public void CrearMetodosBotonses(){

        final TextView textView_grande = findViewById(R.id.textViewIntroducirUsuario);
        final TextView textView_enano = findViewById(R.id.textViewOperaciones);

        Button boton_borrar_todo = findViewById(R.id.buttonClearAll);

        boton_borrar_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText("");
                textView_enano.setText("");
            }
        });


        Button botonUno = findViewById(R.id.buttonUno);

        botonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText("1");
            }
        });

        Button botonDos = findViewById(R.id.buttonDos);

        botonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText("2");
            }
        });

        Button botonTres = findViewById(R.id.buttonTres);

        botonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText("3");
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CrearMetodosBotonses();

    }
}
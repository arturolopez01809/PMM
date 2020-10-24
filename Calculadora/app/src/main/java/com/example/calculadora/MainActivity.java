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
                textView_grande.setText(textView_grande.getText() + "1");
            }
        });

        Button botonDos = findViewById(R.id.buttonDos);

        botonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "2");
            }
        });

        Button botonTres = findViewById(R.id.buttonTres);

        botonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "3");
            }
        });

        Button botonCuatro = findViewById(R.id.buttonCuatro);

        botonCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "4");
            }
        });

        Button botonCinco= findViewById(R.id.buttonCinco);

        botonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "5");
            }
        });

        Button botonSeis = findViewById(R.id.buttonSeis);

        botonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "6");
            }
        });

        Button botonSiete = findViewById(R.id.buttonSiete);

        botonSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "7");
            }
        });

        Button botonOcho = findViewById(R.id.buttonOcho);

        botonOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "8");
            }
        });

        Button botonNueve = findViewById(R.id.buttonNueve);

        botonNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "9");
            }
        });

        Button botonCero = findViewById(R.id.buttonCero);

        botonCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "0");
            }
        });

        Button botonSumar = findViewById(R.id.buttonSumar);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operando1 = Double.valueOf((String) textView_grande.getText());
                textView_enano.setText(textView_grande.getText() + "+");
                textView_grande.setText("");
                operador = "+";
            }
        });

        Button botonDividir = findViewById(R.id.buttonDividir);

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operando1 = Double.valueOf((String) textView_grande.getText());
                textView_enano.setText(textView_grande.getText() + "/");
                textView_grande.setText("");
                operador = "/";
            }
        });

        Button botonProducto = findViewById(R.id.buttonProducto);

        botonProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operando1 = Double.valueOf((String) textView_grande.getText());
                textView_enano.setText(textView_grande.getText() + "%");
                textView_grande.setText("");
                operador = "%";
            }
        });

        Button botonMultiplicar = findViewById(R.id.buttonMultiplicar);

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operando1 = Double.valueOf((String) textView_grande.getText());
                textView_enano.setText(textView_grande.getText() + "*");
                textView_grande.setText("");
                operador = "*";
            }
        });

        Button botonResta = findViewById(R.id.buttonResta);

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operando1 = Double.valueOf((String) textView_grande.getText());
                textView_enano.setText(textView_grande.getText() + "-");
                textView_grande.setText("");
                operador = "-";
            }
        });

        Button botonIgual = findViewById(R.id.buttonIgual);

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operando2 = Double.valueOf((String) textView_grande.getText());

                textView_enano.setText(operando1 + " " + operador + " " + operando2);
                double res = 0.0;

                if(operador == "+"){
                    res = Sumar(operando1, operando2);
                }else if(operador == "-"){
                    res = Restar(operando1, operando2);
                } else if(operador == "*"){
                    res = Multiplicar(operando1, operando2);
                } else if(operador == "/"){
                    res = Dividir(operando1, operando2);
                }

                textView_grande.setText(String.valueOf(res));

            }
        });

    }

    public double Sumar(double a, double b){
        return a + b;
    }

    public double Restar(double a, double b){
        return a - b;
    }

    public double Multiplicar(double a, double b){
        return a * b;
    }

    public double Dividir(double a, double b){
        return a / b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CrearMetodosBotonses();

    }
}
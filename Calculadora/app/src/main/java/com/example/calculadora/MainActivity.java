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
    private int contador_operadores  = 0;
    private double res = 0.0;

    public void CrearMetodosBotonses(){

        final TextView textView_grande = findViewById(R.id.textViewIntroducirUsuario);
        final TextView textView_enano = findViewById(R.id.textViewOperaciones);

        Button boton_borrar_todo = findViewById(R.id.buttonClearAll);

        boton_borrar_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText("");
                textView_enano.setText("");
                operando1 = 0.0;
                operando2 = 0.0;
                operador = "";
                res = 0.0;
            }
        });


        Button botonUno = findViewById(R.id.buttonUno);

        botonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "1");
                operando2 = 1;
            }
        });

        Button botonPunto = findViewById(R.id.buttonPunto);

        botonPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + ".");
            }
        });

        Button botonDos = findViewById(R.id.buttonDos);

        botonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "2");
                operando2 = 2;
            }
        });

        Button botonTres = findViewById(R.id.buttonTres);

        botonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "3");
                operando2 = 3;
            }
        });

        Button botonCuatro = findViewById(R.id.buttonCuatro);

        botonCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "4");
                operando2 = 4;
            }
        });

        Button botonCinco= findViewById(R.id.buttonCinco);

        botonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "5");
                operando2 = 5;
            }
        });

        Button botonSeis = findViewById(R.id.buttonSeis);

        botonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "6");
                operando2 = 6;
            }
        });

        Button botonSiete = findViewById(R.id.buttonSiete);

        botonSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "7");
                operando2 = 7;
            }
        });

        Button botonOcho = findViewById(R.id.buttonOcho);

        botonOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "8");
                operando2 = 8;
            }
        });

        Button botonNueve = findViewById(R.id.buttonNueve);

        botonNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "9");
                operando2 = 9;
            }
        });

        Button botonCero = findViewById(R.id.buttonCero);

        botonCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_grande.setText(textView_grande.getText() + "0");
                operando2 = 0;
            }
        });

        Button botonSumar = findViewById(R.id.buttonSumar);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RealizarOperacion();

                if(contador_operadores == 0) {

                    operando2 = 0.0;
                    operando1 = Double.valueOf((String) textView_grande.getText());

                    res = Sumar(operando1 ,operando2);

                    textView_enano.setText(String.valueOf(res));
                }

                if(contador_operadores >= 1){

                    operando1 = Double.valueOf((String) textView_enano.getText());
                    //operando2 = Double.valueOf((String) textView_grande.getText());

                    res = Sumar(operando1, operando2);

                    textView_enano.setText(String.valueOf(res));
                }

                textView_grande.setText(textView_grande.getText() + " + ");

                //textView_grande.setText("");

                contador_operadores++;

                operador = "+";
            }
        });

        Button botonDividir = findViewById(R.id.buttonDividir);

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(contador_operadores == 0) {

                    operando2 = 1;
                    operando1 = Double.valueOf((String) textView_grande.getText());

                    res = Dividir(operando1 ,operando2);

                    textView_enano.setText(String.valueOf(res));
                }

                if(contador_operadores >= 1){

                    operando1 = Double.valueOf((String) textView_enano.getText());
                    //operando2 = Double.valueOf((String) textView_grande.getText());

                    res = Dividir(operando1, operando2);

                    textView_enano.setText(String.valueOf(res));
                }

                textView_grande.setText(textView_grande.getText() + " / ");

                //textView_grande.setText("");

                contador_operadores++;

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

                textView_enano.setText(textView_grande.getText());

                RealizarOperacion();

                textView_grande.setText(String.valueOf(res));

                contador_operadores = 0;

            }
        });

    }

    public void RealizarOperacion(){

        if(operador == "+"){
            res = Sumar(res, operando2);
        }else if(operador == "-"){
            res = Restar(res, operando2);
        } else if(operador == "*"){
            res = Multiplicar(res, operando2);
        } else if(operador == "/"){
            res = Dividir(res, operando2);
        }

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
package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double operando1 = 0.0;
    private double operando2 = 0.0;
    private String operador = "";
    private int contador_operadores  = 0;
    private double res = 0.0;
    private boolean poder_borrar = true;

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
                if(poder_borrar){
                    textView_grande.setText("1");
                    poder_borrar = false;
                } else if(!poder_borrar) {
                    textView_grande.setText(textView_grande.getText() + "1");
                    operando2 = 1;
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
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
                if(poder_borrar){
                    textView_grande.setText("2");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "2");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
            }
        });

        Button botonTres = findViewById(R.id.buttonTres);

        botonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(poder_borrar){
                    textView_grande.setText("3");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "3");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
            }
        });

        Button botonCuatro = findViewById(R.id.buttonCuatro);

        botonCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(poder_borrar){
                    textView_grande.setText("4");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "4");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
            }
        });

        Button botonCinco= findViewById(R.id.buttonCinco);

        botonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(poder_borrar){
                    textView_grande.setText("5");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "5");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
            }
        });

        Button botonSeis = findViewById(R.id.buttonSeis);

        botonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(poder_borrar){
                    textView_grande.setText("6");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "6");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
            }
        });

        Button botonSiete = findViewById(R.id.buttonSiete);

        botonSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(poder_borrar){
                    textView_grande.setText("7");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "7");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
            }
        });

        Button botonOcho = findViewById(R.id.buttonOcho);

        botonOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(poder_borrar){
                    textView_grande.setText("8");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "8");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
            }
        });

        Button botonNueve = findViewById(R.id.buttonNueve);

        botonNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(poder_borrar){
                    textView_grande.setText("9");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "9");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());


            }
        });

        Button botonCero = findViewById(R.id.buttonCero);

        botonCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(poder_borrar){
                    textView_grande.setText("0");
                    poder_borrar = false;
                } else if(!poder_borrar){
                    textView_grande.setText(textView_grande.getText() + "0");
                }

                operando2 = Double.valueOf((String) textView_grande.getText());
            }
        });

        Button botonMasMenos = findViewById(R.id.buttonMasMenos);

        botonMasMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(operando2 >= 0){
                    operando2*=-1;
                } else {
                    operando2*=-1;
                }

                textView_grande.setText(String.valueOf(operando2));

                poder_borrar = true;
            }
        });

        Button botonSumar = findViewById(R.id.buttonSumar);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView_enano.append(operando2 + " + ");

                RealizarOperacion();

                textView_grande.setText(String.valueOf(res));

                poder_borrar = true;
                operador = "+";
            }
        });

        Button botonDividir = findViewById(R.id.buttonDividir);

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView_enano.append(operando2 + " / ");

                RealizarOperacion();

                textView_grande.setText(String.valueOf(res));

                poder_borrar = true;
                operador = "/";

            }
        });

        Button botonProducto = findViewById(R.id.buttonProducto);

        botonProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_enano.append(operando2 + " % ");

                RealizarOperacion();

                textView_grande.setText(String.valueOf(res));

                poder_borrar = true;
                operador = "%";
            }
        });

        Button botonMultiplicar = findViewById(R.id.buttonMultiplicar);

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_enano.append(operando2 + " * ");

                RealizarOperacion();

                textView_grande.setText(String.valueOf(res));

                poder_borrar = true;
                operador = "*";
            }
        });

        Button botonResta = findViewById(R.id.buttonResta);

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_enano.append(operando2 + " - ");

                RealizarOperacion();

                textView_grande.setText(String.valueOf(res));

                poder_borrar = true;
                operador = "-";
            }
        });

        Button botonIgual = findViewById(R.id.buttonIgual);

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView_enano.append(String.valueOf(operando2) + " =");

                RealizarOperacion();

                textView_grande.setText(String.valueOf(res));

                poder_borrar = true;
                operando1 = 0.0;
                operando2 = 0.0;
                operador = "";

            }
        });
    }

    public void RealizarOperacion(){
        if(operador == ""){
            res = operando2;
        } else if(operador == "+"){
            res = Sumar(res, operando2);
        }else if(operador == "-"){
            res = Restar(res, operando2);
        } else if(operador == "*"){
            res = Multiplicar(res, operando2);
        } else if(operador == "/"){
            res = Dividir(res, operando2);
        } else if(operador == "%"){
            res = Producto(operando2);
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

    public double Producto(double a){
        return a/100;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CrearMetodosBotonses();

    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_Suma;
    private Button btn_Resta;
    private  Button btn_Producto;
    private Button btn_Division;
    private EditText numerouno;
    private EditText numerodos;
    private TextView mostrar;

    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numerouno=findViewById(R.id.PrimerNumero);
        numerodos=findViewById(R.id.SegundoNumero);
        mostrar=findViewById(R.id.texto_resultado);
        btn_Suma = findViewById(R.id.boton_suma);
        btn_Resta = findViewById(R.id.Resta);
        btn_Division=findViewById(R.id.Division);
        btn_Producto=findViewById(R.id.Producto);




        btn_Suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mostrar.setText(suma(Integer.parseInt(numerouno.getText().toString()), Integer.parseInt(numerodos.getText().toString() ))+"");
            }
        });



        btn_Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mostrar.setText(resta(Integer.parseInt(numerouno.getText().toString()), Integer.parseInt(numerodos.getText().toString() ))+"");
            }




        });

        btn_Producto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mostrar.setText(producto(Integer.parseInt(numerouno.getText().toString()), Integer.parseInt(numerodos.getText().toString() ))+"");
            }




        });


        btn_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi){
                mostrar.setText(division(Integer.parseInt(numerouno.getText().toString()), Integer.parseInt(numerodos.getText().toString() ))+"");
            }




        });




    }

        public int suma(int a, int b){

        return a+b;
        }

        public int resta(int a, int b){

        return a-b;
        }

        public int division(int a, int b){
        return a/b;

        }

        public int producto(int a, int b){


        return a*b;
        }


    }

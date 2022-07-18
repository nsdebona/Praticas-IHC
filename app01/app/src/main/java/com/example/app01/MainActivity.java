package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText txt_number1;
    private EditText txt_number2;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_number1 = findViewById(R.id.txt_number1);
        txt_number2 = findViewById(R.id.txt_number2);
        textResultado = findViewById(R.id.textResultado);

    }

    public void somar(View view){
        double valor1   = Double.parseDouble(txt_number1.getText().toString());
        double valor2   = Double.parseDouble(txt_number2.getText().toString());
        double soma     = valor1 + valor2;

        textResultado.setText("A soma e: " + soma);
    }
}
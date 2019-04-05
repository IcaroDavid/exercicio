package com.example.atividade2application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Realdolar(View v) {
        EditText valorReal = findViewById(R.id.TextoReal);

        if (valorReal.getText().toString().isEmpty()) {
            valorReal.setError("O valor não foi informado!");
        } else {
            double reais = Double.parseDouble(valorReal.getText().toString());

            double resultado = reais / 2.1;

            EditText valorDolar = findViewById(R.id.TextoDolar);
            valorDolar.setText(Double.toString(resultado));
        }
    }

    public void Dolarreal(View v) {
        EditText valorDolar = findViewById(R.id.TextoDolar);
        if (valorDolar.getText().toString().isEmpty()) {
            valorDolar.setText("Valor não informado!");
        } else {
            double dolar = Double.parseDouble(valorDolar.getText().toString());
            double resultado = dolar * 2.1;

            EditText valorReal = findViewById(R.id.TextoReal);
            valorReal.setText(Double.toString((resultado)));
        }
    }

    public void Converter(View v) {
        RadioButton realDolar = findViewById(R.id.converterDolar);
        if (realDolar.isChecked()) {
            Realdolar(v);
        } else {
            Dolarreal(v);
        }

    }
}

package com.example.victor.ejercicioextra2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText grados;
    RadioButton C;
    RadioButton F;
    float aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public float convertirCelsiusFahrenheit(float f) {
        return (f*9)/5+32;
    }

    public float convertirFahrenheitCelsius(float f) {
        return ((f-32)*5)/9;
    }

    public void convertirGrados(View v) {
        grados = (EditText)findViewById(R.id.etGrados);
        C = (RadioButton)findViewById(R.id.rbC);
        F = (RadioButton)findViewById(R.id.rbF);
        aux = Float.parseFloat(String.valueOf(grados));

        if (C.isChecked()) {
            grados.setText(convertirCelsiusFahrenheit(aux)+"ºC");
        }
        else if(F.isChecked()) {
            grados.setText(convertirFahrenheitCelsius(aux)+"ºF");
        }

    }
}

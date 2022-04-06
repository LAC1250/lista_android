package com.example.infernodetela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CalculadoraRadio extends AppCompatActivity {
    private EditText editCalR1,editCalR2;
    private TextView textViewRes;
    private RadioGroup radioGroup;
    private Double n1,n2,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_radio);

        editCalR1 = findViewById(R.id.editCalR1);
        editCalR2 = findViewById(R.id.editCalR2);
        textViewRes = findViewById(R.id.textViewRes);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(ouvinte);

    }

    RadioGroup.OnCheckedChangeListener ouvinte = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if(verificado()){
                n1 = Double.parseDouble(editCalR1.getText().toString());
                n2 = Double.parseDouble(editCalR2.getText().toString());
                switch(i){
                    case R.id.radioSoma:
                        resultado = n1 + n2;
                        break;
                    case R.id.radioSub:
                        resultado = n1 - n2;
                        break;
                    case R.id.radioMult:
                        resultado = n1 * n2;
                        break;
                    case R.id.radioDiv:
                        resultado = n1 / n2;
                        break;
                }
                textViewRes.setText(String.format("%.2f",resultado));
            }
        }
    };


    private boolean verificado() {
        boolean retorno = true;
        if(editCalR1.getText().toString().length()==0){
            editCalR1.setError("Preencha");
            retorno = false;
        }
        if(editCalR2.getText().toString().length()==0){
            editCalR2.setError("Preencha");
            retorno = false;
        }
        return retorno;
    }
}
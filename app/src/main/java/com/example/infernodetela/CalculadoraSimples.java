package com.example.infernodetela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraSimples extends AppCompatActivity implements View.OnClickListener {
    private EditText editN1, editN2;
    private TextView txtResultado;
    private Button btnSoma, btnSub, btnMult, btnDiv, btnClear;
    private Double n1, n2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_simples);

        editN1 = findViewById(R.id.editN1);
        editN2 = findViewById(R.id.editN2);
        txtResultado = findViewById(R.id.txtResultado);
        btnClear = findViewById(R.id.btnClear);
        btnDiv = findViewById(R.id.btnDiv);
        btnMult = findViewById(R.id.btnMult);
        btnSub = findViewById(R.id.btnSub);
        btnSoma = findViewById(R.id.btnSoma);

        btnSoma.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(verificado()){
            n1 = Double.parseDouble(editN1.getText().toString());
            n2 = Double.parseDouble(editN2.getText().toString());
            switch (view.getId()) {
                case R.id.btnSoma:
                    result = n1 + n2;
                    break;
                case R.id.btnSub:
                    result = n1 - n2;
                    break;
                case R.id.btnDiv:
                    result = n1 / n2;
                    break;
                case R.id.btnMult:
                    result = n1 * n2;
                    break;
                /*case R.id.btnClear:
                    editN1.setText("");
                    editN2.setText("");
                    txtResultado.setText("");
                    break;*/
            }
            txtResultado.setText(String.format("%.2f", result));
        }
    }

    private boolean verificado() {
        boolean retorno = true;
        if(editN1.getText().toString().length() == 0){
            editN1.setError("Preencha");
            retorno = false;
        }
        if(editN2.getText().toString().length() == 0){
            editN2.setError("Preencha");
            retorno =false;
        }
        return retorno;
    }
}
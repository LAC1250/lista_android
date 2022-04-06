package com.example.infernodetela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{
    private Button btn1,btn2;
    private EditText editNumero1;
    private TextView txtResultado;
    private Double numero;
    private Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        editNumero1 = findViewById(R.id.editNumero1);
        txtResultado = findViewById(R.id.textResultado);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(verificado()){
            numero = Double.parseDouble(editNumero1.getText().toString());
            switch (v.getId()){
                case R.id.btn1:
                    result = (numero * 3.6);
                    break;
                case R.id.btn2:
                    result = (numero / 3.6);
                    break;
            }
            txtResultado.setText("O resultado é: " + String.format("%.2f", result));
        }
        
    }

    private boolean verificado() {
        boolean retorno = true;
        if(editNumero1.getText().toString().length() == 0){
            editNumero1.setError("Preencha");
            retorno = false;
        }
        return retorno;
    }
}
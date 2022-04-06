package com.example.infernodetela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button btnTexto;
    private TextView txtTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnTexto = findViewById(R.id.btnTexto);
        txtTexto = findViewById(R.id.txt);
    }
    public void alterarTexto(View view){

        txtTexto.setText("Texto alterado");
    }
}
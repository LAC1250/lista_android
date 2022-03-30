package com.example.infernodetela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{
    private Button btnPedra,btnPapel,btnTesoura;
    private TextView txtRes;
    private ImageView imgApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnPedra = findViewById(R.id.btnPedra);
        btnPapel = findViewById(R.id.btnPapel);
        btnTesoura = findViewById(R.id.btnPapel);
        txtRes = findViewById(R.id.txtRes);
        imgApp = findViewById(R.id.imgApp);

        btnPedra.setOnClickListener(this);
        btnPapel.setOnClickListener(this);
        btnTesoura.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int numero = new Random().nextInt(3);
        String[] op = {"pedra","papel","tesoura"};
        String opApp = op[numero];
        /*switch (opApp){
            case "pedra":
                imgApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgApp.setImageResource(R.drawable.tesoura);
                break;
        }*/
        /*switch(view.getId()){
            case R.id.btnPedra:
                if(opApp == "tesoura" && )
                break;
            case R.id.btnPapel:
                break;
            case R.id.btnTesoura:
                break;
        }*/
    }
}
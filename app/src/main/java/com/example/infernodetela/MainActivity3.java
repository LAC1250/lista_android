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
        btnTesoura = findViewById(R.id.btnTesoura);
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
        if (opApp == "pedra") {
            imgApp.setImageResource(R.drawable.pedra);
        }else if(opApp == "papel"){
            imgApp.setImageResource(R.drawable.papel);
        }else{
            imgApp.setImageResource(R.drawable.tesoura);
        }
        switch(view.getId()){
            case R.id.btnPedra:
                if(opApp == "papel"){
                    txtRes.setText("App ganhou");
                }else if(opApp == "tesoura"){
                    txtRes.setText("Você ganhou");
                }else{
                    txtRes.setText("Deu empate");
                }
                break;
            case R.id.btnPapel:
                if(opApp == "tesoura"){
                    txtRes.setText("App ganhou");
                }else if(opApp == "pedra"){
                    txtRes.setText("Você ganhou");
                }else{
                    txtRes.setText("Deu empate");
                }
                break;
            case R.id.btnTesoura:
                if(opApp == "pedra"){
                    txtRes.setText("App ganhou");
                }else if(opApp == "papel"){
                    txtRes.setText("Você ganhou");
                }else{
                    txtRes.setText("Deu empate");
                }
                break;
        }
    }
}
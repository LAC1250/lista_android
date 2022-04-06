package com.example.infernodetela;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        AlertDialog.Builder janeladialogo;
        janeladialogo = new AlertDialog.Builder(MainActivity5.this);
        janeladialogo.setTitle("Janela");
        janeladialogo.setMessage("Olá");
        janeladialogo.setNeutralButton("OK", null);
        janeladialogo.show();
    }

}
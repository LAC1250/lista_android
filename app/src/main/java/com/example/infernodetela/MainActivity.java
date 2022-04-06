package com.example.infernodetela;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    private static final String [] telas = new String[]{"Alteração de texto","Pedra, Papel ou tesoura","Calculadora Simples", "Calculadora Simples com Radio Group", "Transformando KM em M/S e M/S em KM","Janela de dialogo","Checkbox + Spinner"};
    private ArrayAdapter<String> meuArrayAdapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        meuArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, telas);
        setListAdapter(meuArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch(position){
            case 0:
                intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity.this, CalculadoraSimples.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, CalculadoraRadio.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
                break;
            case 5:
               intent = new Intent(MainActivity.this, MainActivity5.class);
               startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(intent);
                break;
        }
    }
}
  /*if(position == 0){
            Toast.makeText(this,"opção selecionada", Toast.LENGTH_SHORT).show();
        }
        if(position == 2){
            intent = new Intent(MainActivity.this,CalculadoraSimples.class);
            startActivity(intent);
        }*/
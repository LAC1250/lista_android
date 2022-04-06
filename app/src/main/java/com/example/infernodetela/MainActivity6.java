package com.example.infernodetela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {
    private CheckBox checkBox1,checkBox2,checkBox3;
    private Button btnCheck;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        btnCheck = findViewById(R.id.btnCheck);
        spinner = findViewById(R.id.spinner);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()){
                    Toast.makeText(getApplicationContext(),"Check 1 marcado", Toast.LENGTH_SHORT).show();
                }
                if(checkBox2.isChecked()){
                    Toast.makeText(getApplicationContext(),"Check 2 marcado", Toast.LENGTH_SHORT).show();
                }
                if(checkBox3.isChecked()){
                    Toast.makeText(getApplicationContext(),"Check 3 marcado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ArrayList<String> dadosSpinner = new ArrayList<>();
        dadosSpinner.add("Opcao 1");
        dadosSpinner.add("Opcao 2");
        dadosSpinner.add("Opcao 3");
        dadosSpinner.add("Opcao 4");
        dadosSpinner.add("Opcao 5");

        ArrayAdapter<String> spinnerAdap = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item,dadosSpinner);
        spinner.setAdapter(spinnerAdap);
        spinner.setOnItemSelectedListener(ouvinteSpinner);
    }

    AdapterView.OnItemSelectedListener ouvinteSpinner = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            if(i == 2){
                Toast.makeText(getApplicationContext(),"Opcao 3 marcado", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
}
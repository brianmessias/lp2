package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class fatorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);
    }

    protected void calcular(View vi){
        TextView n = (TextView) findViewById(R.id.inputNum);
        int numero = Integer.parseInt(n.getText().toString());
        int a = 1;
        for(int i = 1; i <= numero; i++){
            a *= i;
        }
        TextView fat = (TextView) findViewById(R.id.caixaFat);
        fat.setText(Integer.toString(numero) + "! =" + Integer.toString(a));
    }
}

package com.example.alunos.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void calculadora (View vi){
        Intent it = new Intent(this,calculadoraActivity.class);
        startActivity(it);
    }

    protected void fibonacci (View vi){
        Intent it = new Intent(this,fibonacciActivity.class);
        startActivity(it);
    }

    protected void fatorial (View vi){
        Intent it = new Intent(this,fatorialActivity.class);
        startActivity(it);
    }
}

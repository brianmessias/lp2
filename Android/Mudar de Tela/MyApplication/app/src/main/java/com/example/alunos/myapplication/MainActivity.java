package com.example.alunos.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void abrirTela1 (View vi){
        Intent it = new Intent(this,Tela1Activity.class); //intençao de fazer alguma coisa
        startActivity(it); //inicia a intenção
    }

    protected  void abrirTela2 (View v1){
        EditText input = (EditText) findViewById(R.id.inputNome);
        String nome = input.getText().toString();
        Intent it = new Intent(this,Tela2Activity.class);
        Bundle b = new Bundle(); //vetor que trabalha com chava e valor
        b.putString("p_nome",nome); //criando variavel do tipo String no Bundle com nome "p_nome" e valor = nome
        it.putExtras(b); //associa b em it
        startActivity(it);
    }

}

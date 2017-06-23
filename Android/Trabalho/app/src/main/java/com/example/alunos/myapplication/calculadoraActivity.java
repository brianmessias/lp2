package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class calculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }
    Stack pilha = new Stack();

    protected void empilhar(View num){
        TextView view1 = (TextView) findViewById(R.id.inputNumero);
        if(view1.getText().toString().compareTo("") != 0){
            double numero = Double.parseDouble(view1.getText().toString());
            pilha.push(numero);
        }
        this.mostra();
        view1.setText("");
    }

    protected void desempilhar(View vi){
        if (!pilha.empty()){
            pilha.pop();
        }
        this.mostra();
    }

    protected void soma(View vi){
        if (pilha.size()>1){
            double n1 = (double) pilha.pop();
            double n2 = (double) pilha.pop();
            double n3 = n1 + n2;
            pilha.push(n3);
        }
        this.mostra();
    }

    protected void subtracao(View vi){
        if (pilha.size()>1){
            double n1 = (double) pilha.pop();
            double n2 = (double) pilha.pop();
            double n3 = n1 - n2;
            pilha.push(n3);
        }
        this.mostra();
    }

    protected void multiplicacao(View vi){
        if (pilha.size()>1){
            double n1 = (double) pilha.pop();
            double n2 = (double) pilha.pop();
            double n3 = n1 * n2;
            pilha.push(n3);
        }
        this.mostra();
    }

    protected void divisao(View vi){
        if (pilha.size()>1){
            double n1 = (double) pilha.pop();
            double n2 = (double) pilha.pop();
            double n3 = n1 / n2;
            pilha.push(n3);
        }
        this.mostra();
    }

    protected void limpar(View vi){
        pilha.removeAllElements();
        this.mostra();
    }

    protected void mostra(){
        TextView caixa = (TextView) findViewById(R.id.txtPilha);
        caixa.setText(pilha.toString());
    }
}

package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class fibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
    }
    Stack pilha = new Stack();
    int a;


    protected void calcular (View vi){
        TextView n = (TextView) findViewById(R.id.caixaPosicao);
        int numero = Integer.parseInt(n.getText().toString());
        if(n.getText().toString().compareTo("") != 0){
            pilha.push(0);
            pilha.push(1);
            if(numero > 2) {
                for (int i = 0; i < numero-2; i++) {
                    String num1 = pilha.pop().toString();
                    String num2 = pilha.pop().toString();
                    int num11 = Integer.parseInt(num1);
                    int num22 = Integer.parseInt(num2);
                    pilha.push(num22);
                    pilha.push(num11);
                    a = num11 + num22;
                    pilha.push(num11 + num22);
                }
                this.mostraElemento(pilha.pop().toString());
                pilha.push(a);


            }else if(numero == 1){
                pilha.pop();
                this.mostraElemento(pilha.pop().toString());
                pilha.push(0);


            }else if(numero == 2){
                this.mostraElemento(pilha.pop().toString());
                pilha.push(1);

            }
            this.mostraSequencia(vi);
            this.mostraSoma(vi);
        }
        n.setText("");
    }

    protected void mostraElemento (String vi){
        TextView elemento = (TextView) findViewById(R.id.caixaElemento);
        elemento.setText(vi);


    }

    protected void mostraSoma (View vi){
        TextView soma = (TextView) findViewById(R.id.caixaSoma);
        int b = 0;
        while(pilha.size()>0){
            String a = pilha.pop().toString();
            b +=Integer.parseInt(a);
        }
        pilha.push(b);
        soma.setText(pilha.pop().toString());
    }

    protected void mostraSequencia (View vi){
        TextView sequencia = (TextView) findViewById(R.id.caixaSequencia);
        sequencia.setText(pilha.toString());

    }

}

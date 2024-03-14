package com.example.atividade07enviarereceberdados;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class AtvEnvRec extends Activity implements View.OnClickListener {

    int opcao = 0;
    String[] cores = new String[] {"Azul","Verde","Branca","Amarela"};
    String[] tamanhos = new String[] {"36","38","40","42"};

    LinearLayout linearLayout;
    Spinner spnOpcoes;
    Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        verificarValoresExtras();
        criarTela();
        setContentView(linearLayout);
    }

    private void verificarValoresExtras() {
        //Recebendo os Dados de outra Activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            opcao = (extras.getInt("opcao"));
        }
    }

    private void criarTela() {
        //Criando Layout
        linearLayout = new LinearLayout(this);
        //Criando o Spinner conforme opção do usuário
        spnOpcoes = new Spinner(this);
        ArrayAdapter<String> adapter;
        if (opcao == 1) {
            adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, cores);
        }
        else {
            adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, tamanhos);
        }
        spnOpcoes.setAdapter(adapter);
        //Criando o Botão para fechar a Activity
        btnFechar = new Button(this);
        btnFechar.setText("Fechar");
        btnFechar.setOnClickListener(this);
        //Adicionando as views no Layout
        linearLayout.addView(spnOpcoes);
        linearLayout.addView(btnFechar);
        //Setando o Layout como correspondente visual da Activity
    }

    @Override
    public void onClick(View v) {
        Intent retorno = new Intent();
        retorno.putExtra("opcaoSel", (String)spnOpcoes.getSelectedItem());
        setResult(1, retorno);
        finish();
    }

}

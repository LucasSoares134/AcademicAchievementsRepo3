package com.example.atividade07enviarereceberdados;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class AtvEnviar extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txtDado = new TextView(this);
        //txtDado.setText("TESTE");
        setContentView(txtDado);

        //Recebendo os dados de outra Activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            txtDado.setText(extras.getString("valorEnviado"));
        }
        /*else {
            txtDado.setText("Não foi enviado nenhuma informação!");
        } */
    }
}

package com.example.atividade07enviarereceberdados;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AtvPrincipal extends AppCompatActivity implements View.OnClickListener {

    Button btnEnviar;
    Button btnCor;
    Button btnTamanho;
    EditText edtRetorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atv_principal);
        inicializarObjetos();
    }

    private void inicializarObjetos() {
        btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
        btnCor = findViewById(R.id.btnCor);
        btnCor.setOnClickListener(this);
        btnTamanho = findViewById(R.id.btnTamanho);
        btnTamanho.setOnClickListener(this);
        edtRetorno = findViewById(R.id.edtRetorno);
    }

    @Override
    public void onClick(View v) {
        if (v == btnEnviar) {
            Intent telaEnviar = new Intent(this, AtvEnviar.class);

            telaEnviar.putExtra("valorEnviado", "Qualquer valor enviado da primeira tela");
            startActivity(telaEnviar);
        }
        else if ((v == btnCor) || (v == btnTamanho)) {
            Intent telaEnvRec = new Intent(this, AtvEnvRec.class);
            Bundle extras = new Bundle();
            if (v == btnCor)
                extras.putInt("opcao", 1);
            else
                extras.putInt("opcao", 2);
            telaEnvRec.putExtras(extras);

            startActivityForResult(telaEnvRec, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            edtRetorno.setText(data.getStringExtra("opcaoSel"));
        }
    }
}

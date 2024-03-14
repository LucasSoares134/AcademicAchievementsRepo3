package com.ads.intentnativas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btnLigacao;
    Button btnContatos;
    Button btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarObjetos();
    }
    private void inicializarObjetos() {
        btnLigacao = (Button) findViewById(R.id.btnLigacao);
        btnContatos = (Button) findViewById(R.id.btnContatos);
        btnCamera = (Button) findViewById(R.id.btnCamera);

        btnLigacao.setOnClickListener(this);
        btnContatos.setOnClickListener(this);
        btnCamera.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == btnLigacao) {
            Uri uri = Uri.parse("tel:99999999");
            Intent telaFone = new Intent(Intent.ACTION_CALL, uri);
            startActivity(telaFone);
        } else if (v == btnContatos) {
            Uri uri = Uri.parse("content://com.android.contacts/contacts/");
            Intent telaContatos = new Intent(Intent.ACTION_PICK, uri);
            startActivity(telaContatos);
        } else if (v == btnCamera) {
            Intent telaCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(telaCamera);
        }
}}
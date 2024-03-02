package com.fiap.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtNome;
    TextView txtResultado;
    Button btnNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = findViewById(R.id.edtNome);
        txtResultado = findViewById(R.id.txtResultado);
        btnNome = findViewById(R.id.btnNome);
        btnNome.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        txtResultado.setText(edtNome.getText());

    }
}

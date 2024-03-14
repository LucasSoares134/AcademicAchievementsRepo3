package com.example.atividade07abrindotelasnoturno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTotal, btnParcial, btnTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTotal = findViewById(R.id.btnTotal);
        btnTotal.setOnClickListener(this);
        btnParcial = findViewById(R.id.btnParcial);
        btnParcial.setOnClickListener(this);
        btnTeste = findViewById(R.id.btnTeste);
        btnTeste.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnTotal) {
            Intent itTotal = new Intent(this, AtvTotal.class);
            startActivity(itTotal);
        }
        else if (v == btnParcial) {
            Intent itParcial = new Intent(this, AtvParcial.class);
            startActivity(itParcial);
        }
        else if (v == btnTeste) {
            Intent itTeste = new Intent(this, AtvTeste.class);
            startActivity(itTeste);
        }
    }
}
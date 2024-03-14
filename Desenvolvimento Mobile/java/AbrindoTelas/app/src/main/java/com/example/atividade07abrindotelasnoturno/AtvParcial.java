package com.example.atividade07abrindotelasnoturno;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AtvParcial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txtInfo = new TextView(this);
        txtInfo.setText("Tela Parcial");
        setContentView(txtInfo);
    }
}

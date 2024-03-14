package com.example.atividade07abrindotelasnoturno;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AtvTeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView img = new ImageView(this);
        img.setImageResource(R.drawable.download);
        setContentView(img);
    }
}

package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtMens;
    Button btnMensCurta, btnMensLonga, btnMensPers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMens = findViewById(R.id.edtMens);
        btnMensCurta = findViewById(R.id.btnMensCurta);
        btnMensLonga = findViewById(R.id.btnMensLonga);
        btnMensPers = findViewById(R.id.btnMensPers);

        btnMensCurta.setOnClickListener(this);
        btnMensLonga.setOnClickListener(this);
        btnMensPers.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if (v == btnMensCurta){
            Toast t = Toast.makeText(this, edtMens.getText(), Toast.LENGTH_SHORT);
                    t.show();
        }
        else if (v == btnMensLonga){
            Toast t = Toast.makeText(this, edtMens.getText(), Toast.LENGTH_LONG);
            t.show();
        }
        else {
            ImageView img = new ImageView(this);
            img.setImageResource(android.R.drawable.sym_def_app_icon);
            Toast t = new Toast(this);
            t.setView(img);
            t.setDuration(Toast.LENGTH_LONG);
            t.show();
        }


    }


}
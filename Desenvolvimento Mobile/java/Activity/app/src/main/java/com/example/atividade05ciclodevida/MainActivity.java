package com.example.atividade05ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Mensagem", "Executando OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Mensagem", "Executando OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Mensagem", "Executando OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Mensagem", "Executando OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Mensagem", "Executando OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Mensagem", "Executando OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Mensagem", "Executando OnRestart");
    }
}
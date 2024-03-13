package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final String TAG = "MENSAGEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, getClassName() + " onStart() executado.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, getClassName() + " onStart() executado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, getClassName() + " onRestart() executado.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, getClassName() + " onStop() executado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, getClassName() + " onDestroy() executado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, getClassName() + " onPause() executado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, getClassName() + " onResume() executado.");
    }

    private String getClassName() {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf(".") + 1);
    }
}

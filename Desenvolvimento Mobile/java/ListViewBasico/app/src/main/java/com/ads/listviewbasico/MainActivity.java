package com.ads.listviewbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listProdutos = findViewById(R.id.listProdutos);

        String[] produtos = new String[] {
                "Arroz", "Feijao", "Batata", "Macarrao", "Oleo",
                "Carne", "Alface", "Tomate", "Beterraba", "Pera", "Uva"};

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, produtos);
        listProdutos.setAdapter(listAdapter);

        listProdutos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String prod = (String) parent.getAdapter().getItem(position);
                Toast.makeText(MainActivity.this, "Produto: " + prod, Toast.LENGTH_LONG).show();
            }
        });
    }
}

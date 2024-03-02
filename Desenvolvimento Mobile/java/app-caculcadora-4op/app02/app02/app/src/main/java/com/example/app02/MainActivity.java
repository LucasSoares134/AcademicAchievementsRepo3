package com.example.app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtNum1, edtNum2;
    TextView txtResultado;
    Button btnCalcular;
    Spinner spnOp;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);
        spnOp = findViewById(R.id.spnOp);

        String opSel = (String) spnOp.getSelectedItem();
    }

    @Override
    public void onClick(View v) {
        float n1, n2, res;
            n1 = Float.parseFloat(edtNum1.getText().toString());
            n2 = Float.parseFloat(edtNum2.getText().toString());
            String opSel = (String) spnOp.getSelectedItem();

            if (opSel.equals("+")){
                res = n1 + n2;
            }
            else if (opSel.equals("-")){
            res = n1 - n2;
        }
             else if (opSel.equals("/")){
            res = n1 / n2;
        }
            else {
            res = n1 * n2;
        }



            txtResultado.setText(String.valueOf(res));

    }
}
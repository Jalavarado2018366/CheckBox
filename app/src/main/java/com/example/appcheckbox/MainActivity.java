package com.example.appcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private CheckBox check1,check2,check3,check4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
        check1 = (CheckBox) findViewById(R.id.checkBox1);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        check4 = (CheckBox) findViewById(R.id.checkBox4);
    }
    // Metodo calcular
    public void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if (check1.isChecked() == true){
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if(check2.isChecked()== true){
            int resta= valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if(check3.isChecked()== true){
            int multiplicar= valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicar);
            tv1.setText(resultado);
        }else if(check4.isChecked()== true){
            int dividir= valor1_int / valor2_int;
            String resultado = String.valueOf(dividir);
            tv1.setText(resultado);
        }
    }
}
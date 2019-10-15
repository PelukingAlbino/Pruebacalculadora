package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4
    TextView msj1,msj2;
    EditText num1, num2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      btn1 = (Button) findViewById(R.id.Suma);
      btn2 = (Button) findViewById(R.id.Resta);
      btn3 = (Button) findViewById(R.id.Dividir);
      btn4 = (Button) findViewById(R.id.Multiplicar);

      msj1 = (TextView) findViewById(R.id.msg1);
      msj2 = (TextView) findViewById(R.id.msg2);

      num1 = (TextView) findViewById(R.id.n1);
      num2 = (TextView) findViewById(R.id.n2);

      btn1.setOnClickListener(this);
      btn2.setOnClickListener(this);
      btn3.setOnClickListener(this);
      btn4.setOnClickListener(this);


    }
}

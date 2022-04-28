package com.isga.tp1miag2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nombre1, nombre2;
    Button btnEgale;
    TextView textRes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre1= findViewById(R.id.op1);
        nombre2= findViewById(R.id.op2);
        btnEgale= findViewById(R.id.btn1);
        textRes= findViewById(R.id.textR);

//        btnEgale.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s1= nombre1.getText().toString();
//                String S2= nombre2.getText().toString();
//                int n1= Integer.parseInt(s1);
//                int n2= Integer.parseInt(S2);
//
//                textRes.setText(String.valueOf(n1*n2));
//
//                nombre1.setText("");
//                nombre2.setText("");
//            }
//        });
    }

    public void Multiplication(View v){
        String s1= nombre1.getText().toString();
                String S2= nombre2.getText().toString();
                int n1= Integer.parseInt(s1);
                int n2= Integer.parseInt(S2);

                textRes.setText(String.valueOf(n1*n2));

                nombre1.setText("");
                nombre2.setText("");
    }
}
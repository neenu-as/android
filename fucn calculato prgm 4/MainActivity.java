
package com.example.fucnctioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fucnctioncalculator.R;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2,txtresult;
    Button btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        txtresult = findViewById(R.id.txtresult);

        btn1 = findViewById(R.id.btn1);

    }

    public void sum(View view) {
        float n1=Float.parseFloat(txtnum1.getText().toString());
        float n2=Float.parseFloat(txtnum2.getText().toString());
        float s=n1+n2;
        txtresult.setText(Float.toString(s));


    }

    public void substraction(View view) {
        float n1=Float.parseFloat(txtnum1.getText().toString());
        float n2=Float.parseFloat(txtnum2.getText().toString());
        float s = n1 - n2;
        txtresult.setText(Float.toString(s));

    }

    public void division(View view) {
        float n1=Float.parseFloat(txtnum1.getText().toString());
        float n2=Float.parseFloat(txtnum2.getText().toString());
        float s=n1/n2;
        txtresult.setText(Float.toString(s));


    }


    public void multiplication(View view) {
        float n1=Float.parseFloat(txtnum1.getText().toString());
        float n2=Float.parseFloat(txtnum2.getText().toString());
        float s=n1*n2;
        txtresult.setText(Float.toString(s));


    }



}

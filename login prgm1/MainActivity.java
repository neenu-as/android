package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText User=findViewById(R.id.username);
        EditText pwd = findViewById(R.id.password);
        Button btn= findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
             if (User.getText().toString().equals("neenu") && pwd.getText().toString().equals("neenu"))
             {
                 Toast.makeText(MainActivity.this, "Login success.", Toast.LENGTH_SHORT).show();
             }
             else {
                 Toast.makeText(MainActivity.this, "Login failed try again", Toast.LENGTH_SHORT).show();
             }
             }

            });



    }
}
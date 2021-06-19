package com.example.chocofeliz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContatoProg = (Button) findViewById(R.id.btnContato);
        btnContatoProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Contato.class);
                startActivity(it);
            }
        });

        Button btnSobreProg = (Button) findViewById(R.id.btnSobre);
        btnSobreProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Sobre.class);
                startActivity(it);
            }
        });
    }
}
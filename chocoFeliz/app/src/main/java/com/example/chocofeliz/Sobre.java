package com.example.chocofeliz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        Button btnVMenuProg = (Button) findViewById(R.id.btnVMenu);
        btnVMenuProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Sobre.this,MainActivity.class);
                startActivity(it);
            }
        });
    }
}
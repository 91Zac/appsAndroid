package com.example.conversormedidas;
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
        Button btnKmM_Prog = (Button) findViewById(R.id.btnKmM);
        btnKmM_Prog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Kmm.class);
                startActivity(intent);
            }
        });
        Button btnmKm_Prog = (Button) findViewById(R.id.btnmKm);
        btnmKm_Prog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mKm.class);
                startActivity(intent);
            }
        });
        Button btncmm_Prog = (Button) findViewById(R.id.btncmm);
        btncmm_Prog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cmM.class);
                startActivity(intent);
            }
        });
        Button btnmcm_Prog = (Button) findViewById(R.id.btnmcm);
        btnmcm_Prog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mcm.class);
                startActivity(intent);
            }
        });
    }
}



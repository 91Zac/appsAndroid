package com.example.conversormedidas;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mKm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);
        final EditText edtMt_Prog = (EditText) findViewById(R.id.edtMt);
        final EditText edtKM_Prog = (EditText) findViewById(R.id.edtKM);
        Button btnConvert_Prog = (Button) findViewById(R.id.btnConvert);
        Button btnClear_Prog = (Button) findViewById(R.id.btnClear);
        btnConvert_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Mt = Double.parseDouble(edtMt_Prog.getText().toString());
                double KM = Mt / 1000;
                edtKM_Prog.setText(String.valueOf(KM));
            }
        });
        btnClear_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtMt_Prog.setText("");
                edtKM_Prog.setText("");
                edtMt_Prog.requestFocus();
            }
        });
        Button btnVoltProg = (Button) findViewById(R.id.btnVolt);
        btnVoltProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(mKm.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}
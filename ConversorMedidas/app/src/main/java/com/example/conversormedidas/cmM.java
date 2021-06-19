package com.example.conversormedidas;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cmM extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_m);
        final EditText edtCm_Prog = (EditText)findViewById(R.id.edtCm);
        final EditText edtMtr_Prog = (EditText)findViewById(R.id.edtMtr);
        Button btnConv_Prog = (Button)findViewById(R.id.btnConv);
        Button btnNV_Prog = (Button)findViewById(R.id.btnNV);
        btnConv_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Cm = Double.parseDouble(edtCm_Prog.getText().toString());
                double m = Cm/100;
                edtMtr_Prog.setText(String.valueOf(m));
            }
        });
        btnNV_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCm_Prog.setText("");
                edtMtr_Prog.setText("");
                edtCm_Prog.requestFocus();
            }
        });
        Button btnVProg = (Button) findViewById(R.id.btnV);
        btnVProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(cmM.this,MainActivity.class);
                startActivity(it);
            }
        });
    }
}
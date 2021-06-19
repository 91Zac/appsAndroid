package com.example.conversormedidas;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mcm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);
        final EditText edtMts_Prog = (EditText) findViewById(R.id.edtMts);
        final EditText edtcm_Prog = (EditText) findViewById(R.id.edtcm);
        Button btnCnvt_Prog = (Button) findViewById(R.id.btnCnvt);
        Button btnNv_Prog = (Button) findViewById(R.id.btnNv);
        btnCnvt_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Mts = Double.parseDouble(edtMts_Prog.getText().toString());
                double cm = Mts * 100;
                edtcm_Prog.setText(String.valueOf(cm));
            }
        });
        btnNv_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtcm_Prog.setText("");
                edtMts_Prog.setText("");
                edtMts_Prog.requestFocus();
            }
        });
        Button btnVoltarProg = (Button) findViewById(R.id.btnVoltar);
        btnVoltarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Mcm.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}
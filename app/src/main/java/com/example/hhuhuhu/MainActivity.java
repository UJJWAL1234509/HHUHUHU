package com.example.hhuhuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText eee;
Button bbb;
TextView rrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbb=findViewById(R.id.bbb);
        eee=findViewById(R.id.ee);
        rrr=findViewById(R.id.ttt);
        bbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rrr.setText(eee.getText());
            }
        });
    }
}

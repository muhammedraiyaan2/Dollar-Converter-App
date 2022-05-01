package com.example.dollarconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
Button btn;
EditText inr;
TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=findViewById(R.id.btn);
        inr=findViewById(R.id.inr);
        output=findViewById(R.id.output);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double inrText=Integer.parseInt(inr.getText().toString());
                output.setText("The dollar value is "+inrText/75.31);
            }
        });
    }
}
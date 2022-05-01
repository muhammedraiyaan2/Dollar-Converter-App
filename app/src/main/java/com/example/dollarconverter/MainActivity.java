package com.example.dollarconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText dollar;
Button btn,Go;
TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dollar=findViewById(R.id.dollar);
        btn=findViewById(R.id.btn);
        output=findViewById(R.id.output);
        Go=findViewById(R.id.Go);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double dollarText=Integer.parseInt(dollar.getText().toString());
                output.setText("The Inr value is "+dollarText*75.31);
            }
        });
        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
startActivity(intent);
            }
        });
    }
}
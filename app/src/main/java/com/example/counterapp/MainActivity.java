package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCounter;
    Button increment,decrement;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       increment=findViewById(R.id.increment);
       tvCounter=findViewById(R.id.tvCounter);
       decrement=findViewById(R.id.decrement);
       increment.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               tvCounter.setText(String.valueOf(++count));
           }
       });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCounter.setText(String.valueOf(--count));
            }
        });
    }
}
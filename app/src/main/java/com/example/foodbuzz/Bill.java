package com.example.foodbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Bill extends AppCompatActivity {
    TextView t,t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        t=findViewById(R.id.textView);
        t1=findViewById(R.id.textView3);

        Intent obj1=getIntent();
        t.setText(obj1.getStringExtra("key"));
        t1.setText(obj1.getStringExtra("key1"));
    }
}

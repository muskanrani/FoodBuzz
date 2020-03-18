package com.example.foodbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class register extends AppCompatActivity {
    TextView t4,t5,t6;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        t4=findViewById(R.id.t1);
        t5=findViewById(R.id.t2);
        t6=findViewById(R.id.t3);
        b1=findViewById(R.id.re);

    }
    public void regis(View j)
    {
        Intent obj2=new Intent(register.this,MainActivity.class);
        startActivity(obj2);
    }
}

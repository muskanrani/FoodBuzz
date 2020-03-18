package com.example.foodbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.editText);
        t2=findViewById(R.id.editText2);
        b1=findViewById(R.id.log);
        b2=findViewById(R.id.regi);

    }
    public void login(View j)
    {
        String str=t1.getText().toString();
        Intent obj=new Intent(MainActivity.this,page.class);
        obj.putExtra("name",str);
        startActivity(obj);
    }
    public void reg(View j)
    {
        Intent obj1=new Intent(MainActivity.this,register.class);
        startActivity(obj1);
    }
}

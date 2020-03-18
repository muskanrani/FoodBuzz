package com.example.foodbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class page extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    TextView t1,t2,t3,t4;
    CheckBox c1,c2,c3,c4;
    EditText e1,e2,e3,e4;
    int total=0,t=0,tt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        b1=findViewById(R.id.button3);
        b2=findViewById(R.id.button4);

        c1=findViewById(R.id.ch1);
        c2=findViewById(R.id.ch2);
        c3=findViewById(R.id.ch3);
        c4=findViewById(R.id.ch4);

        t1=findViewById(R.id.te4);
        t2=findViewById(R.id.te5);
        t3=findViewById(R.id.te6);
        t4=findViewById(R.id.te7);

        b3=findViewById(R.id.but1);
        b4=findViewById(R.id.bu1);
        b5=findViewById(R.id.but2);
        b6=findViewById(R.id.bu2);
        b7=findViewById(R.id.but3);
        b8=findViewById(R.id.bu3);
        b9=findViewById(R.id.but4);
        b10=findViewById(R.id.bu4);

        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        e3=findViewById(R.id.ed3);
        e4=findViewById(R.id.ed4);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t=0;
                t=Integer.parseInt(e1.getText().toString());
               if(t>0) {
                   t = t - 1;
                   e1.setText(Integer.toString(t));
                   t=0;
               }
               else
                   e1.setText("0");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt=0;
                tt=Integer.parseInt(e1.getText().toString());
                if(tt>=0) {
                    tt = tt + 1;
                    e1.setText(Integer.toString(tt));
                    tt=0;
                }
                else
                    e1.setText("0");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t=0;
                t=Integer.parseInt(e2.getText().toString());
                if(t>0) {
                    t = t - 1;
                    e2.setText(Integer.toString(t));
                    t=0;
                }
                else
                    e2.setText("0");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt=0;
                tt=Integer.parseInt(e2.getText().toString());
                if(tt>=0) {
                    tt = tt + 1;
                    e2.setText(Integer.toString(tt));
                    tt=0;
                }
                else
                    e2.setText("0");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t=0;
                t=Integer.parseInt(e3.getText().toString());
                if(t>0) {
                    t = t - 1;
                    e3.setText(Integer.toString(t));
                    t=0;
                }
                else
                    e3.setText("0");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt=0;
                tt=Integer.parseInt(e3.getText().toString());
                if(tt>=0) {
                    tt = tt + 1;
                    e3.setText(Integer.toString(tt));
                    tt=0;
                }
                else
                    e3.setText("0");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t=0;
                t=Integer.parseInt(e4.getText().toString());
                if(t>0) {
                    t = t - 1;
                    e4.setText(Integer.toString(t));
                    t=0;
                }
                else
                    e4.setText("0");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt=0;
                tt=Integer.parseInt(e4.getText().toString());
                if(tt>=0) {
                    tt = tt + 1;
                    e4.setText(Integer.toString(tt));
                    tt=0;

                }
                else
                    e4.setText("0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=" ";
                Toast.makeText(page.this, "Your order has been placed", Toast.LENGTH_SHORT).show();
                if(c1.isChecked()==true)
                {
                    data=data+ c1.getText().toString()+"\n";
                    total=total+(Integer.parseInt(e1.getText().toString())*Integer.parseInt(t1.getText().toString()));
                    c1.setChecked(false);
                }
                if(c2.isChecked()==true)
                {
                    data=data+ c2.getText().toString()+"\n";
                    total=total+Integer.parseInt(e2.getText().toString())*Integer.parseInt(t2.getText().toString());
                    c2.setChecked(false);
                }
                if(c3.isChecked()==true)
                {
                    data=data+ c3.getText().toString()+"\n";
                    total=total+Integer.parseInt(e3.getText().toString())*Integer.parseInt(t3.getText().toString());
                    c3.setChecked(false);
                }
                if(c4.isChecked()==true)
                {
                    data=data+ c4.getText().toString()+"\n";
                    total=total+Integer.parseInt(e4.getText().toString())*Integer.parseInt(t4.getText().toString());
                    c4.setChecked(false);
                }
                String total1=Integer.toString(total);
                Intent obj=new Intent(page.this,Bill.class);
                        obj.putExtra("key",data);
                        obj.putExtra("key1",total1);
                        total=0;
                startActivity(obj);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("0");
                e2.setText("0");
                e3.setText("0");
                e4.setText("0");
                if(c1.isChecked()==true)
                {
                    c1.setChecked(false);
                }
                if(c2.isChecked()==true)
                {
                    c2.setChecked(false);
                }
                if(c3.isChecked()==true)
                {
                    c3.setChecked(false);
                }
                if(c4.isChecked()==true)
                {
                    c4.setChecked(false);
                }
                total=0;
            }
        });
    }
}

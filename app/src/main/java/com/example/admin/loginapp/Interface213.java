package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interface213 extends AppCompatActivity implements View.OnClickListener{
    Button button1,button2,button3,button4,button5,button6,button7,button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface213);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.button1:
             startActivity(new Intent(Interface213.this,heart_but1.class));
             break;

         case R.id.button2:
             startActivity(new Intent(Interface213.this,heart_but2.class));
             break;

         case R.id.button3:
             startActivity(new Intent(Interface213.this,heart_but3.class));
             break;

         case R.id.button4:
             startActivity(new Intent(Interface213.this,heart_but4.class));
             break;

         case R.id.button5:
             startActivity(new Intent(Interface213.this,heart_but5.class));
             break;
         case R.id.button6:
             startActivity(new Intent(Interface213.this,heart_but6.class));
             break;
         case R.id.button7:
             startActivity(new Intent(Interface213.this,heart_but7.class));
             break;
         case R.id.button8:
             startActivity(new Intent(Interface213.this,heart_but8.class));
             break;
     }
    }
}

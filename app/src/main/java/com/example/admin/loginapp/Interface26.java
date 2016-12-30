package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interface26 extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface26);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.button1:
                startActivity(new Intent(Interface26.this,lung_but1.class));
                break;

            case R.id.button2:
                startActivity(new Intent(Interface26.this,lung_but2.class));
                break;

            case R.id.button3:
                startActivity(new Intent(Interface26.this,lung_but3.class));
                break;

            case R.id.button4:
                startActivity(new Intent(Interface26.this,lung_but4.class));
                break;

            case R.id.button5:
                startActivity(new Intent(Interface26.this,lung_but5.class));
                break;

            case R.id.button6:
                startActivity(new Intent(Interface26.this,lung_but6.class));
                break;
        }

    }
}

package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class interface42 extends AppCompatActivity implements View.OnClickListener {
Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface42);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                startActivity(new Intent(interface42.this, recepies_but1.class));
                break;
            case R.id.button2:
                startActivity(new Intent(interface42.this, recepies_but2.class));
                break;
            case R.id.button3:
                startActivity(new Intent(interface42.this, recepies_but3.class));
                break;
            case R.id.button4:
                startActivity(new Intent(interface42.this, recepies_but4.class));
                break;

        }
    }
}

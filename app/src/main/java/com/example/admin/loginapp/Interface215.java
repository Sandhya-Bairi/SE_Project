package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interface215 extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4, button5, button6, button7, button8,button9,button10,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface215);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(Interface215.this, brain_but1.class));
                break;

            case R.id.button2:
                startActivity(new Intent(Interface215.this, brain_but2.class));
                break;

            case R.id.button3:
                startActivity(new Intent(Interface215.this, brain_but3.class));
                break;

            case R.id.button4:
                startActivity(new Intent(Interface215.this, brain_but4.class));
                break;

            case R.id.button5:
                startActivity(new Intent(Interface215.this, brain_but5.class));
                break;

            case R.id.button6:
                startActivity(new Intent(Interface215.this, brain_but6.class));
                break;

            case R.id.button7:
                startActivity(new Intent(Interface215.this, brain_but7.class));
                break;

            case R.id.button8:
                startActivity(new Intent(Interface215.this, brain_but8.class));
                break;

            case R.id.button9:
                startActivity(new Intent(Interface215.this, brain_but9.class));
                break;

            case R.id.button10:
                startActivity(new Intent(Interface215.this, brain_but10.class));
                break;

            case R.id.button11:
                startActivity(new Intent(Interface215.this, brain_but11.class));
                break;
        }
    }
}
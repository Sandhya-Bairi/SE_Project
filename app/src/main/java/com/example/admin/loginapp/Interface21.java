package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interface21 extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    Button button11, button12, button13, button14, button15, button16, button17, button18, button19, button20;
    Button button21, button22, button23, button24, button25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface21);
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
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);

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
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(Interface21.this, eye_but1.class));
                break;

            case R.id.button2:
                startActivity(new Intent(Interface21.this, eye_but2.class));
                break;

            case R.id.button3:
                startActivity(new Intent(Interface21.this, eye_but3.class));
                break;

            case R.id.button4:
                startActivity(new Intent(Interface21.this, eye_but4.class));
                break;

            case R.id.button5:
                startActivity(new Intent(Interface21.this, eye_but5.class));
                break;

            case R.id.button6:
                startActivity(new Intent(Interface21.this, eye_but6.class));
                break;

            case R.id.button7:
                startActivity(new Intent(Interface21.this, eye_but7.class));
                break;

            case R.id.button8:
                startActivity(new Intent(Interface21.this, eye_but8.class));
                break;

            case R.id.button9:
                startActivity(new Intent(Interface21.this, eye_but9.class));
                break;

            case R.id.button10:
                startActivity(new Intent(Interface21.this, eye_but10.class));
                break;

            case R.id.button11:
                startActivity(new Intent(Interface21.this, eye_but11.class));
                break;

            case R.id.button12:
                startActivity(new Intent(Interface21.this, eye_but12.class));
                break;

            case R.id.button13:
                startActivity(new Intent(Interface21.this, eye_but13.class));
                break;

            case R.id.button14:
                startActivity(new Intent(Interface21.this, eye_but14.class));
                break;

            case R.id.button15:
                startActivity(new Intent(Interface21.this, eye_but15.class));
                break;

            case R.id.button16:
                startActivity(new Intent(Interface21.this, eye_but16.class));
                break;

            case R.id.button17:
                startActivity(new Intent(Interface21.this, eye_but17.class));
                break;

            case R.id.button18:
                startActivity(new Intent(Interface21.this, eye_but18.class));
                break;

            case R.id.button19:
                startActivity(new Intent(Interface21.this, eye_but19.class));
                break;

            case R.id.button20:
                startActivity(new Intent(Interface21.this, eye_but20.class));
                break;

            case R.id.button21:
                startActivity(new Intent(Interface21.this, eye_but21.class));
                break;

            case R.id.button22:
                startActivity(new Intent(Interface21.this, eye_but22.class));
                break;

            case R.id.button23:
                startActivity(new Intent(Interface21.this, eye_but23.class));
                break;

            case R.id.button24:
                startActivity(new Intent(Interface21.this, eye_but24.class));
                break;

            case R.id.button25:
                startActivity(new Intent(Interface21.this, eye_but25.class));
                break;
        }
    }
}

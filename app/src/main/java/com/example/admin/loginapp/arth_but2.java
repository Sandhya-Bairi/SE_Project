package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class arth_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arth_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Drinking 2 table spoons of raw potato juice before meals will help.5-6 walnuts can be eaten daily.Take care to chew the walnuts really well." +
                "\n\n• Celery seeds(Ajwain) to be powdered. Add 1 teaspoon to a cup of hot water and drink before meals.");
    }
}

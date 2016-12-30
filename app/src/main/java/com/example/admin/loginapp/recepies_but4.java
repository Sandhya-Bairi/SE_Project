package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class recepies_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies_but4);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("Use wheat flour for making roti’s. Roti’s can be made of different varieties. Add a cup of methi (fenugreek) or palak leaves into a hot pan with a table spoon of oil, add some salt to taste, pepper and fry for a minute and add it to wheat flour and make a nice dough. Rest it for 10 minutes and prepare roti’s and fry them without oil and have it with curd.\n" +
                "You can also use other millet flour for making roti’s separately or you can add equal quantity of all millet flour for making roti’s.\n");

    }
}

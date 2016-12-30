package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but20);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• brushing too vigorously\n" +
                "• gum diseases\n" +
                "• grinding teeth while sleeping");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Dull ache and pressure in upper teeth and jaw\n•" +
                " feeling hot, hurting while drinking hot liquids or while eating a candy");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Use a tooth brush with soft bristles\n" +
                "• After brushing your teeth, rinse your mouth with a fluoride rinse\n" +
                "• Try to use a toothpaste made for sensitivity.\n" +
                "• Take a quarter glass of water and add a quarter teaspoon of baking soda to this. Rinse your mouth or brush with this water\n" +
                "• Chew a sugarless variety of chewing gum \n");

    }
}

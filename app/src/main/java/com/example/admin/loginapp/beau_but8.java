package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tDilute the essential oils like lavender oil, rose oil, germanium oil, with a carrier oil such as coconut oil or almond oil and massage over the affected area.\n" +
                "\n•\tRub castor oil over the affected areas. Then wrap it with a plastic sheet and place a hot water bottle over it. The heat form the bottle allows the pores to open up and absorption of the oil takes place easily.\n" +
                "\n•\tSqueeze out fresh aloevera gel from the plant and apply it over the affected areas daily\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tApply Shea butter directly on the stretch marks regularly to reduce their appearance." +
                "\n You can also prepare a mixture of Shea butter and lemon juice by mixing 4 teaspoons of Shea butter and 1" +
                " teaspoon of lemon juice. Apply over the affected areas and keep till it dries. Wash off with cool water and" +
                " repeat the procedure regularly.\n" +
                "\n•\tAdequate amount of water should be consumed which helps to increase the elasticity of the skin. " +
                "Drink at least 10-12 glasses of water daily to keep your skin and body hydrated.\n" +
                "\n•\tIndulge in daily exercises like walking, jogging, swimming and aerobics. Exercises improve blood" +
                " flow which reduces the stretch marks\n");

    }
}

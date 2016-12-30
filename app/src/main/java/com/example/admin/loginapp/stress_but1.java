package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stress_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_but1);

        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\uF0A7\tDiets like high fat, processed foods, margarine and starchy vegetables\n" +
                "\uF0A7\tLower intake of fresh fruits and vegetables increases free radicals.\n" +
                "\uF0A7\tAlcohol and fried foods\n" +
                "\uF0A7\tPackaged, processed and irradiated create more free radicals show skin age symptoms.\n" +
                "\uF0A7\tPolluted air, especially in the big cities and towns, helps to create more free radicals.\n");

        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tYoga and Mediation are the excellent form of practices for body, mind and soul.\n" +
                "•\tNatural Skin care keep our skin free from dirt, dead cells, pollution and ultra violate rays.\n" +
                "•\tOvereating or over fasting should be avoided..\n" +
                "•\tOral supplement in the form of multi vitamins and multi minerals are necessary \n" +
                "•\tAntioxidants -found in vitamin E, C and A.\n" +
                "•\tDrink plenty of water .\n" +
                "•\tEat fresh fruits, vegetables, and fish as all these make you energetic.\n");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class diabetes_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_but1);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
       txtDetails1.setText("•\tYour genes play a role.\n" +
               "•\tType 1 diabetes can result when something in the environment, like a virus, tells your immune system to go after your pancreas.\n" +
               "•\tType 1 diabetes can happen along with other autoimmune diseases.\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tGoldenseal is an herb that contains berberine, which stimulate the production of the pancreatic beta cells which the body needs to make insulin.\n" +
                "•\tStevia is naturally sweet plant is a good choice for diabetics \n" +
                "•\tRed clover is great for type 1 diabetics \n" +
                "•\tDiabetics who take supplements made from fig leaves do not need as much insulin as those who don't.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tApples, pears, apricots, blueberries, kiwifruit, pomegranates, and avocados are very good but you have to eat it moderately.\n" +
                "•\tBananas, dates, grapes, watermelon, and oranges dried fruits, have a lot of Sugar. \n" +
                "•\tDiabetic people can eat fiber-rich fruits like watermelon, strawberries, papaya, plums, muskmelon, etc. These fruits help to control blood sugar, levels. \n");
    }
}

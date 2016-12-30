package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but10);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tTry a delicious ginger drink by boiling half of a thumb-sized root in 2 cups of water. Add a tablespoon (or two) of coconut milk and honey to loosen phlegm and help the immune system.");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tOne way to consume apple cider vinegar is to dilute 1-3 tablespoons in water and consume the drink throughout the day or over the course of a few hours. Allergies could easily vanish within a couple hours of taking the magical liquid, although it could take a little longer if you’ve been experiencing the allergies for a day or more.");

    }
}

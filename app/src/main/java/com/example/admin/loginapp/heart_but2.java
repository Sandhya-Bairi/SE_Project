package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class heart_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_but2);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tIt is thought to begin with damage or injury to the inner layer of a coronary artery, sometimes as early as childhood caused by various factors, including Smoking, High blood pressure, High cholesterol, Diabetes or insulin resistance.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tChest pain (angina)-You may feel pressure or tightness in your chest, as if someone were standing on your chest. This pain, referred to as angina, usually occurs on the middle or left side of the chest. \n" +
                "•\tShortness of breath\n" +
                "•\tHeart attack.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tAdd 1 teaspoon of turmeric powder to a glass of warm milk.\n" +
                "Add 1 tablespoon of honey to the milk. Drink the turmeric milk twice per day. \n" +
                "\n•\tAdd 1 teaspoon of cayenne pepper to a cup of hot water. You can also mix a spoonful of the pepper into a cup of green tea, along with a bit of lemon juice and a squirt of honey.  Drink the concoction twice daily for a few weeks.\n" +
                "\nTake fish");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tEating a healthy, balanced diet\n" +
                "•\tLimiting alcohol\n" +
                "•\tNo smoking\n" +
                "•\tUndertaking regular physical exercise – 30 minutes most days of the week\n" +
                "•\tMaintaining a healthy body weight\n" +
                "•\tMaintaining healthy blood cholesterol levels\n" +
                "•\tEffectively treating medical conditions such as diabetes and high blood pressure\n" +
                "•\tBeing aware of risk factors.\n");
    }
}

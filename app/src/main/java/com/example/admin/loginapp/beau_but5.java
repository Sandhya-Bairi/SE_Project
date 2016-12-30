package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tBefore going to bed, mix some liquid soap in a foot tub filled with warm water. Soak your feet in this warm soapy water for about 20 minutes. Use a pumice stone to gently scrub off the loosened dead skin cells. Rinse off your feet with clean water and pat dry with a soft towel. Apply some foot cream or moisturizer and wear a pair of clean cotton socks overnight. Follow this remedy daily until your cracked feet are healed completely.\n" +
                "\n•\tDry your feet thoroughly and then apply coconut oil generously on your feet. Put on a pair of clean, cotton socks for the night. The next morning, remove the socks and wash your feet. Do this daily for several days until you are satisfied with the results.\n" +
                "\n•\tAdd one-half cup of Epsom salt in a foot tub filled with warm water. Soak your feet in it for 10 minutes. Gently rub your feet with a pumice stone for a few minutes. Put your feet back in the Epsom salt soak for another 10 minutes. Finally, dry your feet thoroughly and apply a moisturizer or petroleum jelly. Repeat daily for two or three days.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tAdd some lemon juice to warm water. Soak your feet in this solution for about 10 minutes. Gently scrub your feet with a soft foot brush. Wash and dry your feet completely and then apply some moisturizer.\n" +
                "Repeat a few times a week.\n" +
                "\n•\tYou can also create a foot scrub by mixing together five tablespoons of sea salt, one tablespoon of olive oil and juice from one lemon. Apply it on your cracked feet. Leave it on for 15 minutes and then rinse it off with lukewarm water. Follow this remedy once or twice a week to get positive results\n" +
                "\n•\tAnother option is to make a natural foot scrub. Mix a handful of coarse rice flour, a few tablespoons of raw honey and apple cider vinegar to make a thick paste. You can also add one tablespoon of olive oil to it. Wash your feet well and then gently massage your feet with this paste for a few minutes. Wash it off with lukewarm water. Repeat once or twice a week.\n");


    }
}

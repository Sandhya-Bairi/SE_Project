package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but10);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tWhisk an egg yolk and mix in two or three tablespoons of olive oil and one tablespoon of honey. Work it into damp hair, leave it on for 30 minutes and then rinse it off. Finally, shampoo your hair.\n" +
                "\n" +
                "•\tAlternatively, whisk an egg with one teaspoon of almond oil. Apply on damp hair. Leave it on for 20 to 30 minutes before rinsing it out and then shampoo your hair.\n" +
                "\n•\tSlightly heat some olive oil, coconut oil, almond oil, or castor oil in a microwave for about 20 seconds. Massage it into your hair and scalp. Leave it on for at least 45 minutes and then shampoo your hair.\n" +
                "\n•\tWet and towel dry your hair. Work one-half cup of mayonnaise into your hair. Leave it on for at least 15 to 20 minutes. Rinse it out and shampoo your hair\n" +
                "\n•\tShampoo your hair. Pour some flat beer in a small spray bottle. Spray it over the mid- and end-sections of your damp hair. Let it sit for two to three minutes. You need not rinse it out. Do this once a week.\n" +
                "\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• avoid too much brushing, coloring of the hair, heated applications, rubbing with a towel, uncovered rubber bands");


    }
}

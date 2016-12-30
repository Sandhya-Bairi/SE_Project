package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tMix two teaspoons of baking soda with mineral water to make a paste. Apply the paste generously on the affected skin area and massage gently. Allow it to dry for a few minutes before rinsing it off with warm water. Repeat this remedy once or twice a week.\n" +
                "\n•\tMix one teaspoon each of cinnamon powder and lemon juice with a pinch of turmeric powder (optional). Spread it on your face, leave it on for 10 to 15 minutes and then rinse it off.\n" +
                "\n•\tMix one teaspoon honey and the juice of four tomatoes in sufficient oatmeal to make a paste. Scrub it on your skin. Wash it off after 10 minutes\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tApply some pure honey on your face. Leave it on for about 10  minutes. Rinse your face with lukewarm water.\n" +
                "\n•\tMix one teaspoon of dry green tea leaves with a little water to make a paste. Gently scrub the paste over the affected area for two to three minutes. This scrub deep cleans oily skin and helps unclog pores. Rinse it off with lukewarm water.\n" +
                "\n•\tMake a thick paste by mixing red sandalwood, turmeric powder and milk together. Apply it on the affected area and after 10 minutes wash the skin with water.\n" +
                "\n•\tBefore using TURMERIC perform patch test to check whether it suits your skin. If it gives allergy then don’t use turmeric.\n");


    }
}

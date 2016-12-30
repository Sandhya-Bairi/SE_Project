package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but7);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tMix the tomato juice with lemon juice and apply this mixture on the affected area.\n" +
                "Let it stay for 10 minutes, and wash off with cold water.\n" +
                "\n•\tApply a little amount of almond oil on your dark circles and gently massage it into the skin. Leave it on overnight and wash it off the next morning\n" +
                "\n•\tMix the orange juice and glycerin, and apply this mixture on the dark circles. Let the mixture stay on for 10 minutes, after which you can wash it off with cold water\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tGrate the raw potato and extract the juice from it. Soak two cotton balls in the juice. Place the cotton balls on the dark circles, ensuring that they cover the affected area entirely. Leave the cotton balls undisturbed for 10 minutes, and then remove and wash your eyes with cold water.\n" +
                "\n•\tDip the tea bags in water and place them in the refrigerator for a while. Remove the tea bags from the fridge and place them over your eyes for about 15 minutes, after which you can wash your face.\n" +
                "\n•\tCut the cucumber into thick slices and place them in the refrigerator for about 30 minutes. Take two slices out of the fridge and place each of them on the eyes, ensuring they completely cover the affected area. Leave them undisturbed for 10 minutes, and then wash your eyes with cold water.\n");
    }
}

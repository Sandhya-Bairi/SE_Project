package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• dry skin\n" +
                "• irritated, oily skin\n" +
                "• not shampooing often enough\n" +
                "• a yeast like fungus, sensitivity to hair care products");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• white flakes of dead skin in the hair and on the shoulders, as well as an itchy, red, or scaly scalp");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tBoil a handful of neem leaves in four cups of water. Cool and strain the solution. Use this decoction as a hair rinse two or three times a week.\n" +
                "\n" +
                "•\tTake some coconut oil and mix half the amount of lemon juice in it. Rub it on your scalp and massage for a few minutes. Wash your hair after at least 20 minutes. Follow this remedy two to three times a week.\n" +
                "\n" +
                "•\tTake two tablespoons of apple cider vinegar. Mix an equal amount of water and 15-20 drops of tea tree oil in it. Apply it onto your scalp and massage. Rinse your hair after a few minutes. Follow this natural treatment two or three times a week.\n" +
                "\n" +
                "•\tWet your hair and rub a handful of baking soda onto your scalp. After a couple of minutes, rinse your hair well with warm water. Repeat once or twice a week for a few weeks. \n");
    }
}

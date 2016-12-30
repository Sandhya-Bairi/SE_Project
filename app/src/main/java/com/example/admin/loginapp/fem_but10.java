package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but10);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• having sex without a condom\n• using an intrauterine device (IUD) to prevent a pregnancy\n• douching");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tfever,\n" +
                "•\tabdominal or pelvic pain,\n" +
                "•\tvaginal discharge,\n" +
                "•\tIrregular bleeding\n" +
                "•\ttiredness\n" +
                "•\tPainful urination, or\n" +
                "•\tPainful sexual intercourse\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tBaking soda to be dissolved in water and taken every day.\n" +
                "\n" +
                "•\tBoil 1 teaspoon of turmeric powder in a glass of milk. Drink it once daily until the symptoms subside.\n" +
                "\n•\tAdd ½ teaspoon of baking soda to a glass of water. Stir in 1 teaspoon of psyllium fiber. Drink it on an empty stomach once daily for a few weeks.\n" +
                "\n•\tMix a few drops of lavender essential oil in a carrier oil like olive oil. Lie on the bed and stretch out your body. Apply this oil on your lower abdomen. Gently massage the pelvic area and lower abdomen in circular motions for 5 to 10 minutes. Massage 1 or 2 times daily until the symptoms subside.\n");
    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• due to food trapped in space, improper oral hygiene");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• gums are red, tender or swollen, bleed when you brush of floss your teeth\n" +
                "• loose teeth, pain when chewing\n" +
                "• sensitive teeth, foul-smelling breath\n" +
                "• pus between teeth and gums.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Mix equal parts of hydrogen peroxide and water. Rinse your mouth with the solution for a few seconds, and then spit it out. Do it once in a day.\n" +
                "➣ Massage your gums with fresh aloe-vera gel, leave it on for at least half an hour and then rinse it off. \n" +
                "➣ Swish one tablespoon of sesame oil around in your mouth and through your teeth. Do this for about 15 minutes or until it becomes thinner and turns milky. Spit it out and rinse your mouth with water.\n" +
                "➣ Use garlic cloves on irritated gums, or simply make a garlic & turmeric paste to use like toothpaste, then rinse after it has been in your mouth for several minutes\n" +
                "➣ Use neem in a mouthwash.\n");

    }
}

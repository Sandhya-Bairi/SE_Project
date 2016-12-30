package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class heart_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_but4);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tA tear in the plaque triggers blood platelets and other substances to form a blood a clot at the site thereby blocking blood from flowing to the heart. This is the most common cause of heart attack.\n" +
                "•\tA slow buildup of plaque may narrow one of the coronary arteries so that it is almost blocked.\n" +"•\tAfter a sudden increase in physical activity\n" +
                "•\tWhen you are active outside in cold weather\n" +
                "•\tAfter sudden, severe emotional or physical stress, including an illness\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tShortness of breath \n" +"•\tAnxiety \n" +"•\tSweating \n" +"•\tConfusion\n" +
                "•\tNausea and vomiting\n•\tTemporary changes in vision");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("\uF0A7\tBoil two petals of a hibiscus flower in one cup of water. Strain and add one teaspoon of raw honey. Drink this once daily for a few weeks.\n\uF0A7\tEat one or two freshly crushed garlic cloves daily. If you find the taste too strong, drink a glass of milk after eating the garlic.\n" +
                "\n" + "\uF0A7\tAdd one-half teaspoon of Arjuna tree bark powder and a little honey to a glass of warm water. Drink this three times daily for a few months.\n" + "\n\uF0A7\tUse turmeric regularly in your cooking. You can also boil one teaspoon of turmeric powder in one cup of water or milk. Drink it once or twice daily for several weeks to a few months.\n" + "\uF0A7\tAdd one-half to one teaspoon of cayenne pepper to a cup of hot water. Stir well and drink it. Repeat two or three times daily for a few weeks. You can follow up with a cup of hibiscus tea to heal the burning sensation and promote heart health.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tQuit smoking\n" +"•\tStay physically active and incorporate regular exercise into a daily routine\n" +"•\tWatching your diet - you may need to consult a nutritionist for advice about healthy foods that can help to lower cholesterol\n");

    }
}

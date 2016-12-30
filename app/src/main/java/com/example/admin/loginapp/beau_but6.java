package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tRub fresh lemon juice over the darkened skin and leave it for 10 minutes. Wash off with cool water. Remember not to expose yourself to the sun, while doing this treatment. There is no way that you look for skin lightening tips and not find lemon on the list. You should be careful as lemon can cause irritation on the wounds and cuts.\n" +
                "\n•\tPrepare a face pack by mixing 1 teaspoon of milk and 1 teaspoon of honey. Make a smooth paste and apply all over your face. Rub gently in circular motions and keep for 15 minutes. Use low fat milk if you have oily skin and full cream milk if you have dry skin.\n" +
                "\n•\tPrepare the mask by combining 1 teaspoon of turmeric powder and 3 teaspoons of fresh lime juice. Apply over the exposed skin and keep for 15 minutes. You should be careful while using this pack, as turmeric can stain your clothes. People with sensitive skin can dilute it with water.\n" +
                "\n•\tBeat an egg till it’s fluffy and frothy. Apply on the face and keep it on till it dries off completely. Wash off with cool water. You can also add lemon juice or 2 drops of lavender oil or tea tree oil, to reduce the smell of the egg.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tAdd 1-2 tomatoes and 2 teaspoons of lemon juice. You can also add gram flour (besan) into it. Blend well to make a smooth paste. Apply this all over the face and keep for 20 minutes. Wash off with cool water and repeat this procedure daily before bath\n" +
                "\n•\tChoose base oil such as almond oil, coconut oil or olive oil. To this, add crushed neem and tulsi leaves and warm gently. Apply this all over your body and massage well. Keep for 30 minutes and get into the shower. Hot oil massage increases the blood circulation all over the body and thus reduces tan.\n" +
                "\n•\tIn 2 teaspoons of plain yogurt, add 1 teaspoon of honey and mix well to form a smooth paste. Apply on your face and keep for 15 minutes. Wash off with cool water. Repeat this procedure daily for best results.\n" +
                "\n•\tPrepare a fruit pack by combining the pulp of an avocado, papaya and cucumber. Then add 2 teaspoons of cream or malai. Mix well to form a paste and apply all over the face. Leave it for 20 minutes and rinse with warm water. People with oily or combination skin can avoid adding cream, they can add multani mitti instead into the pack.\n" +
                "\n•\tPeel and slice the papaya. Put it in a blender to make a smooth paste. Apply it on your skin and leave it for 20 minutes. Rinse it away with warm water\n");
    }
}

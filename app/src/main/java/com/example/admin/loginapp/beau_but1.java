package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tRinse your face with water and pat dry. Mix 2 tablespoons of honey and 1 teaspoon of cinnamon together until they are thoroughly blended and have formed a sort of paste. Apply the mask to your face (or spot treat) and leave on for 10-15 minutes. Rinse off completely, and pat your face dry. This is a sticky mixture, so make sure you have some paper towels at on hand.\n" +
                "•\tMix 1 tablespoon of milk or yogurt thoroughly with 1 tablespoon of honey. You can apply the mixture with a cotton pad, but scooping it up and patting it on works just fine as well. Let each layer dry before adding a new one, until the mask is the thickness you want. Let it sit for 10-15 minutes. Wash your mask off and use a washcloth to gently scrub in a circular motion\n ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tRinse your face with water and pat dry. Mash up the flesh of the papaya well, until it is of a consistency that can be easily applied to your skin. Leave it on for 15-20 minutes, and then rinse off completely with warm water. If your skin has a tendency to get dry after you cleanse it, use a moisturizer appropriate for your skin type afterwards.\n" +
                "\n•\tRinse your face with water and pat dry. Grind/pound up your orange peels (you could use a blender, mortar and pestle, whatever gets the job done) and add a little water to create a paste. Add a little at a time, as too much will make it too thin and runny. Once you have the right consistency, apply it to your face and/or problem areas. Wait for 20-25 minutes. Ideally the mask should be firm, but it can still work if it isn’t. Rinse off completely with water, pat your face dry\n" +
                "\n•\tTake banana peel, and rub in a circular motion all over your face. When you feel as though you’ve covered all of your face, let it sit for at least 30 minutes before rinsing it off.\n" +
                "\n•\tUsing your fingertips or a Q-tip, apply the aloe gel directly to your problem areas.\n" +
                "\n•\tRinse face gently with water and pat dry. Dab fingers, a cotton ball, or a Q-tip in lemon juice and apply to pimple. If it stings, try mixing it first with a bit of yogurt.\n");

    }
}

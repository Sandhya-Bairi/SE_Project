package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class recepies_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies_but3);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("Boil all the vegetables of your preference with more water. In the mean-time take a small bowl, pour water into it and add a spoonful corn flour to it and stir it well to remove the lumps. Add this mixture to the boiling vegetables, stir it while adding corn flour mixture. Add salt, pepper, chili, vinegar while serving.\n" +
                "\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("a.\tGreen tea- Take some hot water in a bowl and add this leaves to it and leave it aside for a minute, strain out the water and then again add hot water those leaves, allow it rest for a minute and now strain the water in a cup and add some mint leaves.  You can take it directly or add a 1/4th teaspoon of honey to it, stir it and have it in Luke warm condition.\n" +
                "\n" + "b.\tBlack Tea- Add black tea leaves to water and bring it to a boil, transfer it in flask, leave it for 10 minutes. Strain it in a tea glass and have it.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("c.\tLemon Tea- Add tea leaves, crushed ginger and cloves, a pinch of salt, a tablespoon of sugar to the water and bring it to a boil. Add 1/4th of lemon piece at the end and leave it for 5 minutes and serve it.");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("a.\tSimply boil sweet corn, add a pinch of salt, chat masala and squeeze a lemon, mix it well and have it. You can eat it by stuffing it in between 2 slices of bread.");

        TextView txtDetails5 = (TextView) findViewById(R.id.txtDetails5);
        txtDetails5.setMovementMethod(new ScrollingMovementMethod());
        txtDetails5.setText("b.\tMash a boiled potato and add chopped onion, some moong dal, salt to taste, squeeze a lemon and mix it well and have it.\n" +
                "     \n" + "c.\tBoil sprouts with a pinch of salt and mash them slightly, add salt to taste, chili powder, coriander or cilantro leaves and add some water and cook it for 5 minutes.\n");


    }
}

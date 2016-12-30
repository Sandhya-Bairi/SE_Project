package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Fungi thrive in warm, moist environments, so this type of environment can cause them to " +
                "naturally overpopulate.\n• The same fungi that cause jock itch, athlete’s foot, and ringworm can cause nail infections.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• scaling under the nail, which is called subungual hyperkeratosis\n" +
                "• white or yellow streaks on the nail, which is called lateral onychomycosis\n" +
                "• a crumbling corner or tip of the nail, which is called distal onychomycosis\n" +
                "• flaking white areas on the nail’s surface, which may include pits in the nail\n" +
                "• the appearance of yellow spots at the bottom of the nail, which is called proximal onychomycosis\n" +
                "• loss of the nail");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Tea tree/orange oil scrub\n" +
                "➣ You will need…\n" +
                "\t\t- 1 teaspoon of tea tree oil\n" +
                "\t\t- 1/2 teaspoon of orange oil (optional)\n" +
                "\t\t- 1/2 teaspoon of grapeseed or olive oil\n" +
                "\t\t- Cotton balls\n" +
                "➣ Apply coconut oil directly.\n" +
                "➣ Apply petroleum jelly.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("\t\tAs soon as you notice the tell-tale signs of nail fungus, mix together 1 of tea tree oil," +
                " ½ teaspoon of orange oil, and ½ teaspoon of grapeseed or olive oil. " +
                "\nSoak a cotton ball in the mixture and apply to affected nail pressing it on gently but firmly " +
                "so the liquid comes out. Let this dry naturally." +
                " \nAlternatively, you can place 4-5 drops of tea tree oil in enough water to soak your feet in," +
                " and do that for 15-20 minutes. Both treatments should be done faithfully morning and evening.");

    }
}

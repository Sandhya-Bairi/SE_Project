package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• living in a dry, hot climate\n• spending a lot of time in the sun\n•" +
                " frequently swimming in chlorinated water");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Brittle hair can be a combination of dry, dull, frizzy, broken, split-ended, shedding and lackluster hair.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tApply warm olive oil on your scalp and hair shafts. Massage gently for a few minutes, and then cover your hair with a warm towel. Leave it on for at least 30 minutes or overnight. Finally, shampoo and condition your hair. Follow this remedy at least once a week.\n" +
                "•\tDepending on the length of your hair, mix the pulp of ½ to 1 ripe avocado and 1 to 2 teaspoons of olive oil in a blender until you get a thin, smooth consistency. Apply it to your hair, leave it on for about 1 hour and then wash it out.\n" +
                "\n" +
                "•\tMassage 1 whisked egg on your scalp and hair for a few minutes. Cover with a shower cap and leave it on for 20 minutes. Then, rinse with cool water and shampoo as usual.\n" +
                "•\tApply some aloe-vera juice directly on your damaged hair. Leave it on for 10 to 15 minutes, then wash it off with warm water.\n" +
                "•\tMassage your scalp every day, or at least 3 times a week, for about 5 minutes with warm coconut oil. Leave it on overnight. Wash your hair the next morning with a mild shampoo.\n" +
                "•\tMash 1 ripe banana and work it thoroughly into your hair. Allow it to sit for 1 hour, then rinse it off with lukewarm water.\n" +
                "\n");


        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tavoid daily shampooing\n" +
                "•\tuse a protein-enriched conditioner to repair hair damage\n" +
                "•\tblow-dry your hair less frequently\n" +
                "•\tavoid heated styling products, such as flat irons, curling irons, and electric rollers\n" +
                "•\tcondition your hair every time you wash it\n" +
                "•\tuse a shampoo and conditioner that are meant for your hair type; there are hair products specifically formulated for chemically treated hair\n");
    }
}

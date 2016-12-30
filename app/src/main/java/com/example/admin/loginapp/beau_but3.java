package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tMix two teaspoons of granulated sugar (brown or white) and one teaspoon each of honey and water. Heat the mixture in a microwave or on a stove for about half a minute until it bubbles and turns brown. Allow it to cool. Using a spatula, apply it on the areas where you want to remove the hair. Place a cloth strip over the sugar wax and smooth it out with your fingers in the direction of the hair growth. Finally, rip it off in the opposite direction of hair growth. Repeat as needed.\n" +
                "\n•\tMix together two tablespoons of chickpea flour, one tablespoon of milk cream, one and one-half teaspoon of milk, and three-quarter teaspoons of turmeric. Apply this thick paste on your face and leave it on for 20 minutes or until it dries. Scrub it off using a facial loofah pad or simply a soft cloth dipped in lukewarm water. Do this at least three or four times a week for about a month.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tAdd one and one-half tablespoon of rose water to two tablespoons of green gram flour. You may add one tablespoon of lemon juice as well. Spread the paste on your face and leave it on for 20 to 25 minutes before scrubbing it off. Do this three to four times a week\n" +
                "\n•\tBoil a cup of water. Add one teaspoon of dried spearmint to it. If you have fresh spearmint leaves, use four or five of them. Cover the container and let it steep for about five to 10 minutes. Strain and drink the tea. Have it twice daily\n" +
                "\n•\tWhisk one egg white and add one tablespoon of sugar and one-half tablespoon of corn flour to it. Apply the mixture to your face, let it dry for 15 to 20 minutes and then peel it off. Repeat the process three or four times a week.\n");
    }
}

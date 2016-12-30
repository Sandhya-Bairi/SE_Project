package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tStress\n" +
                "•\tYour genes\n" +
                "•\tA yeast that normally lives on skin\n" +
                "•\tCertain medical conditions and medicines\n" +
                "•\tCold, dry weather\n" +
                "•\tAcne\n" +
                "•\tAIDS\n" +
                "•\tAlcoholism\n" +
                "•\tDepression\n" +
                "•\tEating disorders\n ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tDandruff and cradle cap are common names for seborrheic dermatitis..\n" +
                "•\tSkin can itch, burn, or look red. The scales that flake off could be white or yellowish and look moist or oily.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tLime juice is acidic, but it is less effective when used by itself. " +
                "Therefore, you can use the lime juice after the other treatments in order to remove any unpleasant smell and " +
                "revive your hair.\n" +
                "* Aloe Vera \n" +
                "This succulent, cactus-like, fleshy perennial plant is usually used for topical treatment.\n" +
                "* Hot Oil Treatment\n" +
                "Apply lukewarm hair oil to your scalp. Cover the hair with a cap and leave for about 10 to 15 minutes either below a hooded dryer otherwise a warm towel. The flakes on your scalp are loosened. With the tip of your fingers gently agitate the scales.\n" +
                "* Apple Cider Vinegar\n" +
                "This acidic vinegar is diluted in water (10 parts of water and 1 part of apple cider vinegar) and massaged into the scalp gently for a couple of minutes and then rinsed thoroughly .\n" +
                "* Olive Oil\n" +
                "This remedy is one of the common therapies used to treat infants with cradle cap. However, adults can also try this remedy. Apply olive oil to the scalp and leave for about 20 minutes.\n" +
                "The affected parts of the scalp will be softened after the oil treatment and you can easily get rid of the crusts or flakes using a comb. Shampoo the hair afterwards, but make sure not to rub the shampoo on your scalp.\n");
    }
}

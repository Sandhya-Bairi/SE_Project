package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but9);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• poor nutrition\n" +
                "• lack of growth hormone\n" +
                "• hormone imbalances (such as low levels of thyroxine due to hypothyroidism)\n" +
                "• Turner syndrome (genetic condition in females who are missing some or all of one X chromosome)\n" +
                "• Down syndrome (genetic condition in which individuals have 47 chromosomes instead of the usual 46)\n" +
                "• family history of growth delays\n" +
                "• pituitary gland tumor\n" +
                "• smaller birth and fetal weight\n• kidney, heart, digestive, or lung diseases\n• severe stress\n" +
                "• long-term use of certain drugs by pregnant mother\n" +
                "• dwarfism");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tMassage any of the hair oils mentioned above onto your hair and scalp by applying light pressure with your fingertips.\n" +
                "\n•\tMix one tablespoon each of Indian gooseberry or amla pulp and lemon juice. Massage your scalp with the mixture thoroughly. Cover your hair with a shower cap. Leave it on overnight and shampoo your hair in the morning.\n" +
                "\n" +
                "•\tSoak one cup of fenugreek seeds in water overnight. In the morning, grind them to make a paste. Apply the paste to your hair and cover with a shower cap. After about 40 minutes, rinse your hair.\n" +
                "\n•\tExtract the juice of one onion by grating it and then strain it. Apply the juice directly onto the scalp. Leave it on for about 30 minutes, and then wash it off. Finally, shampoo your hair.\n" +
                "\n•\tApply aloe vera gel or juice onto the scalp. Leave it on for a few hours and then wash it off with lukewarm water. \n");
    }
}

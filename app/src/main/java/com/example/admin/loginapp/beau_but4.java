package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("1.DARK LIPS:\n" +
                "\n\t•\tSqueeze a lemon and apply the juice on your lips before going to bed. Follow this simple remedy daily for one to two months.\n" +
                "\n\t•\tTake a thin slice of lemon, sprinkle a bit of sugar on top and rub it on your lips. It will exfoliate dead cells so new, fresh skin can appear. Use this remedy daily for a few weeks.\n" +
                "\n\t•\tPrepare a mixture of one-half teaspoon each of lemon juice, glycerin and honey. Apply it on your lips before going to bed. Do this daily until you see positive results.\n" +
                "\n\t•\tMix one tablespoon of rose petal paste and one teaspoon of butter, honey, or milk cream. Apply it on your lips and gently scrub. Follow this remedy two times a week.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("2.CRACKED LIPS:\n" +
                "\n\t•\tSimply apply pure organic honey on your chapped lips several times a day. You can also make a paste of honey and glycerin and apply it before going to bed .\n" +
                "\n\t•\tApply pure coconut oil several times a day on your lips to keep them moist. You can also use olive oil.\n" +
                "\n\t•\tApply fresh milk cream on your lips and leave it on for 10 minutes. Then gently wash your lips with a cotton ball dipped in lukewarm water\n");
    }
}

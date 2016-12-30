package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but7);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Nutritional deficiencies\n" +
                "• Dehydration\n" +
                "• Viral infection\n" +
                "• Dryness\n" +
                "• Injury or cut\n" +
                "• Allergic reaction to a food product\n" +
                "• Insect bite\n" +
                "• Bad lip care products\n" +
                "• Extreme climatic conditions");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•Enlarged or fat lip (lip distention), Numbness or your lip feels numb, Pain on your lip, Tight and dry lip, Tingling feeling, itchiness, inflammation, Redness and skin color changes, Blisters on your lip and chapped lips, Discharges which might include pus as well as pus filled bumps, Fever, chills, nasal congestion or runny nose.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ You can take ice cubes, wrap them in a washcloth and press this pack gently over the swollen area for 8-10 minutes. Take a break of 10 minutes and repeat the process\n" +
                "➣ Soak a washcloth in warm water and remove excess water from the cloth and apply it on your lips for 8-10 minutes.\n" +
                "➣ Apply turmeric powder mixed with lukewarm water all over the swollen area. \n" +
                "➣ Put salt on  the lips and leave it for 10-15 minutes and wash with cold water\n");

    }
}

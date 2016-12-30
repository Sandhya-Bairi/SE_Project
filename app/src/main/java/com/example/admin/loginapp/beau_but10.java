package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but10);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tThe simple, healing properties of milk will take care of your oily skin problems. Simply soak a cotton ball in milk and wipe your face with it twice a day, at least once before going to sleep. If you feel you need a little extra cleansing, add a few drops of lemon concentrate to the cotton ball.\n" +
                "\n•\tSqueeze half an orange into a bowl and apply it on your face with the help of a cotton ball. Keep it on for about ten to fifteen minutes before washing off.\n" +
                "\n•\tMix sandalwood and turmeric powder, and add water to it. Then spread this paste on your face and head, and wait for about ten to fifteen minutes before washing off.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tMash aloevera  gel with your fingers as best as you can. Then apply this on your face and hair, and keep it on for about ten minutes or till it’s dry. Then, wash off.\n" +
                "\n•\tMix one egg yolk with two tablespoons of honey. Add some lukewarm water and mix it. Apply this paste directly on the scalp. Leave it on for a couple of hours and then wash off thoroughly.\n" +
                "\n•\tBoil Neem leaves in water and allow the infusion to cool. You can apply this on both your face and scalp. It doesn’t require to be washed off; if you feel it’s too strong on your skin, wipe away with lukewarm water.\n" +
                "\n•\tDab cotton drenched in rose water on your face, once a day, for about a month. This not only reduces oil build up but also provides a cooling sensation to the skin.\n" +
                "\n•\tDiet should consist of green leafy vegetables. To control oil secretion drink atleast 8-10 glasses of water each day .\n");
    }
}

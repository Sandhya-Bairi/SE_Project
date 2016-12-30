package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• excessive physical or emotional stress\n" +
                "• hormonal imbalances\n" +
                "• nutritional deficiencies\n" +
                "• pollution\n" +
                "• allergies\n" +
                "• use of wrong hair care products\n• poor hair care routine, and heredity.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tAn increase in the visible number of strands that fall each day\n" +
                "•\tChanges in the quality of hair, where the individual strands actually seem finer than before\n" +
                "•\tAppearance of bare patches of skin on the scalp\n" +
                "•\tReceding hairline or excessive broadening of the forehead\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tTake one or two eggs, depending on the length of your hair, and beat it properly. Apply the egg on wet hair and allow it to sit for about 30 minutes. Wash your hair with lukewarm water and shampoo. You can use this protein treatment once or twice a week.\n" +
                "\n•\tMassage your hair and scalp with warm olive oil and leave it on for at least 30 to 45 minutes. Rinse it out thoroughly and wash your hair using a mild shampoo.\n" +
                "\n•\tMake a mixture of one mashed avocado, one mashed banana and one tablespoon of olive oil. Massage it on your scalp and leave the mixture on your hair for about 30 minutes so that the nutrients are absorbed by the scalp.\n" +
                "\n•\tSoak two to three tablespoons of fenugreek seeds in water for eight to 10 hours. Grind the soaked seeds to make a fine paste. You can also mix two teaspoons of coconut milk in it. Apply the paste on your hair and scalp and allow it to sit for about 30 minutes before washing your hair with lukewarm water\n" +
                "\n•\tHeat a mixture of equal parts of castor oil and coconut oil. Simply using castor oil will also work but it tends to be too thick. Apply it on your head and scalp and massage in circular motions.\n" +
                "\n•\tTake the Indian gooseberry fruit and its extract as a dietary supplement for healthy hair.\n");
    }
}

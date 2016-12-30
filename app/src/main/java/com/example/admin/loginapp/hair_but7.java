package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but7);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tA tickling feeling of something moving on the head, hair, or body\n" +
                "•\tsores that develop from scratching the itchiness caused by lice\n" +
                "•\tirritability and difficulty sleeping\n" +
                "•\tred bumps on the head, neck, shoulders, or pubic area\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tGrind eight to 10 garlic cloves into a paste and mix in two to three teaspoons of lime juice. Apply the mixture thoroughly onto the scalp. Leave it on for a half an hour and then rinse the hair thoroughly with hot water.\n" +
                "\n•\tApply some baby oil on your hair and then comb your hair slowly so that lice start falling from your head. Then wash your hair with laundry detergent and hot water. Before bed, put some white vinegar on your hair and cover your head with a shower cap or towel. Leave it on overnight. In the morning, wash your hair with regular shampoo and then apply some conditioner.\n" +
                "\n•\tApply any type of olive oil to your hair generously before going to bed. Put a shower cap or towel on your head to keep the oil on your hair overnight. In the morning, comb out the tiny parasites and then wash your hair with some herbal shampoo containing tea tree oil.\n" +
                "\n•\tMix one-quarter cup of salt and one-quarter cup of vinegar thoroughly. Gently spray the solution onto your hair so that it becomes slightly wet. Put on a shower cap and leave it for about two hours. Then wash and condition your hair. Repeat this every three days to get positive results.\n" +
                "\n•\tApply a thick layer of petroleum jelly to the scalp before going to bed. Cover your head tightly with a shower cap or towel. Leave it on overnight. In the morning, use baby oil to remove the petroleum jelly. Comb your hair thoroughly to remove the lice.\n" +
                "\n•\tMix together one teaspoon of tea tree oil, one ounce of natural shampoo and three tablespoons of coconut or olive oil. Apply the solution gently throughout your hair and cover your head with a shower cap or towel. Leave your head covered for a half an hour and then rinse thoroughly with hot water.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• don’t share hairbrushes, hairclips, combs, and hats.\n" +
                "• Vacuum all chairs, sofas, headboards, and anything that may have contacted anyone’s head.\n" +
                "• Soak combs, brushes, and any hair ties in 10 percent bleach or 2 percent Lysol for one hour.\n" +
                "• You can also heat them in water—as close to boiling as possible. \n" +
                "• Even safer—go out and get new combs, brushes, and hair ties. \n" +
                "• One last thing—do not use your pet’s flea shampoo—it is true that these contain some of the same" +
                " ingredients as the human lice shampoos, but they have not been tested on children and may be unsafe to use!");
    }
}

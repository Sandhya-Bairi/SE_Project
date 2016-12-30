package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ear_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• ear infection\n" +
                "• change in pressure (such as when flying on a plane)\n" +
                "• earwax buildup\n" +
                "• a foreign object in the ear\n" +
                "• strep throat, sinus infection\n" +
                "• shampoo or water trapped in the ear\n" +
                "• use of cotton swabs in the ear\n" +
                "\t\tLess common causes:\n" +
                "• temporomandibular joint (TMJ) syndrome\n" +
                "• perforated eardrum\n" +
                "• arthritis affecting the jaw\n" +
                "• infected tooth, impacted tooth\n" +
                "• eczema in the ear canal\n" +
                "• trigeminal neuralgia (chronic facial nerve pain)\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• severe ear pain\n" +
                "• Dizziness\n" +
                "• bad headache\n" +
                "• swelling around the ear\n" +
                "• drooping of the facial muscles\n" +
                "• blood or pus draining from the ear");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tPut 3-4 drops of lukewarm olive oil as ear drops into the ear canal.\n" +
                "\n•\tAlternatively, you can dip a cotton bud in the oil and put it firmly into the ear.\n" +
                "\n•\tHeat one teaspoon of minced garlic in two tablespoons of sesame oil. Cool and filter the oil. Put 2-3 drops of this garlic oil in the aching ear.\n" +
                "\n•\tExtract one tablespoon of onion juice from grated onions and heat it over low heat. Then put 2-3 drops of the juice into affected ear 2-3 times a day.\n" +
                "\n•\tPutting moist heat around an infected ear can work as a great pain reliever. Simply wrap a hot water bottle in a towel and press it against the aching ear for a few minutes.\n" +
                "\n•\tExtract juice from fresh ginger and put it directly into the ears to get relief from pain and reduce inflammation.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• avoiding smoking and exposure to secondhand smoke\n" +
                "• keeping foreign objects out of the ear\n" +
                "• drying the ears after swimming or bathing\n" +
                "• avoiding allergy triggers, such as dust and pollen");
    }
}

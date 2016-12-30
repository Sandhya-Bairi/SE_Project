package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but4);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
       txtDetails1.setText("•\tItching in your mouth and/or swelling of the lips\n" +
               "•\tGastrointestinal symptoms, such as vomiting, diarrhea, or abdominal cramps and pain\n" +
               "•\tHives or some other form of rash and reddening of the skin\n" +
               "•\tTightening of the throat and trouble breathing\n" +
               "•\tDrop in blood pressure\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tWashing the affected area with chamomile tea.\n" +
                "•\tApplying olive oil to the rash.\n" +
                "•\tA mixture of cod liver oil and vitamin E is very effective in eliminating rashes.\n" +
                "•\tGrinding holy basil leaves, combined with 1 tablespoon of olive oil, 2 garlic cloves, a pinch of salt and a pinch of pepper, and smearing over the rash.\n" +
                "•\tTaking an oatmeal bath is one of the best body rash treatments. Pour one cup of uncooked oatmeal into the bathwater and soak in this solution.\n" +
                "•\tAnother extremely effective treatment is applying mashed almond leaves to the affected area.\n" +
                "•\tVitamin C has strong antioxidant properties that can help heal rashes and reduce the chances of subsequent allergic reactions.\n" +
                "•\tRaw apple cider vinegar and raw honey are very effective in eliminating allergies. Take one tablespoon of apple cider vinegar and honey three times a day or mix the apple cider vinegar and honey in a glass of water. The honey should be obtained from a local source.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tThere are no drugs or treatments available that prevent food allergies. If you have food allergies, the only way to avoid allergic reactions is to avoid allergenic foods.");

    }
}

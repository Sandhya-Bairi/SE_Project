package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but11);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tBeauty products, soaps, and laundry detergent\n" +
                "•\tDyes in clothing\n" +
                "•\tChemicals in rubber, elastic, or latex\n" +
                "•\tpoison sumac\n" +
                "•\tAn allergic reaction\n" +
                "•\tPoisonous plants such as poison oak, poison ivy, or a side effect\n" +
                "•\tResult of sensitivity to sunlight\n" +
                "Symptoms: \n" +
                "•\tincreasing pain or discoloration\n" +
                "•\ttightness of the throat or difficulty breathing\n" +
                "•\tswelling of the face\n" +
                "•\tnew pain or a new rash\n" +
                "•\tfever over 100.0 degrees F\n" +
                "•\tconfusion or dizziness\n" +
                "•\tsevere head or neck pain\n" +
                "•\trepeated vomiting or diarrhea\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tMix the clay in a bowl or cup with a bit of filtered water until it has a creamy consistency like peanut butter (like in the picture at the top of the page). Then, just dab the clay paste onto itchy areas, let it dry, then rinse or peel it off.\n" +
                "•\tJust put a few drops of it onto a cotton ball or washcloth and dab it on to the affected area.\n" +
                "•\t The quickest, easiest way is to crush up the leaves and rub the peppermint directly onto the skin.\n" +
                "•\tCrush up the fresh basil leaves and rub directly onto the skin.\n" +
                "•\tSimply rub extra-virgin olive oil or a combination of equal parts of olive oil and honey on your rash a few times daily until it heals completely.\n");
    }
}

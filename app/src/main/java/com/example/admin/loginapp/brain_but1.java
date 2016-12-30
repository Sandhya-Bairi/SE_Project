package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("Blood clots are the result of:\n" +
                "•\tDisruptions in blood flow \n" +
                "•\tInjury to the blood vessels\n" +
                "•\tChanges in blood composition \n" +
                "•\tmedications such as estrogen, and birth control pills with higher levels of estrogen\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\theadaches\n" +
                "•\tspeech changes\n" +
                "•\tparalysis  \n" +
                "•\tdizziness\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tFoods with natural antibiotic properties include garlic, olive oil and onions\n" +
                "•\tWater and Vitamin D from sunshine has long been recognized by Ayurvedic medicine as a natural blood thinner.\n" +
                "•\tModerate daily exercise will also help thin the blood\n" +
                "•\tNatural salicylates like Apple cider vinegar, blackstrap molasses and cayenne pepper are very popular natural blood thinners.\n" +
                "•\tWarming spices such as curry powder, ginger and cinnamon, turmeric, oregano, dill, licorice and mint also have blood thinning properties.\n" +
                "•\tOranges and tangerines, prunes, grapes and many berries (especially strawberries, cranberries and blueberries) are beneficial.\n" +
                "•\tFish, walnuts and pumpkin seeds are some of the foods high in omega-3 BRA\n" +
                "•\tFoods with natural antibiotic properties include garlic, olive oil and onions.\n");

    }
}

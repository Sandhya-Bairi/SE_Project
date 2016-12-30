package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class heart_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_but8);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tGastroesophageal reflux \n" +
                "•\tEsophageal contraction disorders\n" +
                "•\t Lung disorders\n" +
                "•\t Pericardial conditions and digestive abnormalities like ulcers, gallbladder or pancreatic diseases.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
       txtDetails2.setText("•\tTake a clove of raw garlic and swallow it with water every morning on an empty stomach.\n" +
               "•\tTake 10 drops of garlic juice and 2 teaspoons of honey, mix them in a glass of water. Have it once a day. This is especially beneficial for asthma related discomforts.\n" +
               "•\tTake 8-10 cloves of garlic and grind them to get their paste. Mix this with some flour to make a poultice. Tie it to your back to get relief from pleurisy related chest pain. Pleurisy is a condition when water gets accumulated in your lungs and you experience fever, difficulty in breathing along with chest pain.\n" +
               "•\tTake a glass of milk and add 6-8 chopped garlic to this. Now boil this milk. Drink it while chewing the garlic in it. This helps in reducing phlegm relieving you of chest pain due to phlegm accumulation.\n" +
               "•\tAdd few drops of garlic juice in a cup of hot water and drink this to relieve chest pain.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tChew 4-5 holy basil leaves every morning.\n" +
                "•\tCrush 8-10 basil leaves and extract juice from this. Mix this juice to 1-2 tsp of honey and have it daily.\n" +
                "•\tBoil 1-2 cups of water with few basil leaves and some ginger pieces till the water remains half of its original quantity. Add a tsp of honey to this. Have this tea to relieve cough and cold causing chest pain.\n•\tAdd turmeric powder while cooking dishes.\n" +
                "•\tTake ½ teaspoon of turmeric powder and mix it with a cup of hot milk. Add 2 teaspoons of honey and a little black pepper to it. Mix well and drink this hot turmeric milk.\n" +
                "•\tTake 2 tablespoons of turmeric powder and 2 tablespoons of apple cider vinegar. Pour hot water over it. Drink this tea.\n");

    }
}

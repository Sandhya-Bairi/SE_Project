package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class lung_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lung_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• breathing air that contains harmful microorganisms, viruses, bacteria.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Fever\n" +
                "• sweating and shaking chills\n" +
                "• Cough ( you will cough out sputum, can be streaked with blood)\n" +
                "• Chest pain upon deep breathing or coughing\n" +
                "• Increased rate of heartbeat\n" +
                "• Shortness of breath\n" +
                "• Diarrhoea and nausea\n" +
                "• Headaches");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Mix one cup of milk in four cups of water and add one-half teaspoon of crushed garlic to it. Boil the solution until it reduces to one-fourth of the original amount. Drink it three times a day.\n" +
                "• Another way to use garlic is to marinate crushed garlic cloves in a mixture of equal amounts of fresh lemon juice and honey. Take two to three teaspoons of this, three or four times a day.\n" +
                "• Mix some lemon juice and a dash of cayenne pepper in an eight-ounce glass of water. Drink it a few times a day.\n" +
                "• Make fenugreek tea by boiling one teaspoon of fenugreek seeds in 500 ml or about two cups of water. Strain and drink four cups of fenugreek tea a day. To improve its taste, you can add a little lemon juice. Reduce the amount you drink as you feel better.\n" +
                "• Boil one tablespoon of sesame seeds in a cup of water. Mix in one tablespoon of linseed (flaxseeds) and continue boiling. Strain the mixture and then add one teaspoon of honey and a pinch of salt. Drink this mixture once daily.");
    }
}

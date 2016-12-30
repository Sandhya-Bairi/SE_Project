package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class lung_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lung_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• when the lining of the bronchial tubes repeatedly becomes irritated and inflamed and due to smoking\n" +
                "• extended exposure to air pollution, industrial or chemical fumes, and toxic gases");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• cough\n" +
                "• sputum production\n" +
                "• shortness of breathing\n" +
                "• wheezing\n" +
                "• fatigue\n" +
                "• sore throat\n" +
                "• muscle aches\n" +
                "• nasal congestion, and headaches.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Add half a teaspoon each of ground ginger, cinnamon and cloves in a cup of hot water. Stir well and drink the mixture for a few days to get relief.\n" +
                "• Combine one teaspoon each of ginger powder, pepper, and cloves. Take it three times a day with honey or milk.\n" +
                "• Add three chopped garlic cloves in a glass of milk and boil it. Drink it at night before going to bed.\n" +
                "• Take a glass of hot milk boiled with one teaspoon of turmeric mixed in it before boiling.\n" +
                "• Apply eucalyptus oil on the chest.\n" +
                "• Add one  teaspoon of honey to your regular cup of tea");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• quit smoking\n" +
                "• avoid other lung irritants including paint, toxic fumes, and dust.\n" +
                "• If you work in an industry where you’re frequently exposed to such irritants," +
                " wear a mask over your nose and throat to protect your lungs.");

    }
}

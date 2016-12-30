package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class lung_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lung_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• bacteria that spread from person to person through microscopic droplets released into the air\n" +
                "• This can happen when someone with the untreated, active form of tuberculosis coughs, speaks, sneezes, spits, laughs or sings.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Coughing that lasts three or more weeks\n" +
                "• Coughing up blood\n" +
                "• Chest pain, or pain with breathing or coughing\n" +
                "• Unintentional weight loss\n" +
                "• Fatigue\n" +
                "• Fever\n" +
                "• Night sweats\n" +
                "• Chills\n" +
                "• Loss of appetite");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Add 10 drops of garlic juice to a glass of hot milk and drink it before going to bed. Do not drink water afterwards, as it may diminish the beneficial effects.\n" +
                "• Dice 10 cloves of garlic and boil them in one cup of milk. Eat the boiled pieces of garlic and then drink the milk. Do this daily for a few months.\n" +
                "• Take a ripe banana, mash it and mix in one cup coconut water, one-half cup yogurt, and one teaspoon honey. Consume it twice daily.\n" +
                "• Make raw banana juice and drink one glass of it daily.\n" +
                "• Drink the juice of the banana plant stem to relieve symptoms like chronic cough, excess phlegm, excessive perspiration at night with a high fever and so on. Slowly sip one to two cups of banana stem juice every two hours until symptoms subside.\n" +
                "• Boil a handful of drumstick leaves in one cup of water for five minutes. Allow it to cool and add salt, pepper and lime juice. Drink this daily in the morning on an empty stomach.\n");
    }
}

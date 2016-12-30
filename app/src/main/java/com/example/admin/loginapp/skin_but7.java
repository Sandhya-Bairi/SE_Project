package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but7);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• scalding from hot, boiling liquids\n" +
                "• chemical burns, electrical burns\n" +
                "• fires, including flames from matches, candles, and lighters\n" +
                "• excessive sun exposure");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• redness\n" +
                "• minor inflammation (swelling)\n" +
                "• pain, dry, peeling skin (occurs as the burn heals)");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ You can place a cold compress over the affected area. Repeat the remedy every few hours to relieve the discomfort. Do not use ice as it can restrict blood flow, which can eventually cause damage to the delicate tissues.\n" +
                "➣ Simply cut a slice of raw potato and rub it on the burn, making sure the juice from the potato is releasing over the area.\n" +
                "➣ Cut a small piece of the aloevera leaf and apply the fresh gel directly on the burn.\n" +
                "➣ You could also mix one teaspoon each of aloe-vera gel and turmeric and then apply.\n" +
                "➣ Take coconut oil and add a little lemon juice to it. Mix it properly and apply it on the affected area to facilitate healing.\n" +
                "➣ Apply mint toothpaste on the affected area\n");
    }
}

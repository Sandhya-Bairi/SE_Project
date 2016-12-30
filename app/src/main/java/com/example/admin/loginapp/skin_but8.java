package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• unprotected and repeated exposure to ultraviolet (UV) rays from the sun and from manmade sources like tanning beds.\n" +
                "• That’s because UV rays damage the DNA inside our skin cells.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• an absence of color in the hair, skin, or eyes, lighter than normal coloring of the hair, skin, or eyes\n" +
                "• patches of skin that have an absence of color\n" +
                "• impaired vision or blindness");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Include in your diet plenty of whole grains, sea vegetables, beans and soybeans, hot peppers, cabbage, tomatoes, onions, rosemary, garlic, grapes, citrus fruits, licorice root, green tea, flaxseed and olive oils, white fish, and mushrooms. \n" +
                "➣ Drink at least eight glasses of filtered water daily to keep the body’s waste materials flowing out.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• wear sunglasses\n" +
                "• apply sunscreen lotion, lip balm\n" +
                "• Avoid foods such as corn-fed beef, corn and soy products, gluten, trans-fats, fried foods, deli meats or foods that have any added preservatives or nitrates.");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Caused if you bite your tongue, cheek, or lip\n" +
                "• burn your mouth\n" +
                "• have irritation from a sharp object, such braces, retainer, or dentures\n" +
                "• brush your teeth too hard, or use a very firm toothbrush\n" +
                "• chew tobacco, are infected with the herpes simplex virus\n" +
                "• autoimmune disorders, bleeding disorders, bacterial, viral or fungal infection");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• redness and pain, especially when eating and drinking.\n" +
                "• Blisters may be developed.\n" +
                "• Depending on the size, severity, and location of the sores in your mouth, they can make it difficult to eat, drink, swallow, talk, or breathe. ");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Gently rub a small ice cube over the spot or rinse your mouth with ice-cold water.\n" +
                "➣ You could also chew on a clove bud (lavang) and direct the juice generated to the area where the ulcer is located. \n" +
                "➣ To prevent the ulcerated area from getting infected, make it a point to rinse your mouth with a little salt water.\n" +
                "➣ Dab a little honey onto the mouth ulcer or mix in a little turmeric to make a paste that can be applied on the affected area.\n" +
                "➣ Chew a few leaves of tulsi along with some water about three to four times every day.\n" +
                "➣ Drinking tender coconut water helps to cool the body. Applying a little coconut oil directly onto the mouth ulcer or chewing some coconut (fresh or dry) helps reduce pain and inflammation\n" +
                "➣ Mouth ulcers left untreated generally go away in a week or so; with these home remedies, you can expect faster relief. \n ");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Avoiding foods that irritate your mouth including acidic or spicy foods\n" +
                "• irritation from gum chewing\n" +
                "• brushing with a soft-bristled brush after meals and flossing daily, which will keep your mouth free of foods that might trigger a sore.");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but17);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• cavity\n" +
                "• tooth abscess (infection)\n" +
                "• gum disease\n" +
                "• tumors (benign or malignant)\n" +
                "• trauma\n" +
                "• cracked tooth\n" +
                "• wisdom teeth\n" +
                "• sinus\n" +
                "• ear or throat infection");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• throbbing pain or swelling in or around your tooth or gum\n" +
                "• Fever, sharp pain when you touch your tooth or bite down\n" +
                "• tenderness and achiness in or around your tooth\n" +
                "• painful sensitivity in your tooth in response to hot or cold foods and drinks\n" +
                "• burning or shock-like pain, which is uncommon");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• put a piece of raw onion on the affected tooth\n" +
                "• soak a cotton ball in any extracts of vanilla, almond, peppermint, or lemon and simply hold that soaked cotton to the pained area\n" +
                "• Rinse your mouth with hot salt water\n" +
                "• Chew a clove of garlic\n" +
                "• Apply the paste of a pinch of pepper powder mixed with a 1/4th teaspoon of salt and a dash of water.\n");
    }
}

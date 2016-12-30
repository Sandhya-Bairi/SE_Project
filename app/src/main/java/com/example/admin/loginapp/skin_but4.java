package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Autoimmune disorder\n" +
                "• Hereditary factors,\n" +
                "• Accumulation of toxic radicals\n" +
                "• Nervous secretion\n " +
                "• Nutritional deficiencies.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• In a focal pattern, the loss of skin color appears in only a few small areas.\n" +
                "• In a segmental pattern, depigmentation occurs on one side of the body.\n" +
                "• In a generalized pattern, the loss of melanin occurs on both sides of the body in a symmetrical pattern\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Do relaxation exercises\n" +
                "➣ Rub your hands with psoralea seeds soaked in the juice of ginger for three days.\n" +
                "➣ Apply basil leaves paste mixed with lime juice thrice a day \n" +
                "➣ Apply turmeric mixed with mustard oil every morning \n" +
                "➣ Drink one glass of neem juice daily\n");

    }
}

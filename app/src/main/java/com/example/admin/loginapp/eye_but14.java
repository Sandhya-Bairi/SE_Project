package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but14);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• The inappropriate balance between the amount of internal fluid produced and the amounts that drain away");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Pain\n• Redness\n• Blurred and reduced vision\n• Headache\n• Vomiting\n• Pupils half-dilated and unresponsive\n• Too light, cloudy cornea");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Consume food with rich content of vitamin C\n\n" +
                "➣ Do eye exercises to relax the eyes\n\n" +
                "➣ Drink plenty of green tea\n\n" +
                "➣ Try to include bilberry in regular diet\n\n" +
                "➣ Try to incorporate raw food as much as possible\n\n");

    }
}

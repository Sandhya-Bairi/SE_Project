package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but17);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Injury\n• Viruses\n• Contaminated contact lenses\n• Contaminated water\n• Vitamin A deficiency");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Eye redness\n• Pain\n• Blurred vision\n• Feeling that something is in your eye\n• Sensitivity to light\n• Excess tears.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Use ginger extract in a glass of lukewarm water mixed with a teaspoon of honey and drink it daily\n\n" +
                "• Use elder tree roots extract instead of ginger in the above\n\n" +
                "• Take proper care of eyes");
    }
}

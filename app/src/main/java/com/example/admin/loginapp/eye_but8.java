package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Burst of blood vessels in the eye.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Blurred vision\n• Sudden loss of vision in one eye\n• Seeing rings around lights\n• Dark spots of flashing lights.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Consume food having more content of vitamin A.\n\n" +
                "➣ Eat spinach daily.\n\n" +
                "➣ Do regular eye exercises.\n\n" +
                "➣ Avoid food with more content of sugar.\n\n" +
                "➣ Avoid carbohydrates.\n\n" +
                "➣ Apply grape seed paste on the eyes.\n\n");
    }
}

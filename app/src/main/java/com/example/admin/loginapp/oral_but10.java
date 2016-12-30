package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but10);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• smoking\n" +
                "• excessive alcohol consumption\n" +
                "• vitamin A deficiency, exposure to asbestos, poor dental hygiene");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• cough\n" +
                "• Changes in your voice such as hoarseness or not speaking clearly\n" +
                "• Difficulty swallowing\n" +
                "• Ear pain\n" +
                "• A lump or sore that doesn't heal\n" +
                "• A sore throat, Weight loss");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Drink green tea\n" +
                "• Drink hot water mixed with sea salt\n");
    }
}

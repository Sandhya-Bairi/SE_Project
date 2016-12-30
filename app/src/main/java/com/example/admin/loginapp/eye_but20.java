package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but20);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Disruption of the messages that are sent from the brain to the eyes\n• Migraines\n• Thyroid stroke\n" +
                "• Brain injury\n" +
                "• Infection.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Blurred or double vision\n• Feeling hard for movement of eyes\n• Drooping eyelids.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Wear eyepatches at night\n\n" +
                "• Eat food rich in content of vitamin C&K\n\n");

    }
}

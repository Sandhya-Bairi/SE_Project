package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ear_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tPut your finger in your ear and try to create a vacuum. Try putting your index finger in your ear and moving the index finger gently upwards. Ears are shaped differently, so this may take a bit of finessing. Move your finger around gently until you have created a vacuum. Try to suction the fluid out of your ear.\n" +
                "\n" +
                "•\tGet a blow-drier, turn it to its lowest setting and, keeping the blow-drier far enough away from your ear, send some air into your ear. The air can help dry up some of the fluid that is caught in the ear.\n");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but9);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("It is a condition or disorder of movement, muscle tone, or posture. \n" +
                "•\tCaused by a problem in the parts of the brain responsible for controlling movement. \n" +
                "•\tIt can occur if the brain is damaged in early life or develops abnormally, although the exact cause isn't always obvious. \n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("While there are no actual cures for cerebral palsy, natural remedies can help support brain and muscle function.\n" +
                "•\tEchinacea-  This promotes effective blood circulation and  neural communication. To begin treatment, try 20-40mg of Echinacea by mouth daily.\n" +
                "•\tFish oil supplement can be taken by mouth every day.\n" +
                "•\tPhysical Therapy-  It centers on strengthening the muscles throughout the body. \n" +
                "•\tGinger helps improve blood flow or circulation. \n");


    }
}

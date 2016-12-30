package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tAdding turmeric can help  to keep your brain sharp\n" +
                "•\tVolatile oils in thyme increases the levels of omega-3 in brain\n" +
                "•\tOregano leaves can enhance mental well being and regulate mood\n" +
                "•\tRosemary helps to fight free-radical damage in brain\n" +
                "•\tBlack pepper has a component called piperine that enhances beta-endorphins in brain\n" +
                "•\tNutmeg can help keep your brain sharp and boost  brain activity\n" +
                "•\tCloves act as mental stimulant and decreases oxidative stress\n" +
                "•\tExercising and meditating regularly is the best way to increase brain  sharpness\n" +
                "•\tDrink sufficient water\n" +
                "•\tDo not get stressed\n" +
                "•\tHoly basil is useful in reducing brain damage due to reduced cerebral circulation \n");
    }
}

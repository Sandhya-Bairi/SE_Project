package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stress_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_but7);
        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tCancer\n" +
                "•\tHeart disease\n" +
                "•\tStroke\n" +
                "•\tRespiratory disease\n" +
                "•\tLiver problem\n");

        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tStop smoking\n" +
                "•\tControl your blood pressure as it is a secret killer\n" +
                "•\tMaintain healthy cholesterol levels\n" +
                "•\tBe more physically active\n" +
                "•\tAvoid alcohol consumption\n" +
                "•\tEat food with more anti-oxidants and less preservatives\n" +
                "•\tLimit sun exposure if it is over\n" +
                "•\tWear helmet and seat belt to prevent accidents\n" +
                "•\tDon’t drink and drive\n" +
                "•\tReduce stress levels by exercising and meditating regularly\n" +
                "•\tEat healthy\n");

    }
}

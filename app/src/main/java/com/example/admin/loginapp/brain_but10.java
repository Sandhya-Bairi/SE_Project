package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but10);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tHeadaches\n" +
                "•\tLoss of vision\n" +
                "•\tCold intolerance\n" +
                "•\tConstipation\n" +
                "•\tDepressed mood\n" +
                "•\tFatigue\n" +
                "•\tWeight gain\n" +
                "•\tWeakness\n" +
                "•\tBody temperature problems\n" +
                "•\tEmotional problems\n" +
                "•\tExcess thirst\n" +
                "•\tObesity\n" +
                "•\tUncontrolled urination\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tResearch has shown that coffee and tea support the function of the hypothalamus. \n" +
                "\n" +
                "•\tB vitamins are essential for supporting the function of hypothalamus. Enriched rice or cereal, pork and legumes are" +
                " rich sources of thiamine. Natural sources of vitamin B-12 include milk, eggs, chicken, salmon and beef.\n");
    }
}

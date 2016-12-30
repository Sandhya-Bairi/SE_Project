package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class heart_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_but1);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tUsually, cardiac asthma is due to major mechanical heart failure.. In this, heart pumping efficacy is reduced and builds up fluid in lungs. This leads to narrowing of air passages and hence, causes wheezing and other problems.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tShortness of breath, not necessarily accompanied by wheezing.\n" +
                "•\tIncreased rapid and superficial breathing.\n" +
                "•\tIncreased blood pressure and heart beat rate.\n" +
                "•\tA feeling of uneasiness.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tConsume garlic, ginger, licorice root, turmeric, honey, omega-3 fatty acids.\n" +
                "•\tAvoid exposure to cigarette smoke, indoor and outdoor pollution, and common allergens such as dust (see Allergies\n" +
                "•\tAvoid food additives and processed foods.\n" +
                "•\tTry to take magnesium \n" +
                "•\tDo relaxation exercises\n");
    }
}

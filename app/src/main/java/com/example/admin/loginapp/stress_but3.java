package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stress_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_but3);

        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tSetting a gentle daily schedule can help you get back on track.\n" +
                "•\tSet goals\n" +
                "•\tExercise regularly\n" +
                "•\tFoods with omega-3 fatty acids (such as salmon and tuna) and folic acid  could help reduce depression\n" +
                "•\tGet enough sleep. \n" +
                "•\tTake on responsibilities.\n" +
                "•\tChallenge negative thoughts.\n" +
                "•\tDo something new.\n" +
                "•\tTry to have fun. .\n");

        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tTry to get outside atleast 15 min a day\n" +
                "•\tSmell lavender\n");

        TextView txtDetails3 = (TextView)findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tTry to drink 3 cups of chamomile tea a day when you feel anxious\n" +
                "•\tTry to get between 1 and 3 grams of omega-3s a day\n" +
                "•\tExercise  regularly\n" +
                "•\tTake bath with Epsom salts\n" +
                "•\tTake deep breaths and count to 10 slowly whenever u feel anxieted\n" +
                "•\tMaintain a positive attitude\n" +
                "•\tWelcome humour\n" +
                "•\tLimit alcohol and caffeine\n" +
                "•\tMedidate  regularly\n");
    }
}

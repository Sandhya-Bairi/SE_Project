package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class heart_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_but6);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tHigh blood pressure \n" + "•\tHeart attacks \n" + "•\tCoronary artery disease \n" + "•\tAbnormal heart valves \n" + "•\tHeart defects you're born with (congenital) \n" +
                "•\tAn overactive thyroid gland or other metabolic imbalance \n" + "•\tExposure to stimulants, such as medications, caffeine, tobacco or alcohol \n" +
                "•\tSick sinus syndrome — improper functioning of the heart's natural pacemaker\n" + "•\tLung diseases and stress due to pneumonia\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tPalpitations, which are sensations of a racing, uncomfortable, irregular heartbeat\n" +
                "•\tWeakness\n" +
                "•\tLightheadedness\n" +
                "•\tShortness of breath\n" +
                "•\t Chest pain\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tEat magnesium-rich foods like spinach, kale, Swiss chard and other dark green vegetables; nuts like almonds and cashews; seeds like sesame seeds and pumpkin seeds; quinoa; oatmeal; peanut butter; cold-water fish; avocados; bananas; dark chocolate and low-fat yogurt.\n•\tValsalva Maneuver-First, pinch your nose, close your mouth and then try to breathe out forcibly. This will accelerate your heart rate, and then slow down your heartbeat.\n" +
                "•\tCoughing vigorously for a few minutes can help break the pattern of a palpitation. It causes pressure to build up in your chest, which puts your heart back into a normal rhythm. This is not a preventive measure. Use this remedy only when you are having a palpitation.\n" +
                "•\tSit comfortably in a cross-legged position. Take slow, deep breaths through your nose, allowing your belly to expand with each inhalation. Breathe out slowly through your mouth. Repeat for a few minutes until your heart rate slows down.\n" +
                "•\tStir 1 tablespoon of blackstrap molasses into 1 cup of water and drink it.\n" +
                "•\tAs a decrease in fluid intake can make the heart more prone to irregular heartbeats, try drinking a glass of cold water to help restore your normal heartbeat. It will also help reduce stress, anxiety and dizziness.\n");
    }
}

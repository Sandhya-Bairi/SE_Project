package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• The most common causes of female infertility include problems with ovulation, damage to " +
                "fallopian tubes or uterus, or problems with the cervix. Age can contribute to infertility because as a " +
                "woman ages, her fertility naturally tends to decrease.\n" +
                "\n• Ovulation problems are caused by hormone imbalance, tumor or cyst, alcohol or drug use," +
                " excess weight, stress, thyroid gland problems, extremely brief menstrual cycles.\n" +
                "\n• Damage to fallopian tubes or uterus caused by pelvic inflammatory disease, previous infection, " +
                "polyps in uterus, scar tissue or adhesions, chronic medical illness.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tConsume pomegranate which boosts fertility in women. It helps increase blood flow to the uterus and thickens the uterine lining to reduce the chance of miscarriage. Plus, it promotes healthy development of the fetus. Mix equal amounts of finely powdered pomegranate seeds and bark and store it in an airtight jar. Take ½ teaspoon of this mixture with a glass of warm water twice daily for a few weeks.\n" +
                "\n•\tAdd 1 teaspoon of cinnamon powder to a cup of hot water. Drink it once daily for a few months. Also, include cinnamon in your diet by sprinkling cinnamon powder on your cereal, oatmeal, and yogurt.\n" +
                "\n•\tAdd 1 teaspoon of fresh or dried chaste berries to a cup of boiling water. Cover, steep for 10 minutes and strain it. Drink this tea once daily for a few weeks or months.\n" +
                "\n•\tGrind 10 to 12 dates (without the seeds) with 2 tablespoons of chopped coriander root to make a paste. Add ¾ cup of cow’s milk to the paste and boil it. Allow it to cool before drinking it. Drink this once daily for a week from the date of your last period. Eat 6 to 8 dates daily as a healthy snack and add chopped dates to milk, yogurt and smoothies.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tTake steps to prevent sexually transmitted diseases\n" +
                "•\tAvoid illicit drugs\n" +
                "•\tAvoid heavy or frequent alcohol use\n" +
                "•\tAdopt good personal hygiene and health practices\n" +
                "•\tHave annual check-ups with your GYN once you are sexually active\n");
    }
}

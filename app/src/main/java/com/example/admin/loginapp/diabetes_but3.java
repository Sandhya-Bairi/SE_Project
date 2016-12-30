package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class diabetes_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_but3);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tIncreased levels of certain hormones (cortisol, estrogen, lactogen) can interfere with body's ability to manage blood sugar known as INSULIN RESISTANCE . If pancreas cannot sufficiently increase insulin production to overcome the effect of the increased hormones, blood sugar levels will rise and cause gestational diabetes.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tVitamin D-Foods, such as salmon, mushrooms, can guarantee that nutrient intake is effective throughout the day.  \n" +
                "\n•\tProtein- Try to always pair carbs with a protein which will ease the digestive process. \n" +
                "\n•\tWhole Food Carbs- If you are pregnant or have already developed gestational diabetes, then eliminating simple carbohydrates could help prevent or treat the condition. Include plenty of fresh vegetables and fruit, lentils, oats, quinoa, milk, okra, carrots, peas, and similar food items. \n" +
                "\n•\tAvoid bread, especially white bread, and other empty carbohydrates found in junk food.\n" +
                "\n•\tOne way to protect yourself from gestational diabetes is to eliminate sugar from your diet entirely. Use alternatives like Stevia and agave nectar\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tIn some women, gestational diabetes cannot be prevented. But   chance of getting gestational diabetes can be lowered by staying at a healthy weight .\n" +
                "\n•\tIf you have had gestational diabetes, you are at risk for having it again in a future pregnancy.\n" +
                "\n•\tIf you have had gestational diabetes, avoid medicines that increase insulin resistance, such as nicotinic acid and glucocorticoid medicines (for example, prednisone and dexamethasone).\n");
    }
}

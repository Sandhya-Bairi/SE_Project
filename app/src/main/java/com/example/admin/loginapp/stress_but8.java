package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stress_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_but8);

        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tCalories don’t burn as there is no active work done by our bodies.\n" +
                "•\tFast Food and Unhealthy Food\n" +
                "•\tLack of Exercise \n" +
                "•\tHigh Calorie Consumption:\n" +
                "•\tLaziness\n" +
                "•\tHormonal imbalance and heredity\n");
        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tbreathing disorders\n" +
                "•\tcertain types of cancers like prostate and bowel cancer in men, breast and uterine cancer in women\n" +
                "•\theart disease\n" +
                "•\tdepression\n" +
                "•\tdiabetes\n" +
                "•\tgallbladder or liver disease\n" +
                "•\thigh blood pressure\n" +
                "•\thigh cholesterol\n" +
                "•\tlow self-esteem\n");
        TextView txtDetails3 = (TextView)findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tPeppermint is an herb of the mint family. \n" +
                "•\tBefore sleeping, you can drink a teaspoon of Apple Cider Vinegar. This will burn your body fats while you are asleep.\n" +
                "•\tStart day with honey and lemon juice.\n" +
                "•\tDrink Hot Water to Loose Extra Fat\n" +
                "•\tMake sure to keep at least 30 minutes gap between meal and water.\n•\tAdd one teaspoon of apple cider vinegar with one teaspoon of lemon juice for every cup of water\n");



    }
}

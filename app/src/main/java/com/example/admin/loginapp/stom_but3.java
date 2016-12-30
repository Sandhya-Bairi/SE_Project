package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Primary liver cancer (hepatocellular carcinoma) tends to occur in livers" +
                " damaged by birth defects\n" +
                "• alcohol abuse, or chronic infection with diseases such as hepatitis B and C, hemochromatosis.\n" +
                "• Hepatitis B and C and hemochromatosis can cause permanent damage and liver failure.\n" +
                "• Liver cancer may also be linked to obesity and fatty.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tA lump below the rib cage on the right side of the abdomen\n" +
                "•\tPain near the right shoulder or on the right side of the abdomen\n" +
                "•\tJaundice (a disease that causes skin to yellow)\n" +
                "•\tUnexplained weight loss\n" +
                "•\tFatigue\n" +
                "•\tNausea\n" +
                "•\tLoss of appetite\n" +
                "•\tDark-colored urine\n" +
                "•\tBloating\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tGiving up toxic ingestion of tobacco and alcohol, nonprescription drugs, and stimulants such as coffee.\n" +
                "\n•\tConsume grapes and berries\n" +
                "\n•\tAvoid stress\n" +
                "\n•\tRemove external contaminants such as toxic fumes, fumes.\n" +
                "\n•\tChew 3-6 cloves of garlic every day.\n");
    }
}

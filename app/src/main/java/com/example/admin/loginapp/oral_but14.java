package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but14);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• overgrowth of the yeast candida\n" +
                "• contamination of bottle nipples\n" +
                "• diabetes\n" +
                "• improper use of inhalers ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Pain or difficulty swallowing\n" +
                "• A feeling that food gets stuck in your throat or mid-chest area\n" +
                "• Fever, if the infection spreads beyond the esophagus");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Rinse your mouth with salt water\n" +
                "• Chew 3-4 garlic cloves\n" +
                "• Use 2-3 cups of plain yogurt\n" +
                "• Consume aloe-vera juice\n" +
                "• Consume a tea prepared with margosa leaves \n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Follow good oral hygiene practices.\n" +
                "• Don't overuse mouthwashes or sprays\n" +
                "• Limit the amount of sugar and yeast-containing foods you eat\n" +
                "• Quit smoking.");


    }
}

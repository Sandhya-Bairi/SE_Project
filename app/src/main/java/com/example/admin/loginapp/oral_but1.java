package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Poor Dental Hygiene\n" +
                "• Strong Foods and Beverages\n" +
                "• Smoking\n" +
                "• dry mouth\n" +
                "• sinus\n" +
                "• mouth or throat conditions.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• bad smell in your mouth\n" +
                "• bad taste in your mouth.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Drinking enough water is one of the simplest steps you can take to curb bad breath. \n" +
                "➣ Brush your teeth along with flossing twice a day\n" +
                "➣ Use a mouth rinse after every meal.\n" +
                "➣ Replace your toothbrush every two to three months.\n" +
                "➣ Chew a handful of cloves, fennel seeds, or aniseeds. \n" +
                "➣ Chew a fresh sprig of parsley, basil, mint, or cilantro. The chlorophyll in these green plants neutralizes odors.\n ");

    }
}

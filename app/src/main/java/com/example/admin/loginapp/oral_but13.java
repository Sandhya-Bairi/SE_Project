package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but13);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• caused by untreated respiratory infections or by disorders of the tonsils or adenoids\n" +
                "• HIV infection\n" +
                "• Epstein-Barr virus infection\n" +
                "• herpes simplex virus.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Bad breath\n" +
                "• Cough, Coughing up clear, yellow, light brown, or green mucus\n" +
                "• Difficulty breathing\n" +
                "• Difficulty speaking\n" +
                "• Pus or white patches covering the tonsils or throat\n" +
                "• Sore throat\n" +
                "• White patches on the tongue or mucus membranes of the mouth\n" +
                "• Severe pain\n" +
                "• Sudden swelling of the tongue or throat structures");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Soak licorice root in water for overnight and drink that water " +
                "• Take honey mixed in tea\n" +
                "• Drink hot salt water\n" +
                "• Simply add some of the dried root to a cup of boiling water to make tea. Sipping the tea two to three times a day may help ease throat pain.\n" +
                "• Take peppermint in a glass of water.\n");


    }
}

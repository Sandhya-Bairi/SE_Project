package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but23);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Loss of elasticity of the lens of the eye.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Having eyestrain or headaches after reading\n• Difficulty in reading small print\n• Needing brighter lighting when reading\n• Squinting.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Take vitamin A&B supplements\n" +
                "• Follow healthy diet along with eye exercises.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Avoid alcohol\n• Antidepressants\n• Follow healthy diet.");
    }
}

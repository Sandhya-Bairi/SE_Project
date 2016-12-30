package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but21);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Viral infections such as cold, measles, chickenpox\n• Poor digestion\n• Diabetes");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Headache\n• Fever\n• Sore eye\n• Dull vision\n• Pain when the eye moves\n• Nausea");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Take a cup of soybean milk mixed with a teaspoon of honey every night\n\n" +
                "• Eat lots of apples\n\n" +
                "• Take a glass of carrot and spinach juice regularly\n\n" +
                "• Try to consume eggs, fish\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Adequate water consumption\n• Protecting eyes with shades\n• Quitting smoking\n• Proper diet");
    }
}

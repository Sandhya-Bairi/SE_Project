package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Harmful sun rays\n• Glaucoma\n• Hyperthyroidism\n• Neuroblastoma \n• Retinoblastoma ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Difficulty in closing eyes fully while sleeping or blinking \n• Drying of the cornea\n• Difficulty with eye movement");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Eye drops\nUse eye drops can help to eliminate the scratching and dry feeling.\n" +
                        "\n➣ Change Sleeping Postition\nElevating the head portion of the bed might help reduce the amount of fluids inside the head resulting in the reducing pressure in the eyes, relieve pain and discomfort.\n " +
                        "\n➣ Sunglasses \nUse sunglasses which wrap and cover around and even sides of your eyes to prevent drying. ");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but13);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• eyelashes\n" +
                "• dried mucus\n" +
                "\n• sawdust\n" +
                "• dirt\n" +
                "• sand\n" +
                "• cosmetics\n" +
                "• contact lenses\n" +
                "• metal particles\n" +
                "• glass shards");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• a feeling of pressure or discomfort\n• a sensation that something is in your eye\n" +
                "• eye pain\n• extreme tearing\n• pain when you look at light\n• excessive blinking, redness or a bloodshot eye");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• a.\tDo not rub or put pressure on the eye.\n\n" +
                "• Do not use any utensils or implements, such as tweezers or cotton swabs, on the surface of the eye.\n\n" +
                "• Do not remove contact lenses unless there is sudden swelling or you have suffered a chemical injury.");

    }
}

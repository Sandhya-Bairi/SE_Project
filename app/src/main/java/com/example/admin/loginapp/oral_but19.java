package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but19);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Soft drinks\n" +
                "• Citrus juice\n" +
                "• Apples\n" +
                "• Coffee\n" +
                "• Wine, Beer, Vinegar\n" +
                "• Soy sauce, Gastric fluid");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Change in color of the enamel of the teeth\n" +
                "• Wear on the surface of the tooth\n• Formation of divots on the chewing surfaces of teeth.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Brush your teeth very frequently\n" +
                "• Restrict the intake of carbonated drinks.\n" +
                "• Restrict the consumption of apple and orange juices.\n" +
                "• Consume foods with high calcium content so as to strengthen your teeth. These foods include yogurt, cheese, peas, broccoli, almonds, white beans, and salmon.\n");
    }
}

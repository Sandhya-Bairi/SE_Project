package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Interface39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface39);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•Fever of 104 F (40 C) or greater\n" +
                "•Changes in mental status or behaviour, such as confusion, agitation, slurred speech\n" +
                "•Hot, dry skin or heavy sweating\n" +
                "•Nausea and vomiting\n" +
                "•Rapid pulse and breathing\n" +
                "•Headache\n" +
                "•Fainting, which may be the first sign in older adults\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•Put the person in a cool tub of water or a cool shower.\n" +
                "•Spray with a garden hose.\n" +
                "•Sponge with cool water.\n" +
                "•Fan while misting with cool water.\n" +
                "•Place ice packs or cool wet towels on the neck, armpits and groin.\n" +
                "•Cover with cool damp sheets.\n" +
                "•Let the person drink cool water or other non alcoholic beverage without caffeine, if they are able to drink \n" +
                "•Begin CPR if the person loses consciousness and shows no signs of circulation, such as breathing,\n");
    }
}

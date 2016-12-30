package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class recepies_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies_but2);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("a.\tNon-veg Wraps- Mix chopped boiled eggs, mayonnaise, olive oil, pepper, salt to taste, coriander in a bowl. Take a roti and put some chopped onions, bell peppers, mint leaves and put enough above mixture and wrap it up and have it directly or shallow fry in a pan with a drop of olive oil. You can also use boiled chicken or lamb or beef pieces instead of egg.\nb.\tVeg Wraps- Follow the above procedure to make veg wraps but here in place of non-veg pieces, use whatever like vegetables or boiled beans.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("Simply boil the vegetables and then toss them in a tablespoon of oil, add a salt to taste, chili powder or pepper to taste, add a handful of coriander or cilantro leaves and have it with chapattis or rice.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("You can also add green leafy vegetables to the boiled vegetables and toss them as above and have it. ");
    }
}

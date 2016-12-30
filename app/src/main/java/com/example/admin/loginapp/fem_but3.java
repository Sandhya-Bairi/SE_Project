package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tfeeling depressed most of the day\n" +
                "•\tloss of interest in most regular activities\n" +
                "•\tsignificant weight loss or gain\n" +
                "•\tsleeping too much or not being able to sleep\n" +
                "•\tslowed thinking or movement\n" +
                "•\tfatigue or low energy most days\n" +
                "•\tfeelings of worthlessness or guilt\n" +
                "•\tloss of concentration or indecisiveness\n" +
                "•\trecurring thoughts of death or suicide\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tEat a healthy diet that includes fish-oil, rich in omega-3 fatty acids, healthy fat such as coconut oil, flaxseed oil, sour cherries, and eggs.\n" +
                "\n" +
                "•\t First thing in the morning, with your breakfast, steep a cup of hot, fresh, green tea. Drink the whole thing.\n" +
                "\n" +
                "•\tFind a quiet place to retreat to where you won’t be interrupted. Turn off your phone, close the door, etc. etc. Regulate your breathing, and attempt to let go of your thoughts. Don’t think too hard about not thinking though-if something pops into your head, acknowledge it, and let it go. This is just one basic start to meditating-there’s tons of different ways you can go about it, and where you choose to take it and how far is up to you.\n" +
                "\n•\tBoil 1 cup of water and pour over 2 teaspoons of dried chamomile (or a chamomile tea bag) and let steep for 5 minutes. If you are using a tea bag, let steep for 15 minutes. Strain, and add a little milk and honey if you like, and drink 30 minutes before bedtime.\n" +
                "\n•\tEat 1 generous cup of pumpkin seeds once a day. \n");

    }
}

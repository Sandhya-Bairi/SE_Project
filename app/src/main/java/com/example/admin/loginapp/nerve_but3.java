package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class nerve_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerve_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tNerve damage and injuries that fail to heal properly.\n" +
                "Back pain, for example, may be caused by a single factor, or any combination of these factors:\n" +
                "•\tYears of poor posture\n" +
                "•\tImproper lifting and carrying of heavy objects\n" +
                "•\tBeing overweight, which puts excess strain on the back and knees\n" +
                "•\tWearing high heels\n" +
                "•\tSleeping on a poor mattress\n" +
                "•\tNo obvious physical cause\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tEssential oils -There are many ways to benefit from essential oils—some people inhale them , others include several drops in their massage oil and enjoy as part of a therapeutic massage. Oils include peppermint oil, rosemary, and lavender.\n" +
                "•\tApplying some form of heat can go a long way in easing your pain. Try a hot water bottle, gel-filled pad heated in the microwave, electric heating pad, or hot bath.\n" +
                "•\tMassage therapy not only helps with relaxation, but can also help diminish the body's perception of pain. A high quality therapeutic massage spurs blood flow, which in turn helps nourish and heal the soft tissues in throughout your body.\n" +
                "•\t Do Meditation \n" +
                "•\tAcupuncture reduces certain types of chronic pain, including back pain. \n");


    }
}

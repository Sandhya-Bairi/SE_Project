package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but12);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Vocal abuse (singing improperly shouting and overuse of the voice)\n" +
                "• Continuous coughing that can irritate the throat\n" +
                "• Allergies or smoking\n" +
                "• Tense muscles\n" +
                "• Too much caffeine and alcohol consumption (they dry out your throat).");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Hoarseness and a rough voice\n" +
                "• Harshness and a scratchy voice\n" +
                "• Breathlessness\n" +
                "• Feeling like there's a lump in your throat\n" +
                "• Neck pain and decreased pitch range\n" +
                "• Voice and body fatigue\n" +
                "• Pain that shoots from ear to ear.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Rest your voice\n" +
                "• Hydrate yourself\n" +
                "• Avoid drinking icy cold fluids\n" +
                "• Gargle with Throat Coat tea and a dash of salt three times daily to hydrate and moisturize the vocal folds.\n");
    }
}

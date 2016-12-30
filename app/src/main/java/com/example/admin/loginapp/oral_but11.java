package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but11);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Throat congestion can be due to a viral or bacterial infection\n" +
                "• a common cold or a sinus infection\n" +
                "• it is also accompanied sometimes by more serious conditions like asthma or pneumonia\n" +
                "• when the lining of the throat becomes inflamed and swollen, which makes breathing, eating and drinking challenging.\n" +
                "• An allergy or a respiratory infection leads to the increase of mucus in the chest, which comes up " +
                "to the throat causing it to be become sore");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Throat pain\n" +
                "• Increase in mucus production\n" +
                "• Inflammation\n" +
                "• swelling\n" +
                "• itchy or scratchy feeling in the throat\n" +
                "• Dry cough\n" +
                "• runny nose and/or ear pain\n" +
                "• Difficulty in swallowing\n" +
                "• Wheezing and dry cough (if asthma is the cause)\n" +
                "• Difficulty in breathing\n" +
                "• Burning sensation in the windpipe\n" +
                "• Coughing up mucus which can be clear, green or yellow in color");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Take a glass of hot water, juice of half a lemon and a teaspoon of honey\n" +
                "• Shower with hot water\n" +
                "• Take ginger tea\n" +
                "• Wrap a towel over your head as well as over the pot. Inhale the steam through your nose for around 30 to 40 seconds, stop and then repeat the procedure again. You can also add eucalyptus oil to the water.\n");
    }
}

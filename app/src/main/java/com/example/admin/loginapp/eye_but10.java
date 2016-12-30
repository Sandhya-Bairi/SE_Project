package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but10);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Infection\n• Eyelash mites or lice\n• Dandruff of eyebrows");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Clumping and stickiness around eyelashes\n• Watery eyes\n• Gritty, burning sensation\n• Loss of eyelashes.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Apply baby shampoo over the inflamed eyelids\n\n" +
                "➣ Apply castor oil to bring down itching, irritation, swelling.\n\n" +
                "➣ Use petroleum jelly or coconut oil\n\n" +
                "➣ Stand under a hot shower to wash away the crust on the lashes.\n\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Don't share make-up");

    }
}

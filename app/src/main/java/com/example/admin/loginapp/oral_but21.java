package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but21);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• infection\n" +
                "• tooth decay and gum diseases.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• pain\n" +
                "• swelling\n" +
                "• jaw stiffness and general illness");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Use a cotton ball to apply some clove oil on the painful wisdom tooth and surrounding gum area.\n" +
                "• Chew 1 or 2 tender guava leaves \n" +
                "• Rub some peppermint oil on the painful area\n" +
                "• Apply an ice pack on the swelled area\n" +
                "• Place a raw onion piece on that  area\n");

    }
}

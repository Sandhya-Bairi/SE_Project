package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but10);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Cuts and scrapes happen when your skin is accidentally broken or worn away.\n" +
                "• This can be the result of a fall, banging against a hard object, or being cut by something sharp.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• discharge or pus coming from the cut or scrape\n" +
                "• Fever\n" +
                "• increased pain\n" +
                "• redness\n" +
                "• swelling or warmth in the affected area");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ First clean the wound and then apply any one below\n" +
                "➣ Heat ghee and turmeric powder and apply it directly on the cut area with a cotton pad.\n" +
                "➣ Apply honey or garlic or aloe-vera or potato.\n" +
                "➣ Drink hot milk mixed with turmeric powder");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but9);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• warm weather\n" +
                "• tight clothing\n" +
                "• poor hygiene\n" +
                "• infrequent undergarment changes\n" +
                "• the use of antibiotics that kill harmless bacteria and fungi\n" +
                "• a weakened immune system as a result of diabetes\n" +
                "• pregnancy, or another medical condition\n" +
                "• incomplete drying of damp or wet skin");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Rashes\n" +
                "• blisters\n" +
                "• infections in the nails\n" +
                "• edges of the nails\n" +
                "• corners of the mouth\n" +
                "• itching and redness.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Take 2-3 crushed garlic cloves daily\n"+
                "➣ Apply garlic paste on the affected area\n" +
                "➣ Apply coconut oil on the affected area.\n" +
                "➣ Take plain yogurt as your regular diet\n" +
                "➣ Use extra virgin olive oil in the foods\n");



    }
}

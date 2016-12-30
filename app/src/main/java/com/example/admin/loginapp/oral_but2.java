package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Biting cheek while eating due to careless chewing\n" +
                "• Wisdom teeth biting cheek due to teeth misalignment\n" +
                "• accidental, anxiety and nervous habits.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• mouth irritation\n• pain\n• redness\n• cuts");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ One of the great cheek biting cure is trying relaxation\n" +
                "➣ Use tea tree oil mouthwash,\n" +
                "➣ Try a dab of vanilla extract,\n" +
                "➣ Rinse your mouth with baking powder dissolved in a cup of water.\n");



    }
}

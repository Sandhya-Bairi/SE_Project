package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Viruses\n• Bacteria\n• Smoke\n• Dirt\n• Shampoos");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Redness in the white of the eye\n• Increased amount of tears\n• White discharge\n• Itching or burning sensation\n• Blurred vision.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Use eye drops.\n\n" +
                "➣ Stop wearing contact lenses.\n\n" +
                "➣ Bathe or shower before bedtime.\n\n" +
                "➣ Add a half tea spoon of salt and a half teaspoon of honey in cup of lukewarm water and put few drops of this mixture in the eyes.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Avoid rubbing your eyes\n• Clean eyeglasses\n• Wash your hands before applying ointment or eye drops.");

    }
}

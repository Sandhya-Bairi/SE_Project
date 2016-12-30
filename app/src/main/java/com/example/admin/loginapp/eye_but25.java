package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but25);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Infection\n• Dryness\n• Blockage\n• Presence of allergy\n• Clogged tear ducts\n• Eyelids turning either inward or outward\n• Foreign bodies");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Burning eyes\n" +
                "• Itchy eyes\n" +
                "• Foreign sensation in eyes\n" +
                "• Decreased visual acuity\n" +
                "• Swollen eyelid\n" +
                "• Sneezing\n" +
                "• Red, bloodshot eyes\n" +
                "• Eye Pain, especially if trauma has occurred\n" +
                "• Discharge\n" +
                "• Crusting around the eyes, which signifies the duct is blocked");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Take a cup of hot tea with lime juice and honey.\n\n" +
                "➣ Keep two spoons in freezer for some time and then place them on your eyes.\n\n" +
                "➣ Mix aleovera and rose milk and put some drops in the eyes \n\n" +
                "➣ You must have a salad with carrots or at least two glasses of carrot juice every week.\n\n" +
                "➣ Wash your eyes with ice cold water to soothe burning eyes providing relief");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Wear sun glasses, goggles or face mask" +
                "• Do not touch or rub your eyes when they become itchy and irritated." +
                "• Avoid coming into contact with people who have viral or bacterial infections." +
                "• Do not share linens, make-up, or eye drops." +
                "• Eat a well-balanced diet throughout your life.");
    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but24);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Injury\n• Advanced diabetes\n• Sagging of vitreous gel that fills the inside of your eye\n• Aging\n• Previous eye surgery.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Blurred vision\n• Flashes of light in one or both eyes\n• Reduced side (peripheral) vision\n• Sudden appearance of many floaters");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Mistletoe \nIt's a very effective anti-hypertensive, useful for reducing intraocular pressure(Infusion of a teaspoonful of dried plant per cup of water.Take this cup twice daily." +
                "\n\n➣ Blueberry \nBecause of its richness in antioxidants, it is ideal for the eye to be able to capture the low light and vision disorders such as glaucoma, retinal detachment etc.(It can be taken in capsules, bought in pharmacies or herbalists' in doses according to the patient's leaflet." +
                "\n\n➣ Blackberries \nBecause of vitamin C, its anti-inflammatory properties and its ability to remove fluids which helps lower blood pressure, eat berries from time to time.");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Perform relaxation exercises , Yoga and massage");
    }
}

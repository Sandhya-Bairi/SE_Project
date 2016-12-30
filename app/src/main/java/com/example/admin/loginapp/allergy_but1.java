package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but1);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tFrequent exposure to the drug\n" +
                "•\tLarge doses of the drug\n" +
                "•\tDrug given by injection rather than pill\n" +
                "•\tFamily tendency to develop allergies and asthma\n" +
                "•\tCertain food allergies such as to eggs, soybeans, or shellfish \n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tA measles-like rash\n•\tHives-Red, itchy, and raised swellings on the skin, which have an irregular shape\n" +
                "•\tPhoto allergy-Sensitivity to sunlight, an itchy and scaly rash that occurs following sun exposure\n" +
                "•\tSteven's Johnson Syndrome-Red, raised and itchy patches on the skin that sometimes look like bull's-eye targets and which may occur together with swelling of the face or tongue\n" +
                "•\tMuscle and joint aches\n" +
                "•\tRapid or irregular heart beat\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tSwelling, redness, and itching may be reduced with the use of ice\n" +
                "•\tUse turmeric powder in your curries.\n" +
                "•\tConsume more content of water\n" +
                "•\tDon’t take drugs with empty stomach.\n");

    }
}

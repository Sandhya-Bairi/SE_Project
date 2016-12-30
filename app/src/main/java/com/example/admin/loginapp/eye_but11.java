package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but11);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• due to rubbing of eyes frequently\n• asthma, being awake for long hours\n• swollen blood vessels, wearing contact lenses\n• cold and flu\n• hormonal changes during pregnancy\n• smoking, lack of sleep\n• swimming in chlorinated water.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Severe pain\n• halos in the vision field\n• blurry vision\n• sensitivity to light");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Splash some cold water on your eyes or soak a towel in water and keep it over your eyes.\n\n" +
                "• Wrap few ice cubes in a cotton cloth and keep them over your eyes for a couple of seconds. \n\n" +
                "• Soak a cotton ball in rose water and then place them over your eye lids for 15 minutes. Repeat this twice a day. Alternatively, dip a cucumber slice in rose water and then place them over your eye lids. The water content in cucumber and cooling effect of rose water efficiently helps get rid eye redness. Instead, put 2-3 drops of rose water in your eyes. It reduces puffiness under eyes.\n\n" +
                "• Place a cucumber in refrigerator for 10-15 minutes and then slice it up. Keep one slice over each eyelid for some time.\n\n" +
                "• Soak a cotton pad in some raw cold milk and then rub it over your eyes for at least 15 minutes, two times a day. This compress prevents redness in eyes.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Wash your hands often\n• Wash the discharge from your eye several times a day\n• Throw away or clean items that had contact with your eye\n• Avoid rubbing your eyes, wear glasses\n• avoid public swimming pools.");
    }
}

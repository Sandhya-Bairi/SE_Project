package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Acne occurs when the pores on your skin become blocked with oil, dead skin, or bacteria.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Papules are small red, raised bumps caused by inflamed or infected hair follicles.\n" +
                "• Pustules are small red pimples that have pus at their tips\n" +
                "• Nodules are solid, often painful lumps beneath the surface of your skin\n" +
                "• Cysts are large lumps found beneath your skin that contain pus and are usually painful.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Apply the mask of 2 tablespoons of honey and 1 tablespoon of cinnamon and leave for 10-15 minutes.\n" +
                "➣ Apply grated papaya to your skin and leave it for 15-20 minutes.\n" +
                "➣ Make a fine paste of dry orange peels and apply it and leave it on your skin for 20-25 minutes.\n" +
                "➣ Apply a mix of strawberry grates and honey and leave it for 20 min.\n" +
                "➣ You can use avocado or potato or garlic or banana or tomato in the place of strawberries.\n");
    }
}

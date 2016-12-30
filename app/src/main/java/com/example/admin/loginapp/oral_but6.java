package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• HIV/AIDS\n" +
                "• cancer\n" +
                "• diabetes mellitus\n" +
                "• vaginal yeast infections\n" +
                "• bad microbes ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• creamy white bumps on the tongue, inner cheeks, gums, or tonsils\n" +
                "• slight bleeding when the bumps are scraped\n" +
                "• pain at the site of the bumps\n" +
                "• dry, cracked skin at the corners of the mouth\n" +
                "• difficulty swallowing");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Practice good oral hygiene\n" +
                "➣ Try warm saltwater rinses\n" +
                "➣ Eat 2-3 cups of yogurt daily for a few weeks. rub some yogurt on your tongue and inside your mouth with your finger. Allow it to sit for 5 to 10 minutes, then rinse your mouth thoroughly with warm water. Do this once or twice a day for a few days.\n" +
                "➣ Mix 1 to 2 teaspoons of baking soda with enough water to form a paste. Use a cotton ball to apply this paste on the tongue and inner cheek area. Wait for a few minutes, then rinse your mouth with warm water. \n" +
                "➣ dissolve ½ teaspoon of baking soda in a glass of water. Use this solution to rinse your mouth twice daily until you get rid of the problem.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Practice good oral hygiene by brushing your teeth.\n" +
                "• You should also floss daily. This is especially important if you have diabetes or wear dentures\n" +
                "• Rinse out your mouth after using a corticosteroid inhaler\n" +
                "• Add yogurt to your diet whenever you take prescribed antibiotics\n" +
                "• promptly treat a vaginal yeast infection, especially if you’re pregnant.");


    }
}

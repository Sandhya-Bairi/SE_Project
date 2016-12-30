package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• due to virus\n" +
                "• vitamin D deficiency\n" +
                "• burning of tongue while eating food in hot conditions\n" +
                "• allergic reactions, strep infections\n" +
                "• tongue cancer\n" +
                "• hypothyroidism\n" +
                "• excessive alcoholism and smoking");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Enlarged, puffy tongue due to excessive swelling\n" +
                "• Difficulty breathing when tongue swelling outgrows to the throat or the air passage\n" +
                "• Discoloration or redness seen sometimes due to inflammation\n" +
                "• Problem while swallowing foods.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Extract the gel from an aloe-vera leaf and apply it directly on the affected area. Repeat a few times daily.\n" +
                "➣ Another option is to rinse your mouth with aloe vera juice 3 or 4 times a day.\n" +
                "➣ Mix equal amounts of 3 percent hydrogen peroxide and warm water. Apply it on the affected area using a clean cotton swab. Leave it on for a few seconds, then rinse your mouth with warm water.\n" +
                "➣ Mix 1 teaspoon of salt in 1 cup of lukewarm water. Stir well and use it as a mouth rinse a 3 or 4 times daily until the sore is healed.\n");

    }
}

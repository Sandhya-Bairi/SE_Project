package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but7);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tDirect contact-The most common cause of latex allergy involves touching latex-containing products, including latex gloves, condoms and balloons.\n" +
                "•\tInhalation-Latex products, especially gloves, shed latex particles, which you can breathe in when they become airborne. The amount of airborne latex from gloves differs greatly depending on the brand of glove used.\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tItchy skin\n" +
                "•\tRunning nose\n" +
                "•\tItchy throat\n" +
                "•\tWatery eye.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tKeeping your body properly hydrated is one of the many natural remedies for allergies. By drinking plenty of fluids, primarily water, you can help your body flush out any mucus, which can help with airborne allergens like dust and pollen, especially during springtime.\n" +
                "•\tNasal Wash-Fill a squeeze bottle with your saltwater solution. Tilt your head forward over a sink. Squeeze the solution up one nostril (don't accidentally swallow it).  Allow the solution to drain out of the other nostril.\n" +
                "•\tEat Some \"Good\" Bacteria-\"Good\" bacteria, also known as probiotics, is one of the amazing health benefits of yogurt. An imbalance of intestinal flora is a common allergic reaction, and the probiotics from yogurt can help remedy this problem.\n");

    }
}

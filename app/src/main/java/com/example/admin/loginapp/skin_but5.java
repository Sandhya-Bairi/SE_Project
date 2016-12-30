package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• It is not contagious.\n" +
                "• Caused due to family history of the condition\n" +
                "• having a viral or bacterial infection\n" +
                "• obesity\n" +
                "• smoking\n" +
                "• uncontrolled stress\n" +
                "• use of certain medications, such as those used to treat bipolar disorder and high blood pressure");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Plaques of red, inflamed skin\n" +
                "• often covered with loose, silver-colored scales\n" +
                "• Disorders of the fingernails and toenails, including discoloration and pitting of the nails.\n" +
                "• The nails may also begin to crumble or detach from the nail bed\n" +
                "• Scaly plaques on the scalp\n" +
                "• Small areas of bleeding where the involved skin is scratched.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Use a humidifier to keep the air in your home or office moist.\n" +
                "➣ Choose products labeled as \"sensitive skin\" – these are made without the dyes and perfumes that can irritate skin \n" +
                "➣ Apply turmeric and ginger paste\n" +
                "➣ Intake fish suppliments\n" +
                "➣ Do massage without any oil\n" +
                "➣ Do yoga\n" +
                "➣ Drink adequate amounts of water\n" +
                "➣ Add dead-sea salts to bath water and soak it for 15 min and then use it for bathing.\n");
    }
}

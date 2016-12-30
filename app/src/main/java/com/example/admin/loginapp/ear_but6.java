package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ear_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• a feeling of fullness in your ear\n" +
                "• an earache\n" +
                "• ringing\n" +
                "• buzzing, or other odd noises in your ear\n" +
                "• decreased hearing, discharge from the ear canal");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("\n•\tMix 1 teaspoon of salt in around ½ cup of warm water until it dissolves completely. Now, soak a cotton ball in the solution and squeeze few drops of it into the ear by slightly tilting your head upwards. Be in this position for some time so that the salty water properly gets inside the ear. Now, tilt your head in the opposite direction in order to drain out the solution from the ear.\n" +
                "\n•\tMix equal parts of hydrogen peroxide and water. Make sure that the hydrogen peroxide is not above 3%; otherwise, it may be harmful. Pour a few drops of it into the ear by tilting your head sideways. Let it settle down in the ear for some time. Now, tilt your head towards the opposite side and let the extra solution drain out.\n" +
                "\n•\tSoften the ear wax by putting a few drops of baby oil or mineral oil with the help of a dropper. Let the oil settle in for some time by placing a cotton ball at the ear opening. This prevents oil from oozing out before reaching the ear wax. Take out the cotton ball after some time in order to drain out the extra oil from the ear. Oil helps to soften the impacted ear wax while facilitating the removal of ear wax.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("\n•\tIn order to prevent blockage of ear wax, try keeping it moist by frequently running water into your ear while taking a bath. This will prevent the ear wax from getting dried up so that it doesn’t get blocked in the ear canal. Make sure, you drain the water from the ear after running it for some time.\n" +
                "\n•\tAvoid consumption of dairy products.\n" +
                "\n•\tDon’t use candle ear wax remover. Ear candles are another method to remove ear wax, but it can be really dangerous as you need to hold the lighted candle very close to your ear. It can even burn your ear.\n" +
                "\n•\tDon’t use any type of acidic liquid in order to soften the ear wax.\n");

    }
}

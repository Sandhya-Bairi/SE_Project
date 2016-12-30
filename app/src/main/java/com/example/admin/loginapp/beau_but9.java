package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class beau_but9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beau_but9);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tLemon, a citric fruit, acts as a natural bleaching agent. Applying lemon juice on the dark spots and affected areas is one of the best home remedies for treating dark spots on the face.\n" +
                "\n•\tVitamin E oil in its natural form has antioxidants, which helps to even out the skin tone and reduces dark spots\n" +
                "\n•\tTake out the juice of onion and garlic. Mix these two well together. Now apply the juice on the dark spots on your face. Leave this on for about 15 minutes. Wash it off thoroughly until the smell goes.\n" +
                "\n•\tTake a tomato or potato straight from the refrigerator. Now rub this cut portion on the dark spots on your face.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tUse the aloe vera gel directly from the plant\n" +
                "\n•\tMix orange peel powder with some curd, a few drops of lemon juice, and apply to the face and your skin gets refreshed\n" +
                "\n•\tDirectly apply cold raw milk, sour milk or buttermilk (lassi) with a cotton pad. Leave it for 10-15 minutes," +
                " and then wash off your face with cold or warm water.\n");
    }
}

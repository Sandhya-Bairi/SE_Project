package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class arth_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arth_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Applying a paste of limestone and honey on the affected joints externally provides relief.\n\n" +
                "• Mash some mustard in warm and apply the solution on thee joints.This must be done repeatedly to get results.\n\n" +
                "• Put 2 teaspoons of cumin into a glass of water.Bring this to a boil.When the water is still hot, soak a towel in it and forment the affeced region with this towel. This will provide relief" +
                " from the pain within a few hours.\n\n" +
                "• Asafetida mixed with egg yolk can be applied on the affected joints to seek immediate relief." +
                "• Mix some cardomom in milk.Put a pinch of turmeric in this milk. This is to be drunk every night while going to sleep.This makes the person sleep peacefully in the morning.\n\n" +
                "• Prepare a pancake form wheat flour.Roast it on one side, but leave it uncooked on the other. Then put some heated mustard oil on the uncooked side. When it is hot, tie it" +
                " like a tourniquet on the affected joint, or provide fomentation with it. This provides quick relief.");
    }
}

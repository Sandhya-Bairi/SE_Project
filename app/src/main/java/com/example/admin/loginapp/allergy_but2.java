package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but2);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tOne piece of dust can contain pet dander, pieces of dead cockroaches, and mold spores, along with dead skin.\n" +
                "•\tCockroach waste, saliva, and body parts are a problem in some homes\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tRed, itchy and watery eyes \n" +
                "•\tRunny and stuffy nose with Sneezing\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tPeppermint tea is an excellent home remedy for dust allergy helping those suffering from an allergic attack. To make peppermint tea, place handful of dried peppermint leaves in a glass filled two thirds to the brim with water. Bring the water to boil with the leaves in it. Allow the mixture to steep for about ten minutes, strain, cool and drink the tea.\n•\tMake a nasal wash at home with a saline solution. Mix a teaspoon of salt in a glass of warm water and add a pinch of baking soda. Sniff a bit of the solution into one nostril at a time and allow the wash to drain back through your mouth or nose. Repeat by sniffing the wash through the other nostril. Doing this about four or five times helps to reduce nasal irritation and gives you relief from dust allergy.\n" +
                "•\tWash your eyes and nostrils immediately to ease the sneezing and inflammation. Take cup water in your folded palm and blink rapidly about three or four times to wash your eyes. Use the same technique to clean your nostrils of irritants.\n•\tPut airtight, plastic dust-mite covers on pillows, mattresses, and box spring. Use pillows filled with polyester fibers instead of kapok or feathers. Wash bedding in very hot water once a week ");
    }
}

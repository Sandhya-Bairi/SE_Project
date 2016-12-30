package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but3);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\uF0A7\tOutdoor allergens, such as pollens from grass, trees and weeds\n" +
                "\uF0A7\tIndoor allergens, such as pet dander, dust mites and mold\n" +
                "\uF0A7\tIrritants, such as cigarette smoke, perfume and diesel exhaust\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tItching \n" +
                "•\tRedness and  burning \n" +
                "•\tClear, watery discharge.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tCold compress-Put used chamomile tea bags in the refrigerator for half an hour. Place the chilled tea bags over eyes for at least 10 minutes.\n" +
                "•\tCucumber-Thoroughly wash a cucumber and cut it into thin slices. Refrigerate the slices for 15 to 20 minutes, and then put them over your eyes for at least 10 minutes.\n" +
                "•\tCold milk-Dab a cotton ball in cold milk and rub it around the eyes. You can also place a cotton ball soaked in milk on the eyes as a compress for an instant cooling effect. Do this twice a day, once in the morning and once in the evening.\n" +
                "•\tWater and salt-Make a natural eye wash by mixing a cup of distilled water with one teaspoon of salt. Boil the solution until the salt dissolves completely. Allow the solution to cool and then use it to flush the eyes. Repeat several times a day for two to three days.\n");
    }
}

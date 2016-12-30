package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but9);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tInfections\n" +
                "•\tInflammatory diseases such as sarcoidosis and rheumatoid arthritis\n" +
                "•\tTrauma, such as an injury during contact sports\n" +
                "•\tCancer that has spread (metastasized) to the spleen\n" +
                "•\tA cyst, a noncancerous fluid-filled sac\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tBeing unable to eat a large meal.\n" +
                "•\tFeeling discomfort, fullness, or pain on the upper left side of the abdomen; this pain may spread to your left shoulder.\n" +
                "•\tJaundice\n" +
                "•\tEasy bleeding\n" +
                "•\tAnemia\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tSoak raw Papaya in apple cider vinegar overnight. Next morning slice it and sprinkle 6 grams salt over it and eat it. Best tip to shrink spleen size naturally.\n" +
                "\n" +
                "\n•\tDaily get fresh 5-6 drops of oak tree milk and take with one cup dandelion tea early in the morning. Within 2-3 weeks enlarged spleen problem will be solved naturally and effectively because these are the most helpful herbs for spleen health.\n" +
                "\n•\tBoil 25 grams Grapes leaves in 2 large cups of water until it will evaporate into 1 cup. Then mix 25 grams fresh grapes juice a drink it. Best tip to resolve spleen stone and swelling.\n" +
                "\n•\tDaily drinking 1 or 2 glass of Fresh Apple juice best to keep the lymphatic system clean and reduces the enlarged spleen size naturally.\n");
    }
}

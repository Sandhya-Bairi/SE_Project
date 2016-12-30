package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tAlcohol abuse is the biggest cause of liver cirrhosis and occurs over a period of time.\n" +
                "•\tThe condition may also occur as a result of damage sustained over time from a hepatitis B or C infection.\n" +
                "•\tThe accumulation of fat in the liver or nonalcoholic fatty liver disease.\n" +
                "•\tSchistosomiasis, a parasitic infection that is more common in developing countries.\n" +
                "•\tGlycogen storage disorder or problems with the storage and supply of energy.\n" +
                "•\tExcessive buildup of copper in the liver, as in Wilson’s disease.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tExhaustion, fatigue and a constant feeling of weakness.\n" +
                "•\tNausea and appetite loss, which eventually leads to weight loss.\n" +
                "•\tFever, vomiting and diarrhea may also be noticed.\n" +
                "•\tThe enlargement of the liver can cause abdominal pain. This may also occur because of swelling and bloating as a result of fluid retention.\n ");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tQuit drinking alcohol\n" +
                "\n•\tGrind some fresh papaya seeds to extract 1 tablespoon of juice. Add 10 drops of lemon juice. Drink it once or twice daily for 1 month.\n" +
                "\n•\tExtract the juice from the leaves of eclipta. Mix together 1 teaspoon each of this juice and raw honey. Consume this mixture 3 times a day for about a month.\n");

    }
}

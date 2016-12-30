package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but11);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Urinary tract infections typically occur when bacteria enter the urinary " +
                "tract through the urethra and begin to multiply in the bladder.\n• Although the " +
                "urinary system is designed to keep out such microscopic invaders, these defenses sometimes fail.\n• When" +
                " that happens, bacteria may take hold and grow into a full-blown infection in the urinary tract.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\t cloudy or bloody urine\n" +
                "•\turinating more often than usual\n" +
                "•\tfoul-smelling urine\n" +
                "•\tpain or burning when urinating\n" +
                "•\ta frequent sensation of having to urinate, which is called urgency\n" +
                "•\tcramping or pressure in the lower abdomen or lower back\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tDrink like a fish stranded in the desert at the first hint of an infection. Get your 8 glasses, and then some more. Keep clearing out your urinary tract and you may be able to bounce back rather quickly-or at least be comfortable!\n" +
                "\n•\tStir the baking soda into the water until it dissolves, and then drink the whole glass. Do this first thing in the morning. Don’t do this for more than a week, or if you are trying to avoid salt, since baking soda is high in sodium.\n" +
                "\n•\tBring water to a boil and add the parsley if you are using fresh-which is preferable in my opinion. Reduce the heat so it simmers steadily and let the leaves infuse the water like this for 6-10 minutes. Strain the leaves out and drink the water hot. If it’s a hot summer day, pop it in the fridge for refreshing parsley “iced tea.” If you use dried parsley, simply place it in a cup of boiling water, cover, and steep for 8 minutes before straining and drinking.\n" +
                "\n•\tRinse and slice a cucumber-enjoy!\n");
    }
}

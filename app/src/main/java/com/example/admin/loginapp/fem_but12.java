package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but12);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• •\tantibiotics (they lower the amount of lactobacillus, or good bacteria, in the vagina)\n" +
                "•\tpregnancy\n" +
                "•\tuncontrolled diabetes\n" +
                "•\tweak immune system\n" +
                "•\tpoor eating habits, including a lot of sugary foods\n" +
                "•\thormonal imbalance near your menstrual cycle\n" +
                "•\tstress\n" +
                "•\tlack of sleep\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• •\titching\n" +
                "•\tburning\n" +
                "•\tlarge or small amounts of vaginal discharge, often whitish gray and thick (although there are also times the discharge can be watery)\n" +
                "•\tpain during sex\n" +
                "•\tsoreness\n" +
                "•\trash \n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tTake 2 tbsps. Of apple cider vinegar and mix it with warm water. Wash your vagina with this water twice a day for 2-3 days.\n" +
                "\n•\tFor stopping intense itch at night, apply ice cubes directly or a cold compress in the vagina.\n" +
                "\n•\tWash your vagina with concentrated salt water whenever you feel the itch.\n" +
                "\n•\tChew 2-3 cloves of garlic down your throat. Make garlic into a paste and apply inside the vagina by tying it in a cheesecloth. The small could be depressing, but the relief could come as a surprise. Take basil leaves in two cups of water. Steep for 20 minutes covered till the water becomes strong. Drink this water twice a day for removing the bacteria causing vaginal itching.\n");


        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tavoid wearing tight pants, pantyhose, tights, or leggings\n" +
                "•\tavoid using feminine deodorant or deodorant tampons/pads\n" +
                "•\tdo not sit around in wet clothing, especially bathing suits\n" +
                "•\teat a well-balanced diet\n" +
                "•\teat yogurt or take supplements with lactobacillus\n" +
                "•\twear natural fibers such as cotton, linen, or silk\n" +
                "•\tavoid sitting in hot tubs or taking frequent hot tub baths\n" +
                "•\twash underwear in hot water\n" +
                "•\tavoid douching\n" +
                "•\tchange feminine products frequently\n");

    }
}

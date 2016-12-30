package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tswallowing air\n" +
                "•\tconstipation\n" +
                "•\theartburn\n" +
                "•\tirritable bowel syndrome\n" +
                "•\tintolerance to dairy products or other food items\n" +
                "•\teating too fast\n" +
                "•\tweight gain\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tabdominal pain\n" +
                "•\tblood in the stools or dark, tarry looking stools\n" +
                "•\thigh fevers\n" +
                "•\tdiarrhea\n" +
                "•\tworsening heartburn\n" +
                "•\tvomiting\n" +
                "•\tunexplained weight loss\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tLet the peppermint tea bag sit in the water for several minutes, then pull the bag and drink the liquid. \n"
                +
                "\n•\tSlice ginger root into 4-6 thin quarter sized pieces and place them in a large mug. Add a touch of honey or lemon if you like, and then pour very hot water over the slices. Don’t let it boil-turn off the kettle just before or immediately afterwards. Cover and steep for 10 minutes before enjoying. Drink a cup before or after a meal to help with digestion.\n" +
                "\n•\tEat approximately 1 cup of pumpkin with your meal to ward off gas. You can have it baked, steamed, or broiled, or whip up a recipe all your own.\n");
    }
}

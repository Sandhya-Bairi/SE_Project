package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class bp_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp_but1);

        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• obesity\n" +
                "• genetic factors\n" +
                "• excessive drinking\n" +
                "• high salt intake\n" +
                "• lack of aerobic exercise\n" +
                "• stress\n" +
                "• birth control pills\n" +
                "• pain relievers\n" +
                "• kidney disease\n" +
                "• adrenal disease.");

        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Severe headaches\n" +
                "• Severe anxiety\n" +
                "• Shortness of breath\n" +
                "• Nosebleeds");

        TextView txtDetails3 = (TextView)findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tCut the salt\n" +
                "•\tBring water to a boil and add the hibiscus and cinnamon sticks (if using them) and allow it to steep for 5 minutes. Add honey or lemon to taste, and drink 2-3 times daily.\n" +
                "•\tDrink 8 ounces of coconut water 1-2 times daily.\n" +
                "•\tTry and get in at 30 minutes of exercise a day. You don’t have to run marathon-even simple chores like scrubbing the floors are good. Anything that gets your heart rate up and increases your rate of respiration. Make this a habit. \n" +
                "•\tEat one or two bananas daily\n" +
                "•\tGrind equal quantities of dried watermelon seeds and poppy seeds (khus khus). Take one teaspoon of this mixture in the morning on an empty stomach and again in the evening.\n");


        TextView txtDetails4 = (TextView)findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("\t\t\t High blood pressure may be prevented by living a healthy lifestyle, including some of the following:\n" +
                "•\teating a nutritious, low-fat diet;\n" +
                "•\texercising regularly;\n" +
                "•\tdecreasing salt (sodium) intake, read food labels so you know the salt content before you buy a product in the grocery store or eating a meal at a fast food restaurant, and avoid adding salt to foods;\n" +
                "•\tmaintain a healthy weight and if you are overweight or obese, try to lose weight;\n" +
                "•\tdrink alcohol in moderation;\n" +
                "•\tstop smoking;\n" +
                "•\tget routine health assessments and blood pressure screening;\n" +
                "•\ttaking your blood pressure medications as directed, even if you're feeling fine;\n" +
                "•\treduce stress and practice relaxation techniques.\n");
    }
}

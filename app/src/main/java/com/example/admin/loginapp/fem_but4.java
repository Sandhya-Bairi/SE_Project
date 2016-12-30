package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tAdrenal exhaustion\n" +
                "•\tConsumption of alcohol in excess\n" +
                "•\tConditions like Turner’s syndrome\n" +
                "•\tEating disorders\n" +
                "•\texposure to chemicals\n" +
                "•\tUncontrolled use of painkillers\n" +
                "•\tFollowing poor nutritious diet\n" +
                "•\tproblems of the glands\n" +
                "•\tinconsistent sleeping patterns\n" +
                "•\tovulation disorders\n" +
                "•\tobesity\n" +
                "•\tlack of exercise\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• •\tWeight gain\n" +
                "•\tLow libido\n" +
                "•\tFatigue \n" +
                "•\tDepression\n" +
                "•\tIncrease in facial hair, hot flashes, high blood pressure\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tIncrease consumption of fresh and organic fruits. Whole grains and veggies should be consumed more. Such food should be free of herbicides and pesticides\n" +
                "\n•\tMutton, veal, pork and beef meat should be reduced in consumption. Lean meat should be consumed instead. Dairy products like full fat milk, cream and cheese should be avoided\n" +
                "\n•\tDrink at least eight glasses of water every day. Reduce intake of sugary drinks and increase intake of water.\n" +
                "\n•\tIt is essential to have a hearty and healthy breakfast. One should break down the intervals between meals. Five to six small meals should be consumed through the day.\n" +
                "\n•\tOne needs to ensure that they get at least eight hours of sleep. That will lead to:                i)  Restoration of the hormonal cycles, ii)  Allow the system to function normally\n" +
                "\n•\tOne should take up stress reduction methods like Yoga, Meditation, Deep breathing, Swimming or nature treks. \n");
    }
}

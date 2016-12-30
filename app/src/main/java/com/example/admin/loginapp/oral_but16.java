package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but16);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• viruses, with only 15-30% of cases being caused by bacteria such as common cold\n" +
                "• bacterial infection such as strep throat.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• a very sore throat\n" +
                "• difficulty swallowing or painful swallowing\n" +
                "• a scratchy-sounding voice\n" +
                "• bad breath\n" +
                "• fever\n" +
                "• chills\n" +
                "• earaches\n" +
                "• stomach aches\n" +
                "• headaches\n" +
                "• a stiff nec\n• jaw and neck tenderness (due to swollen lymph nodes)\n• tonsils that appear red and swollen\n• tonsils that have white or yellow spots");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Drink warm beverages, such as hot tea, broth or warm water to ease discomfort and reduce swelling. Do not consume hot beverages as this could create additional throat pain.\n" +
                "• Rest as much as possible and avoid activities that irritate the throat, such as yelling or smoking.\n" +
                "• In a glass of lukewarm water, add the juice from one lemon, a pinch of salt and one teaspoon of honey. Drink it slowly, twice daily for a few days.\n" +
                "• Add 10 to 12 basil leaves to one and one-half cups of water. Boil for 10 minutes. Strain and add the juice from one lemon to the solution. Optionally, add one teaspoon of honey to sweeten it. Drink this three times a day for two to three days.\n" +
                "• Add one teaspoon of cinnamon powder to a glass of hot water. Mix in two teaspoons of honey. Sip on it slowly while it is still warm. Drink this two or three times a day for one week.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• To decrease your odds of getting tonsillitis\n" +
                "• stay away from people who have active infections.\n" +
                "• Wash your hands often, especially after coming into contact with someone who has a sore throat, is coughing, or is sneezing.");


    }
}

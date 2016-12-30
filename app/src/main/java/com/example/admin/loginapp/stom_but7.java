package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but7);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\t\t The bacteria are believed to cause stomach problems when they penetrate the" +
                " stomach’s mucous lining and generate substances that neutralize stomach acids. \n" +
                "This makes the stomach cells more vulnerable to the harsh acids. Stomach acid and " +
                " H. pylori together irritate the stomach lining and may cause sores or peptic ulcers in your stomach or duodenum," +
                " which is the first part of your small intestine.\n" +
                "Some other causes include:\n" +
                "•\tsmoking\n" +
                "•\tfrequent use of steroids (such as those for treating asthma)\n" +
                "•\thypercalcemia (overproduction of calcium)\n" +
                "•\tfamily history of stomach ulcers\n" +
                "•\tbeing over 50 years old\n" +
                "•\texcessive consumption of alcohol\n ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tdull pain in the stomach\n" +
                "•\tweight loss\n" +
                "•\tnot wanting to eat because of pain\n" +
                "•\tnausea or vomiting\n" +
                "•\tbloating\n" +
                "•\tburping or acid reflux\n" +
                "•\theartburn (burning sensation in the chest)\n" +
                "•\tpain improves when you eat, drink, or take antacids\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tBoil one teaspoon of freshly chopped ginger in 1.5 cups of hot water. Cover and allow it to steep for about 10 minutes. Strain and sip this tea slowly. Drink it a few times a day until you feel better.\n" +
                "\n•\tAdd one teaspoon of dried peppermint leaves to one cup of boiling water. Allow it to steep for 10 minutes, strain and cool. Drink this herbal tea four or five times daily between meals for two to three days.\n" +
                "\n•\tMix one to two teaspoons of fresh lemon juice in a glass of water. Drink it 30 minutes before meals. Follow this remedy until you recover completely.");
    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tSwallowed eggs first hatch in the intestine.\n" +
                "•\tThe larvae then move through your bloodstream to your lungs.\n" +
                "•\tAfter maturing, the roundworms leave your lungs and travel to your throat.\n" +
                "•\tYou’ll either cough up or swallow the roundworms in your throat. The worms that are swallowed will travel back to your intestine.\n" +
                "•\tOnce they’re back in your intestine, the worms will mate and lay more eggs.\n" +
                "•\tThe cycle continues. Some eggs are excreted through your feces. Other eggs hatch and return to the lungs.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tnausea\n" +
                "•\tvomiting\n" +
                "•\tirregular stools\n" +
                "•\tvisible worms in the stool\n" +
                "•\tstomach or abdominal pain\n" +
                "•\tweight loss\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tEat one tablespoon of crushed coconut with your breakfast. After three hours, drink one glass of warm milk with two tablespoons of castor oil mixed in it. Repeat this process daily until the infestation disappears. Castor oil, though, is not recommended for individuals suffering from gastrointestinal disease and children below five years of age.\n" +
                "\n" +
                "•\tMix one tablespoon each of fresh raw papaya juice and honey with three or four tablespoons of hot water. Drink it in the morning on an empty stomach. After two hours, follow it with a glass of warm milk with two tablespoons of castor oil mixed in it. Follow the treatment for two to three days. When using this remedy for children, reduce the dosage to half.\n" +
                "\n•\tEat a small piece or about one tablespoon of jaggery in the morning on an empty stomach. Wait for 15 to 20 minutes. Then eat one-quarter to one-half teaspoon of crushed carom seeds along with a glass of water. Do this once daily for two weeks for complete treatment of intestinal worms. \n");

    }
}

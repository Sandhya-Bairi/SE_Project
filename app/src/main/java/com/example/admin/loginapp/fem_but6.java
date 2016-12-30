package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tStress \n" +
                "•\tDiet\n" +
                "•\tBirth control pills\n" +
                "•\tPolycystic ovary syndrome (PCOS)\n" +
                "•\tMenopause\n" +
                "•\tThyroid disorders\n" +
                "•\tAnemia\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tEating unripe and green papaya can help you normalize irregular periods because it works as a good and strong emmenagogue and helps in proper contraction of muscles fibbers of your uterus. Avoid consuming the same when having your periods. \n" +
                "\n•\tTake the roots of a banyan tree. Make sure they are fresh. Boil it in a cup of water for about 10 minutes. Add 2-3 tbsps. of cow’s milk to this decoction and have it at bedtime daily. This potion can also help you regularize your menstrual cycle to a great extent.\n" +
                "\n•\tFennel seeds or saunf can also help you regulate your monthly periods. In order to have them, you need to mix 2 tbsps. of fennel seeds in 1 glass water and let it stay overnight. Strain the water using a muslin cloth or strainer and drink it. Make sure to have this potion daily for positive results.\n" +
                "\n" +
                "•\tYou can also have bitter gourd juice. Although bitter in taste, it is supposed to be one of the effective treatments for irregular periods. You can have in in either forms – juice or decoction. When taking the former type, have it twice daily and if you prefer the latter form, you can have it once or twice daily, as per your wish or requirements.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tIf you're facing persistent irregularity in your periods, get yourself checked by a Gynecologist and rule out occurrence of symptoms like PCOS, thyroid disorders, Anemia etc. Do take necessary and correct treatment if you get diagnosed by any of these disorders.\n" +
                "\n•\tEat a balanced and nutritious diet. Iron rich foods like green leafy vegetables, dairy products, lean meat, eggs, almonds, lentils, cereals, pulses and citrus fruits and vegetables should be consumed.\n" +
                "\n•\tIf you're suffering from stress related to your studies, work or relationship, try to relax, unwind and de-stress. Cut yourself some slack once in a while!\n");

    }
}

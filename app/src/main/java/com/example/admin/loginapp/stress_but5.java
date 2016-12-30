package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stress_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_but5);

        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\t Peppermint-Mix 3 drops of oil in one tablespoon of almond oil, or just add a little water and massage the temples or the back of your neck with it.\n" +
                "•\tLavender Oil:\n\t\t 1.Simply smelling the soothing scent of lavender essential oil helps, so you can just put a few drops on a tissue and inhale it.\n" +
                "\t\t2.You can also add 2 drops of lavender oil to two cups of boiling water and inhale the steam.\n" +
                "\t\t3.Another option is to mix two or three drops in one tablespoon of almond oil or olive oil and massage your forehead with it.\n");

        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tMove your chin upwards and downwards, left and right, and bend your neck sideways towards each shoulder\n" +
                "•\tApplying an ice pack to the back of your neck can give relief from a migraine. \n" +
                "•\tSoaking your feet in hot water also helps get rid of a headache. For a severe headache, add a bit of hot mustard powder to the water\n" +
                "•\tExercise and meditate regularly to prevent headache. Eat lots of fruits and green leafy vegetables\n" +
                "•\tGrind some Cinnamon sticks into a powder, and add some water to make a thick paste. Apply it on your forehead and temples and lie down for 30 minutes. Then wash it off with lukewarm water.\n");



    }
}

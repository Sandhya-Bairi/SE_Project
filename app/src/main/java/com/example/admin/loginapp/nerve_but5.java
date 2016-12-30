package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class nerve_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerve_but5);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tFear or other emotional trauma\n" +
                "•\tsevere pain\n" +
                "•\ta sudden drop in blood pressure\n" +
                "•\tlow blood sugar due to diabetes or from going too long without eating\n" +
                "•\thyperventilation (rapid, shallow breathing)\n" +
                "•\tdehydration\n" +
                "•\tstanding in one position for too long\n" +
                "•\tstanding up too quickly\n" +
                "•\tphysical exertion in hot temperatures\n" +
                "•\tcoughing too hard\n" +
                "•\tstraining during a bowel movement\n" +
                "•\tseizures\n" +
                "•\tconsuming drugs or alcohol\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tUse one part of pippali, one part of black pepper and one part of ginger and grind them all in a blender and then apply on the nostrils in small amounts");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tComfort the person who has fainted by making him/her lie down on flat surface, with face up and legs rose a little higher than head. This ensures higher oxygen supply to the brain. Additionally, loosen the clothes to allow maximum air flow to the fainted person and clear up the respiratory hindrances\n•\tPut three drops of oil on a handkerchief and keep it close to the nose of the fainted person. Instantly, it will revive back the individual from the fainting spell\n" +
                "•\tStrong pungent smell of onion activates nerves of brain and helps the fainted person  to regain consciousness.\n" +
                "•\tBasil tea is very useful for people suffering from repeated fainting spells. Prepare tea with use of 3 tablespoon of fresh basil and 8 oz of water and let it boil for 15-20 minutes.\n" +
                "•\tConsume something rich in fibre like oat meal or cereal bar.\n" +
                "•\tDrink sufficient quantity of water\n" +
                "•\tTake 2 tbsp of honey and 2 tbsp of apple cider vinegar in 8 oz of water to prevent fainting spells\n");

    }
}

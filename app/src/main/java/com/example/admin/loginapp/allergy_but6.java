package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but6);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tSwelling of the face, throat or tongue\n" +
                "•\tDifficulty breathing\n" +
                "•\tDizziness\n" +
                "•\tStomach cramps\n" +
                "•\tNausea or diarrhea\n" +
                "•\tItchiness and hives over large areas of the body\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tIce. Apply ice for 20 minutes. Ice will numb the pain and slow blood flow to the area, which reduces swelling.\n•\tVinegar - Wasp and hornet venom are powerful alkalines. Use an acid such as vinegar to neutralize them. It can be applied via a piece of cloth or bandaging. Make sure to keep the stings soaked for at least 15 minutes. Some vinegar will absorb through the skin, and it should greatly help eliminate the discomfort.\n" +
                "•\tBaking Soda - In the case of bee stings, baking soda will help to neutralize the acidic venom. Make a paste by combining baking soda with water. Leave this paste on the sting site for at least 15 minutes. Some of the dissolved baking soda will leach through the skin to neutralize the venom somewhat. After applying it, and cleaning the sting area of residue; a chamomile tincture may be repeatedly applied for any residual itching or swelling.\n•\tCrushed garlic. Crush one or two garlic cloves to release the juices and press it against the wound. Cover with a moist rag or towel and let it sit for 20 to 30 minutes.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("\uF0A7\tDon’t walk barefoot in the grass, where stinging insects forage.\n" +
                "\uF0A7\tDon’t drink from open soft drink cans; stinging insects are attracted to them and may crawl inside.\n" +
                "\uF0A7\tKeep food covered when eating outdoors.\n" +
                "\uF0A7\tDon’t use sweet-smelling perfume, hairspray or deodorant.\n" +
                "\uF0A7\tAvoid wearing brightly colored clothing with flowery patterns.\n" +
                "\uF0A7\tWear long pants, long-sleeved shirts, socks, shoes and work gloves when working outdoors.\n" +
                "\uF0A7\tBe cautious near bushes, eaves and attics, and avoid garbage containers and picnic areas.\n" +
                "\uF0A7\tHave a professional exterminator remove known nests and inspect for other potential nesting areas.\n");
    }
}

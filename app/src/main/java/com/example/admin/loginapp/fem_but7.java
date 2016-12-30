package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but7);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tfailure of the abdominal wall to close properly in the womb, which is a congenital defect\n" +
                "•\tage\n" +
                "•\tchronic coughing\n" +
                "•\tdamage from injury or surgery\n" +
                "•\tbeing pregnant, which puts pressure on your abdomen)\n" +
                "•\tbeing constipated, which causes you to strain when having a bowel movement\n" +
                "•\theavy weight lifting\n" +
                "•\tfluid in the abdomen, or ascites\n" +
                "•\tsuddenly gaining weight\n" +
                "•\tpersistent coughing or sneezing\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tpain or discomfort in the affected area (usually the lower abdomen)," +
                " especially when bending over, coughing, or lifting\n" +
                "•\tweakness, pressure, or a feeling of heaviness in the abdomen\n" +
                "•\ta burning, gurgling, or aching sensation at the site of the bulge\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tPour boiling water over a teabag and cover your mug, letting it steep for 10 minutes. If using dried chamomile, place 1-2 teaspoons in a mug and cover with boiling water. Cover the mug and let steep for 15-20 minutes. Sip slowly.\n" +
                "\n•\tFind a place to lie down, and rest the hot pack on your belly. It should be a comfortable temperature, but definitely warm. Do this for at least 15 minutes, or as long as you need to, reheating as necessary.\n" +
                "\n•\tCook your rice with twice the amount of water you normally would for your chosen amount. In this case I am using plain old long-grain white rice. Put your rice in a pot on the stove and add the water, cooking over medium-low heat. As the rice starts to become tender, remove it from the heat and let it soak for 3 minutes with the lid on the pan. Drain and drink the water warm, adding a smidge of honey if needed. Save the rice for a bland meal later.\n" +
                "\n•\tCover the peppermint with 1 cup of boiling water, cover, and let steep for 5-10 minutes. Sip slowly while it’s still toasty warm. If using the fresh peppermint leaves, you can chew on them as well to ease stomach pains. You can also just use a pre-made teabag if you find that more desirable.\n" +
                "");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tthe long-term use of certain medications, such as aspirin and ibuprofen\n" +
                "•\texcessive alcohol consumption\n" +
                "•\tthe presence of Helicobacter pylori bacteria, which causes stomach ulcers\n" +
                "•\tcertain illnesses, such as kidney failure\n" +
                "•\ta viral infection in a weakened immune system\n" +
                "•\tpersistent, intense stress\n" +
                "•\tbile flowing into the stomach, or bile reflux\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tVoluntary or involuntary passing of gas, either as belches or as flatus.\n" +
                "•\tSharp, jabbing pains or cramps in your abdomen. These pains may occur anywhere in your abdomen and can change locations quickly and get better quickly.\n" +
                "•\tA 'knotted' feeling in your abdomen.\n" +
                "•\tSwelling and tightness in your abdomen\n" +
                "•\tProlonged abdominal pain\n" +
                "•\tBloody stools\n" +
                "•\tA change in stool color or frequency\n" +
                "•\tWeight loss\n" +
                "•\tChest pain\n" +
                "•\tPersistent or recurrent nausea or vomiting\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tAdd one-half teaspoon of cinnamon powder to a cup of warm milk. Stir it well and then drink it. You can also add some honey.\n" +
                "\n•\tAdd two teaspoons of apple cider vinegar to a glass of warm water. Allow the water to cool to room temperature, and then drink it.\n" +
                "\n•\tTake equal parts of ground ginger, fennel, and cardamom. Mix them thoroughly. Now, take a cup of water. Add one teaspoon of this mixture and a pinch of asafetida (hing) in it. Drink this once or twice a day.\n" +
                "\n" +
                "•\tMix one teaspoon each of carom seeds (ajwain) and black salt in a cup of buttermilk. If you do not have carom seeds, use celery seeds. Drink this solution\n");
    }
}

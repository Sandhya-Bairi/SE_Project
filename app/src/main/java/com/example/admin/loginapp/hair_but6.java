package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• mild irritation\n" +
                "• a nettle rash\n" +
                "• itchy skin or a raised\n" +
                "• red skin rash\n" +
                "• swollen eyes\n" +
                "• lips, hands and feet\n" +
                "• the eyelids can swell so much that the eyes close\n" +
                "• feeling lightheaded or faint\n• swelling of the mouth\n• throat or tongue, " +
                "which can cause breathing and swallowing difficulties\n" +
                "• wheezing\n" +
                "• tummy pain\n" +
                "• nausea and vomiting\n" +
                "• collapsing and becoming unconscious");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tApply yogurt mixed with lemon juice to relieve scalp\n" +
                "•\tA paste of baking soda and water is also good to help with allergies caused due to hair dye. The paste can be soaked on the scalp for about 10 to 15 minutes and then rinsed well with water.\n" +
                "•\tAloe Vera gel works its magic to relieve itchiness and inflammation caused by an allergy to hair dye. This is good to bring relief from dryness and itching. Apply aloe vera gel onto the scalp using your fingers and spread evenly. Use a mild shampoo to wash it off after it is allowed to sit on the scalp for 10 to 15 minutes.\n" +
                "\n" +
                "•\tSesame seed oil works well to treat scalp itchiness and inflammation due to hair dye allergy. This oil provides relief from itchiness and discomfort. The oil may be warmed a little before applying to the scalp. \n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•  make sure you\n" +
                "i)\tDon't leave it on for longer than the recommended time\n" +
                "ii)\twear gloves when applying the dye\n" +
                "iii)\trinse your hair thoroughly afterwards\n" +
                "iv)\tcarefully follow the instructions included\n");

    }
}

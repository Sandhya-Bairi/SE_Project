package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stress_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_but4);

        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tPoor nutrition\n" +
                "•\tUnhealthy life style\n" +
                "•\tAllergy and food sensitivity’\n" +
                "•\tViral infections\n" +
                "•\tMedications\n");
        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tUsing herbs is recommended for those suffering from constipation or diarrhea, intestinal infections, irritable bowel and ulcers.\n" +
                "•\tMake infusion of lemon balm, chamomile, peppermint and fennel seeds. Steep for ten minutes in hot water, strain and drink. It is recommended to do this at least three times a day. Note that heartburn sufferers should avoid peppermint that increase gastric pH. \n" +
                "•\tConsume Probiotic bacteria which is found naturally in yogurt . Small amount of  Digestive enzymes are found in pineapple and papaya \n" +
                ".\n" +
                "•\tHandle emotional stress-Many digestive problems result from stressful lifestyle. Combining  herbs with calming properties like lemon balm and hops, and the use of soothing essential oils like lavender or chamomile oil. \n" +
                "•\tChange eating habits– Eat in a relaxed atmosphere without pressure.\n" +
                "– Concentrate on eating and avoid watching television or reading a newspaper at dinner.\n" +
                "– Chew your food well before swallowing.\n" +
                "•\tDetox - Specific foods that help eliminate toxins are garlic, onions, wheat germ, green leafy vegetables, broccoli, fruits and water.\n" +
                "•\t Exercise regularly\n");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but9);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Ovarian cancer is cancer that forms in the ovaries." +
                "\n• Cancer develops when cells mutate and start growing abnormally.\n• Eventually, these cells begin" +
                " to multiply at a rapid rate and form a tumor.\n•" +
                " If not caught early, the cancer can spread outside the ovaries to the rest of the reproductive organs and beyond.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tFrequent bloating.\n" +
                "•\tPain in your belly or pelvis.\n" +
                "•\tTrouble eating, or feeling full quickly.\n" +
                "•\tUrinary problems, such as an urgent need to urinate or urinating more often than usual.\n" +
                "•\tFatigue.\n" +
                "•\tIndigestion.\n" +
                "•\tBack pain.\n" +
                "•\tPain with intercourse.\n" +
                "•\tConstipation.\n" +
                "•\tMenstrual cycle changes.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tCrushed juice from ginger can be mixed with coconut or olive oil and massaged on to the abdominal area.\n" +
                "\n•\tThose women falling under a high risk of developing ovarian cancer can take a proactive step and include green tea in their diet.\n" +
                "\n•\tCertain mushrooms like Ganoderma lucidum are particularly effective in treating ovarian cancer and help the body fight the disease better. Mushrooms also work along with radiation and chemotherapy by reducing the symptoms of cancer.\n" +
                "\n•\tConsume Soya products, found in items such as soy milk and tofu, contain isoflavones. \n" +
                "\n" +
                "•\tTo make the issue easier to handle, one needs to have proper intake of water.\n" +
                "\n•\tMild exercise is necessary to manage the energy levels, as a woman undergoes a lot of stress due to ovarian cancer. \n");
    }
}

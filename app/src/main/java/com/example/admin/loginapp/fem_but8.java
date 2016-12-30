package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but8);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tadvancing age\n" +
                "•\tfamily history\n" +
                "•\tunhealthy lifestyle choices\n" +
                "•\ttaking certain medications\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tBackache\n" +
                "•\tA gradual loss of height and an accompanying stooped posture\n" +
                "•\tFractures of the spine, wrist, or hip.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tIt is recommended that people of all ages eat two to three dried plums daily, and gradually increase the amount to six to 10 per day to prevent osteoporosis.\n" +
                "\n•\tAn apple a day can keep osteoporosis at bay. To enjoy the bone benefits of apples, eat them along with the skin. Also, opt for organic apples to avoid pesticides and synthetic waxes.\n" +
                "\n•\tConsuming three tablespoons of virgin coconut oil daily can help prevent osteoporosis and five tablespoons daily can help reverse it. You can also externally apply the oil over your entire body and massage gently for a few minutes. Then take a hot bath. When done on a regular basis, this simple remedy will have a positive effect on your bone health. Also, use virgin coconut oil for cooking.\n" +
                "\n•\tSoak one cup of almonds in water overnight. The next day, remove the peels and put the almonds in a blender with two to two and one-half cups of water. Blend them into a smooth puree, add a little cinnamon powder and honey according to taste and blend again. Strain the solution with a cheesecloth and strainer. Drink this almond milk daily. You can opt instead to buy almond milk from the market as well.");
    }
}

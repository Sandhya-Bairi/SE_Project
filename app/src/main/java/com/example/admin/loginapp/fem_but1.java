package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• bacteria or virus\n" +
                "• Drugs\n" +
                "• chemical irritants\n" +
                "• environmental irritants");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• fatigue\n" +
                "• fever, and general malaise (feeling ill)\n" +
                "• Mostly affected parts are joints, muscles, skin, red blood cells, blood vessels," +
                " connective tissue, and endocrine glands.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tFish oil contains important omega-3 fatty acids. These fats help reduce inflammation in the body and lessen the immune response.\n" +
                "\n" +
                "•\tTake Vitamin C supplements. Vitamin C helps rebalance the immune system and restores its natural function. Supporting general function of the immune system helps reduce the disease response and relieve autoimmune disorders.\n" +
                "\n•\tTake green tea twice a day.\n" +
                "\n•\tSoak up the sun: Getting enough sunlight ensures regular supply of natural vitamin D in the body and may prove valuable in preventing and treating autoimmune disorders. It not only contributes in improving the immune defense mechanism but also brings direct relief in certain autoimmune disorders such as psoriasis, a disease characterized by the inflammation in the joints and skin.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\teat a balanced and healthy diet\n" +
                "•\texercise regularly\n" +
                "•\tget plenty of rest\n" +
                "•\ttake vitamin supplements\n" +
                "•\tdecrease stress\n" +
                "•\tlimit sun exposure\n" +
                "•\tavoid any known triggers of flare-ups\n");


    }
}

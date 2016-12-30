package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tanticonvulsant drugs\n" +
                "•\tretinoic acid and tretinoin\n" +
                "•\talcohol\n" +
                "•\tcocaine\n" +
                "•\tmaternal phenylketonuria\n" +
                "•\tfetal trauma\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tThe protein and nutrients in eggs help kids concentrate,.\n" +
                "•\tA full-fat Greek yogurt can help keep brain cells in good form for sending and receiving information.\n" +
                "•\tFish is a good source of vitamin D and omega-3s, which protect the brain from declining mental skills and memory loss. Salmon, tuna, and sardines are all rich in omega-3s.\n" +
                "•\tPacked with protein, essential fatty acids, vitamins, and minerals, nuts and seeds may boost mood and keep your nervous system in check.\n" +
                "\n" +
                "•\tProtein- and fiber-rich oatmeal helps keep heart and brain arteries clear. Apples and plums contain quercetin, an antioxidant that may fight decline in mental skills.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tSome cases of congenital brain defects can be prevented with good maternal nutrition , including folic acid supplements.\n" +
                "•\t Folic acid is a vitamin that has been shown to reduce the incidence of neural tube defects. \n" +
                "•\t Abstention from drugs and alcohol during pregnancy may reduce risk. \n");
    }
}

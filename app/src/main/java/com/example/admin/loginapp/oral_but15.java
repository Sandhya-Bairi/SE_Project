package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but15);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Nutritional deficiencies such as iron, vitamins, especially B12 and C\n" +
                "• Poor dental hygiene\n" +
                "• Food allergies\n" +
                "• Stress\n" +
                "• Infections particularly herpes simplex\n" +
                "• Biting the cheek\n" +
                "•  Hormonal imbalance\n" +
                "•  Bowel disease\n" +
                "•  Skin disease ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Grate some fresh coconut. Extract the milk and gargle with this 3-4 times a day.\n" +
                "• Keep 1 glass of chilled water and 1 glass of hot water ready at hand. Gargle alternately with hot and cold water.\n" +
                "• Boil 2 cups of water. Add 1 cup fenugreek leaves and remove. Cover and keep for some time. Strain the water and gargle 2-3 times a day.\n" +
                "• Boil 1 tsp of coriander seeds in 1 cup of water. Remove when slightly warm gargle. Repeat 3-4 times a day.\n" +
                "• Mix a pinch of turmeric powder to 1 tsp glycerine and apply.\n");

    }
}

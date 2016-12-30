package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class lung_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lung_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• pleurisy\n" +
                "• pneumonia\n" +
                "• cough\n" +
                "• common cold\n" +
                "• asthma and chronic obstructive pulmonary disease\n" +
                "• At times, people could suffer from bacterial lung infections, " +
                "due to environmental or even occupational factors, which include long term exposure to toxins and air pollutants.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• shortness in breath\n" +
                "• loss in appetite\n" +
                "• cough that may be with or without sputum\n" +
                "• fever, weight loss, discomfort while breathing\n" +
                "• somnolence\n" +
                "• pain in the chest and wheezing problems.\n" +
                "• More severe bacterial lung infection symptoms could include weakness, diarrhea, nausea, headaches and pain in the abdomen");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Warm or cool mist humidifiers add moisture to the air and eliminate the sputum from the body, when the patient coughs. Taking a hot steam for a few minutes or standing in a steamy shower can also have the same effect of moistening the air, which allows the sputum to loosen and leave the body sooner.\n" +
                "• Chew roots of licorice roots for few hours\n" +
                "• One clove of garlic should be crushed or mashed roughly, and swallowed, along with a glass of water, especially before bed time.\n" +
                "• Consume warm liquids like water, hot soup and herbal teas.\n" +
                "• A mixture made from cloves, ginger powder and pepper powder should be consumed everyday\n");

    }
}

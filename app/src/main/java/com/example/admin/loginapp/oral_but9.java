package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but9);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• due to infections\n" +
                "• allergic reactions\n" +
                "• hereditary angioneurotic edema\n" +
                "• insertion of breathing tubes\n" +
                "• genetic conditions, mouth dryness.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Sore throat\n" +
                "• Breathing difficulties\n" +
                "• pain\n" +
                "• swollen tonsils\n" +
                "• hoarse voice\n" +
                "• pus formation\n" +
                "• high fever");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Drink a glass pf water mixed with a teaspoon of salt" +
                "➣ Drink warm teas, especially tea with a spoonful of honey.");
    }
}

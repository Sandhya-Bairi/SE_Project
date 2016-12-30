package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but1);

        TextView txtDetails = (TextView) findViewById(R.id.txtDetails1);
        txtDetails.setMovementMethod(new ScrollingMovementMethod());
        //Spanned text=Html.fromHtml("<strong>Remedies</strong>");
        txtDetails.setText("\n• Almonds,fennel and sugar candy can be grinded in equal quantities to form a thick paste and 10gms of this mixture is taken at night with milk." +
                "\n• Massage the soles and toes of foot daily with mustard seeds as this improves the eyesight." +
                "\n• Mangoes are a good source of vitamin-A and calcium." +
                        "\n• Carrots and tomatoes should be consumed regularly for normal vision." +
                        "\n• Fill a green bottle with water and keep it under the sunlight and rinse your eye with this water regularly as this will help in curing myopia."
        );
    }
}

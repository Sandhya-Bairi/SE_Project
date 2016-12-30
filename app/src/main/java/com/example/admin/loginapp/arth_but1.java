package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class arth_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arth_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\tDrinking alkaline water is definitely the best cure for osteoarthritis." +
                "You can also try some of the following home remedies to cure osteoarthritis.\n\n" +
                "• Fresh juice extracted feom carrot and apples contain various nutrients and help in curing osteoarthritis.\n\n" +
                "• Ginger serves as an anti-inflammatory agent and is a wonderful remedy fro osteoarthritis.You can consume ginger in any form.\n\n" +
                "• Turmeric that reduces inflammation and eases pain\n\n" +
                "• Silicon present in the horsetail helps in increasing the strength of the connective tissue and rebuilding bones, thereby treating osteoarthritis.\n\n" +
                "• Yucca is an herbal remedy beneficial for reducing arthritis pain.\n\n" +
                "• Castor oil for reducing arthritis pain.\n\n" +
                "• Cherries, blueberries and hawthorn berries help in enhancing collagen matrix integrity and are great for curing osteoarthritis.\n\n" +
                "• Cayenne contains capsaicin that is used to ease pain caused due to osteoarthritis.\n\n" +
                "• Devil's claw is the best analgesic and anti-flammatory herb used for treating osteoarthritis.\n\n" +
                "• Angelica rootcan be used in the form of oil or compress to reduce pain, spasms and swelling in the joints.\n\n" +
                "• Celery seed acts as an inflammatory drug used for curing osteoarthritis.\n\n" +
                "• white willow helps in reducing pain.");

    }
}

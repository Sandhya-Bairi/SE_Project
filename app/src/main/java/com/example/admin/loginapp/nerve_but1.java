package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class nerve_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerve_but1);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tFamily history – It is possible to have a genetic predisposition to developing a tumor.\n" +
                "•\t Radiotherapy – People who have had radiation to the head, usually to treat another type of cancer, may be at an increased risk of developing a tumor.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tAcupuncture is a complementary treatment that may help you deal with symptoms of your brain tumor. This practice utilizes specific pressure points to relieve pain and inflammation throughout your body \n" +
                "•\tVitamin C is an important antioxidant that eradicates free radicals from your body and also improves your immune system. You should take at least 75mg of vitamin C 2 to 3 times a day.\n" +
                "•\tDMSO-This remedy helps reduce the size of tumors as it binds to and eliminates cancerous cells. To implement this treatment, mix fully concentrated DMSO with aloe vera in a ratio of 70% to 30%. Take 1 tablespoon of the mixture by mouth twice a day and eat a strictly whole food diet for at least 3 days.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tIncreasing physical activity, lowers risk of many types of cancers.\n" +
                "•\tDo muscle strengthening exercises at least twice a week. \n" +
                "•\tMake healthier food choices like whole grains and legumes which gives your body the range of vitamins, minerals and antioxidants .\n" +
                "•\tAvoid sugary drinks\n" +
                "•\tEat more of a variety of vegetables, fruits, whole grains and legumes such as beans\n" +
                "•\tLimit consumption of red meats (such as beef, pork and lamb)\n" +
                "•\tAvoid processed meats\n" +
                "•\tLimit consumption of salty foods and foods processed with salt (sodium)\n");


    }
}

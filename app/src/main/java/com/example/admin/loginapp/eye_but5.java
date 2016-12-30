package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Hypertension\n• Diabetes\n• Smoking\n• Eye injury or surgery");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("➣ Garlic Cloves\n" +"Consume 2-3 cloves of garlic everyday as it cleanses your lens like you have just cleaned them with soap and water.\n"+
                "\n➣ Spinach\n" +"Consume spinach daily to reverse the effects of cataract and to put it back on right tract and also to prevent its formation.\n"+
                "\n➣ Milk and almonds\n" +"Soak almonds overnight in the milk and apply that milk drops on the eyelids to reduce irritation.\n"+
                "\n➣ Cardomom\n"+"Mix cardamom powder in a glass of milk and drink it.\n" +
                "\n➣ Apply light Pressure against your eyes for about thirty seconds.\n\n" +
                "\n➣ Drink fresh fruit juices especially carrot.\n\n" +
                "\n➣ Avoid caffeine, alcohol, tobacco.\n\n");


        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Healthy eating\n• Quitting smoking\n• Wearing sunglasses\n• Avoid steroid usage.");


    }
}

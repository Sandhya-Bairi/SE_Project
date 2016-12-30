package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• due to dry white flakes of dandruff on skin, infections and lack of moisture");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• a.\tApply warm coconut oil on the scalp\n" +
                "b.\tMassage 2-3 times with extra virgin olive oil\n" +
                "\n" +
                "c.\tApply lemon juice on the scalp and massage with finger tips\n" +
                "\n" +
                "d.\tTake 2 tablespoons each of bean curd and honey and add 4 tablespoons of lemon juice to this." +
                " Massage on the scalp gently and leave it for ½ hour. Use it once or twice a week.\n");
    }
}

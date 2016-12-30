package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Interface36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface36);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•Makes you fall down\n•Muscle contraction\n•Seizures\n•Dehydration\n•Burns \n•Clotting of blood\n•Tissue death\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("TO TURN OFF POWER:\n" +
                "•Unplug an appliance if plug is undamaged or shut off power via circuit breaker, fuse box, or outside switch.\n" +
                "IF YOU CAN'T TURN OFF POWER:\n" +
                "•Stand on something dry and non-conductive, such as dry newspapers, telephone book, or wooden board.\n" +
                "•Try to separate the person from current using non-conductive object such as wooden or plastic broom handle, chair, or rubber doormat.\n" +
                "IF HIGH VOLTAGE LINES ARE INVOLVED:\n" +
                "•The local power company must shut them off.\n" +
                "•Do not try to separate the person from current if you feel a tingling sensation in your legs and lower body. Hop on one foot to a safe place where you can wait for lines to be disconnected.\n" +
                "•If a power line falls on a car, instruct the passengers to stay inside unless explosion or fire threatens.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("When you can safely touch the person, do CPR if the person is not breathing or does not have a pulse.\n" +
                "•For a child, start CPR for children.\n•For an adult, start adult CPR.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•If the person is bleeding, apply pressure and elevate the wound if it's in an arm or leg.\n" +
                "•There may be a fracture if the shock caused the person to fall.\n" +
                "•For burns, see Burn Treatment.\n");

        TextView txtDetails5 = (TextView) findViewById(R.id.txtDetails5);
        txtDetails5.setMovementMethod(new ScrollingMovementMethod());
        txtDetails5.setText("•A doctor will check the person for burns, fractures, dislocations, and other injuries.\n" +
                "•An ECG, Blood tests, urine test, CT scan, or MRI may be necessary.\n•The person may be admitted to the hospital or a burn center.\n");

    }
}

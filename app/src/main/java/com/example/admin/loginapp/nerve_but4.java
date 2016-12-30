package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class nerve_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerve_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tComas are caused by an injury to the brain which can be due to increased pressure, bleeding, loss of oxygen, or buildup of toxins.\n" +
                "•\tWhen the brain swells as a result of trauma, the fluid pushes up against the skull. \n•\tBleeding in the layers of the brain may cause coma due to swelling and compression on the injured side of the brain\n•\tOxygen is essential for brain function. Cardiac arrest causes a sudden cutoff of blood flow and oxygen to the brain, called hypoxia or anoxia. After CPR, survivors of cardiac arrest are often in comas.\n" +
                "•\tSubstances that are normally found in the body can accumulate to toxic levels if the body fails to dispose of them correctly.\n" +
                "•\tA single seizure rarely produces coma. But continuous seizures -- called status epilepticus can.\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tDetermining the cause of a coma is often the first step toward treatment\n" +
                "•\t Natural options include coconut oil, gingko biloba, peracitam, and hydergine taken orally help maintain the affected individual’s health. \n" +
                "•\tOther options include DMSO, coQ-10 and vitamins B and C. \n" +
                "•\tAdditionally loved ones visiting and attempting to communicate with the individual also helps expedite the healing process.\n");


    }
}

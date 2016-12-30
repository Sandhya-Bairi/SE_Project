package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ear_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• pressure\n" +
                "• extremely loud noises\n" +
                "• contact with some foreign objects\n" +
                "• injury to the ear drum\n" +
                "• middle ear infection can cause rupture\n" +
                "• Activities that cause a change of pressure include scuba diving, flying in an airplane, driving at high altitudes.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•every person experiences the pain differently and remains steady throughout the day, " +
                "or it can increase or decrease in intensity.\n" +
                "• Fluids that are watery, bloody, or filled with pus may drain from the affected ear.\n" +
                "• You may have some temporary hearing loss, or a reduction in hearing in the affected ear. \n" +
                "• Sometimes can experience tinnitus-a ringing or buzzing in the ears, dizziness or a weakness in your facial muscles.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tPut warm compresses on the ear to help relieve discomfort.\n" +
                "\tKeep the ear clean and dry while it is healing.\n" +
                "\tPlace cotton balls in the ear while showering or shampooing to prevent water from entering the ear.\n" +
                "\tAvoid swimming or putting your head underneath the water\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Do not insert objects into the ear canal, even to clean it.\n" +
                "• Objects stuck in the ear should only be removed by a health care provider.\n" +
                "• Have ear infections treated promptly.");
    }
}

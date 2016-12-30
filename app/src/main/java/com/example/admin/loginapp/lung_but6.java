package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class lung_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lung_but6);


        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• being overweight or out of shape, age, sinus or nasal problems, alcohol, smoking and medications, sleeping flat.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tClosed-mouth snoring may indicate a problem with your tongue.\n" +
                "•\tOpen-mouth snoring may be related to the tissues in your throat.\n" +
                "•\tSnoring when sleeping on your back is probably mild snoring-improved sleep habits and lifestyle changes may be effective cures.\n" +
                "•\tSnoring in all sleep positions can mean your snoring is more severe and may require a more comprehensive treatment.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tLose weight\n" +
                "•\tDo exercises\n" +
                "•\tQuit smoking\n" +
                "•\tAvoid alcohol, sleeping pills and sedatives\n" +
                "•\tClear nasal passages\n" +
                "•\tElevating your head four inches may ease breathing and encourage your tongue and jaw to move forward. " +
                "There are specially designed pillows available to help prevent snoring by making sure your neck muscles are not crimped.\n" +
                "•\tTry attaching a tennis ball to the back of a pajama top or T-shirt. " +
                "(You can sew a sock to the back of your top then put a tennis ball inside.) " +
                "If you roll over onto your back, the discomfort of the tennis ball will cause you to" +
                " turn back onto your side. Alternatively, wedge a pillow stuffed with tennis balls behind your back." +
                " After a while, sleeping on your side will become a habit and you can dispense with the tennis balls.\n");
    }
}

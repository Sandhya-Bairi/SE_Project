package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Interface38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface38);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("1.Roll the person over onto their side. This will prevent them from choking on vomit or saliva.\n" +
                "2.Cushion the person’s head.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("3.Loosen the collar so the person can breathe freely\n4.Take steps to maintain a clear airway.It may be necessary to grip the jaw gently, and tilt the head back slightly to open the airway more thoroughly.\n" +
                "5.Do NOT attempt to restrain the person unless failing to do so could result in obvious bodily harm .\n" +
                "6.Do NOT put anything into the mouth. Remove sharp or solid objects that the person might come into contact with.\n" +
                "7.Take note on how long did the seizure lasted and what were the symptoms to help medical personnel .\n" +
                "8.Stay calm and by the person’s side throughout the seizure.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("Call for emergency help under the following circumstances:\n" +
                "•The person is pregnant, or diabetic.\n" +
                "•The seizure happened in water.\n" +
                "•The seizure lasts longer than five minutes.\n" +
                "•The person does not regain consciousness after the seizure.\n" +
                "•The person stops breathing after the seizure.\n" +
                "•The person has a high fever.\n" +
                "•Person hurts himself during the seizure.\n");

    }
}

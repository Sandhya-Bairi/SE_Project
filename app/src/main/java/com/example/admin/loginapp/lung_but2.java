package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class lung_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lung_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Inhaling harmful, cancer-causing substances (carcinogens) like cigarette smoke, asbestos, and radon" +
                " damages the cells that line your lungs.\n" +
                "• Smoking and exposure to certain chemicals can greatly increase your risk of getting lung cancer.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• persistent cough\n" +
                "• coughing up blood\n" +
                "• chest pain\n" +
                "• recurring chest infections\n" +
                "• voice hoarseness");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Try to relax\n" +
                "• When you feel short of breath, focus your mind on your breathing. Instead of trying to fill your lungs with air, concentrate on moving the muscles that control your diaphragm. Try breathing through pursed lips and pacing your breaths with your activity.\n" +
                "• If you're short of breath, you may become tired easily. Cut out the nonessential tasks from your day so that you can save your energy for what needs to be done.\n" +
                "• Consume healthy diet including uncooked fruits, vegetables and grains, lots of salad, distilled water\n" +
                "• Exposure to sunlight is the easiest way for vitamin D\n" +
                "• Avoid sugar and peanuts");

    }
}

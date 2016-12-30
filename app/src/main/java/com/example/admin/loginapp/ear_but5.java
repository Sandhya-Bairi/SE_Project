package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ear_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• when moisture remains in the ear after swimming or other exposure to water\n" +
                "• insect bites\n" +
                "• contact allergies, and trauma.\n" +
                "• Chickenpox\n" +
                "• an extremely common childhood illness is accompanied by red," +
                " oozing blisters that cause intense itching.\n" +
                "• Eczema, contact dermatitis, scabies, and ringworm are other sources of itching.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• impaired breathing\n" +
                "• swelling\n" +
                "• fainting and vomiting.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tTry a few drops of warm oil. To warm the oil, the container should be placed into a warm glass of water for 15 to 20 minutes. The drops should be tested on your inner wrist before being dropped into the ear to make sure the oil isn't hot enough to burn you.\n" +
                "\n•\tSquirt water and alcohol in equal amounts into ear using a bulb syringe or ear syringe which flushes out debris and kill bugs. You can use vinegar instead of water.\n" +
                "\n•\tWax that builds up in the ear can cause itching and even pain. Warm water bottle or hot wash cloth can be placed over the ear while the individual is lying sideways. The heat can soften hardened wax and help it move out of the ear.");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("\n• avoid cleaning your ears with objects such as cotton balls, cotton swabs," +
                " paper clips, or bobby pins. \n" +
                "\n• If you swim frequently, use a solution to dry up excess water in the ear canal.");


    }
}

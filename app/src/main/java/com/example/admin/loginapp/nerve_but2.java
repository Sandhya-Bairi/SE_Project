package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class nerve_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerve_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tWhen the brain is starved of oxygen for a prolonged period of time, brain damage may occur.\n" +
                "•\t Brain damage can occur as a result of a wide range of injuries, illnesses, or conditions.\n" +
                "•\tCar accidents\n" +
                "•\tBlows to the head\n" +
                "•\tSports injuries\n" +
                "•\tPoisoning or exposure to toxic substances\n" +
                "•\tHeart attacks\n" +
                "•\tIllegal drugs\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("1.Omega-3 Fats- A daily supplement of omega-3s inhibits cell death, helps promote the reconnection of damaged neurons in the brain. Fish and sea food such as Salmon, Tuna have them.\n" +
                " 2. Turmeric contains an important compound known as curcumin, which is used for relieving inflammation in the system. For the best results, take a 500mg capsule of turmeric up to four times a day.\n" +
                "3. Gingko biloba contains glycosylated flavonoids that help reduce inflammation in your brain following an injury. Take 240mg to 480mg of the extract daily.\n" +
                "4. Alternative therapies, like acupuncture are used for effective treatment. \n" +
                "5.  Massage helps restore proper function throughout your body. It also helps improve circulation and metabolism of wastes in your body, which all work to rejuvenate your brain.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tNever shake a child.\n" +
                "•\tInstall window guards to keep young children from falling out of open windows.\n" +
                "•\tWear helmets during sports or cycling.\n" +
                "•\tWear seatbelts in cars, and drive carefully.\n" +
                "•\tAvoid falls by using a stepstool when reaching for high items.\n" +
                "•\tInstall handrails on stairways.\n" +
                "•\tDon't use illegal drugs.\n" +
                "•\tDrink alcohol only in moderation, and never drink and drive.\n");

    }
}

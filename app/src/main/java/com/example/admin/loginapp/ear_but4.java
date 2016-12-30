package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ear_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• bacteria or viruses in the middle ear\n" +
                "• wax buildup\n" +
                "• upper respiratory infections\n" +
                "• food allergies\n" +
                "• environmental allergies\n" +
                "• fetal alcohol syndrome\n" +
                "• genetics\n" +
                "• nutritional deficiencies and internal injuries.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• pain in the ear\n" +
                "• tugging at the ear\n" +
                "• difficulty sleeping\n" +
                "• headache\n• poor response to sounds\n" +
                "• high fever\n• fluid draining from the ear\n• vomiting\n• diarrhea.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tHeat up one cup of salt on a pan over low heat for a few minutes. Place the hot salt on a cloth and seal the open end with rubber band (or tie a knot). When it is bearably hot, lay down and put the cloth on the affected ear for 5 to 10 minutes. Repeat this remedy daily as many times as needed. The heat generated from the sock will help draw out fluid from the ear and relieve swelling and pain.\n" +
                "\n•\tMake garlic oil by cooking two garlic cloves in two tablespoons of sesame oil or mustard oil until it turns blackish. Strain the solution. When it is bearably hot, use two to four drops of this oil in the infected ear as ear drops.\n" +
                "\n•\tCrush four to five fresh holy basil leaves gently to extract the juice. Apply the basil juice on or around the infected ear. Avoid getting the juice in the ear canal.\n" +
                "\n•\tYou can also mix a few drops of holy basil oil with an equal amount of carrier oil like coconut oil. Soak a cotton ball in the mixture and gently wipe just inside the ear, around the outer edge and behind the ear. Repeat the process twice daily.\n" +
                "\n•\tPress a warm water bottle or heating pad against the ear. Do not apply heat to the ear for long periods of time. Start with five minutes, remove the heat for a while and then repeat the process as needed.");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("\t\t Practice the below to reduce the risk of ear infection\n" +
                "•\twashing your hands often\n" +
                "•\tavoiding overly crowded areas\n" +
                "•\tforgoing pacifiers with infants and small children\n" +
                "•\tbreast-feeding infants\n" +
                "•\tavoiding secondhand smoke\n" +
                "•\tkeeping immunizations up-to-date\n");
    }
}

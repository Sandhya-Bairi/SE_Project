package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but18);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• due to bacteria in the mouth and a high-sugar and starch diet\n" +
                "• plague attacks\n" +
                "• not brushing and flossing your teeth regularly and not seeing a dentist for checkups and cleanings\n" +
                "• not having enough saliva\n" +
                "• having diabetes\n" +
                "• smoking, using spit tobacco.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Toothache\n" +
                "• Tooth sensitivity\n" +
                "• Mild to sharp pain when eating or drinking something sweet, hot or cold\n" +
                "• Visible holes or pits in your teeth\n" +
                "• Brown, black or white staining on any surface of a tooth, Pain when you bite down");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Dilute 2 to 3 drops of clove oil with 1/4 teaspoon of sesame seed oil. Put a few drops of this solution on a cotton ball and dab the solution on the affected tooth. Repeat every night before going to bed.\n" +
                "• Prepare a paste from 3 to 4 crushed garlic cloves and 1/4 teaspoon of rock salt. Apply it on the infected tooth. Leave it on for 10 minutes before rinsing with a mouthwash. Do this twice daily for a few weeks to reduce cavities.\n" +
                "• Apply some turmeric powder on the affected teeth. Leave it on for a few minutes and then rinse well with warm water.\n");


    }
}

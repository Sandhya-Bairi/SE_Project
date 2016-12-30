package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tcoughing\n" +
                "•\tvomiting\n" +
                "•\tstraining during bowel movements\n" +
                "•\tlifting heavy objects\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\theartburn that gets worse when you lean over or lie down\n" +
                "•\tchest pain or epigastric pain\n" +
                "•\ttrouble swallowing\n" +
                "•\tbelching\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣\t\tThe warm water mix-\n• Drinking warm water first thing in the morning and then performing the following exercise is a good way to help bring down the hernia from the opening in the diaphragm.\n" +
                "\n•\tJust after waking up, while you are still in the bed, drink a glass of room temperature or slightly warm water. It will help relax the stomach muscles and diaphragm and put some weight in the stomach.\n" +
                "\n•\tThen, stand up, lift your arms straight out from your sides and bend your elbows so your hands touch your chest. This will help stretch the diaphragm and open up the hiatus.\n" +
                "\n•\tNext, rise up on your toes as high as possible and quickly drop down onto your heels. Do this several times in a row. This will help the weight of the water to pull the stomach down.\n" +
                "\n•\tThen, while standing with your arms up, take a few short and quick breaths with your mouth open for about 15 seconds. The panting will help tighten the diaphragm back up and close the hole.\n" +
                "\n➣\t\tSelf-Massage-\n• Abdominal self-massage mainly targets the uppermost portion of your abdominal cavity.\n" +
                "\n•\tLie on your back and relax.\n" +
                "\n•\tPut your fingers just below the breast bones (sternum) where you can find your rib cage.\n" +
                "\n•\tNext, apply downward pressure and slowly move towards your belly button.\n" +
                "\n•\tRepeat for 5 minutes.\n" +
                "\n•\tDo this twice daily, once in the morning and once in the evening.\n");
    }
}


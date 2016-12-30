package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but7);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\t\tAtaxia is a neurological sign and symptom that involves lack of coordination of muscle movements.\n" +
                "• Drug Intoxication\n" +
                "• Medication side effect\n" +
                "• Alcohol intoxication\n" +
                "• Metabolic disorder\n" +
                "• Cerebellar degeneration\n" +
                "• Cerebellar mass\n" +
                "• Cerebellar hemorrhage\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tImpaired coordination in the torso or arms and legs\n" +
                "•\tfrequent stumbling\n" +
                "•\tuncontrolled or repetitive eye movements\n" +
                "•\ttrouble eating and performing other fine motor tasks\n" +
                "•\tslurred speech\n" +
                "•\tvocal changes\n" +
                "•\theadaches\n" +
                "•\tbehavioral or personality changes\n" +
                "•\tdizziness\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tOccupational Therapy-  Evaluating and training specific functional tasks related to activities of daily living with the help of an occupational therapist has been found to stabilize disability ratings and decrease depression\n" +
                "•\tAyurveda-  Ayurvedic oils applied to the scalp, herbal supplements, massage and sauna, for between two to four weeks. \n");
    }
}

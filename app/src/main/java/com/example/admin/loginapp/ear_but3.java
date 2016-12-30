package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ear_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• wax buildup\n" +
                "• air flow blockage to the Eustachian tubes\n" +
                "• pressure differences in the middle ear\n" +
                "• cold and sinus problems. ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• dizziness\n" +
                "• ear pain\n" +
                "• muffled hearing.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tClose your mouth and pinch your nostrils closed with your fingers, then take a deep breath. Blow air out of your nose to regulate the air pressure. If done correctly, you will hear a slight popping sound which means the Eustachian tubes are open again.\n" +
                "\n•\tGently warm some pure olive oil. Use a dropper to put a few drops of the lukewarm olive oil in the affected ear. Allow it to settle for 10 minutes so that the earwax becomes soft. Keep your head sideways and remove the oil and ear wax with ear buds. Do this very gently so you don’t hurt the delicate organ.\n" +
                "\n•\tMix equal amounts of alcohol and apple cider vinegar. Lie down on your side and use a dropper to put a few drops of this mixture in the affected ear. To keep the mixture from spilling out, place a cotton ball in the ear and do not raise your head. Rest for five to 10 minutes to allow the mixture to do its work. Remove the earwax with an ear bud. If the other ear is also clogged, repeat the process with the other ear." +
                "\n•\tSoak a washcloth in warm water, wring out the excess water and then hold the washcloth over the affected ear for five to 10 minutes. This will help to ease pain and promote fluid drainage.\n" +
                "\n•\tPour hot steaming water in a large bowl. Add a few drops of tea tree oil or lavender essential oil to it. Cover your head with a towel and inhale the steam slowly until the clogged ear opens up.\n");

    }
}

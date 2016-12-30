package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class heart_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_but3);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tHigh blood pressure. High blood pressure can cause the left ventricle to enlarge, causing the heart muscle eventually to weaken. \n" +"•\tHeart valve disease- If the valves are damaged by conditions such as rheumatic fever, infections, certain medications or radiation treatments for cancer, your heart may enlarge.\n" +
                "•\tDisease of the heart muscle- As thickening and stiffening of heart muscle progresses heart may enlarge to try to pump more blood to your body.\n•\tHigh blood pressure in the artery connecting your heart and lungs (pulmonary hypertension)\n" +
                "•\t Fluid around heart (pericardial effusion)-Accumulation of fluid in the sac (pericardium) that contains your heart may cause heart to appear enlarged on a chest X-ray.\n" +
                "•\tLow red blood cell count \n" +
                "•\tThyroid disorders. Both hypothyroidism and hyperthyroidism can lead to an enlarged heart.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tShortness of breath\n" +
                "•\tAbnormal heart rhythm (arrhythmia) \n" +
                "•\t Chest pain \n" +
                "•\tSevere shortness of breath and swelling\n" +
                "•\t Fainting\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tQuit smoking.\n" +
                "•\tLose excess weight.\n" +
                "•\tEat a low-salt diet.\n" +
                "•\tControl diabetes.\n" +
                "•\tMonitor your own blood pressure.\n" +
                "•\tGet modest exercise, after discussing with your doctor the most appropriate program of physical activity.\n" +
                "•\tEliminate or reduce the amount of alcohol you drink.\n" +
                "•\tTry to sleep eight hours each night.\n");

    }
}

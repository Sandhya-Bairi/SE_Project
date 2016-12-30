package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but8);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tWhen you inhale tiny, airborne mold spores, your body recognizes them as foreign invaders and develops allergy-causing antibodies to fight them.");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tSneezing\n" +
                "•\tCough and postnasal drip\n" +
                "•\t Itchy eyes, nose and throat\n" +
                "•\t Chest tightness\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tEliminate sources of dampness in basements, such as pipe leaks or groundwater seepage.\n" +
                "•\tUse a dehumidifier in any area of your home that smells musty or damp. Keep your humidity levels below 50 percent. Remember to clean the collection bucket and condensation coils regularly.\n" +
                "•\tChange filters on your furnace and air conditioners regularly. Have forced air heating ducts inspected and if necessary, cleaned.\n" +
                "•\tBe sure all bathrooms are properly ventilated\n" +
                "•\tDon't carpet bathrooms and basements.\n" +
                "•\tPromote groundwater drainage away from your house by removing leaves and vegetation from around the foundation and cleaning out rain gutters frequently.\n" +
                "•\tKeep organic plant containers clean and dry, such as those made of straw, wicker ");
    }
}

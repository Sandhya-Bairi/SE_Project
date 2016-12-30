package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stress_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_but2);

        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("Alzheimer's is caused by a combination of genetic, lifestyle and environmental factors");

        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tOccasional memory lapses\n" +
                "•\tRepeat statements and questions over and over \n" +
                "•\tRoutinely misplace possessions, often putting them in illogical locations\n" +
                "•\tGet lost in familiar places\n" +
                "•\tDepression\n" +
                "•\tIrritability and aggressiveness\n" +
                "•\tChanges in sleeping habits\n" +
                "•\tWandering\n");

        TextView txtDetails3 = (TextView)findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tSesame oil - Use about 3 drops per nostril, twice a day or by rub a little warmed sesame oil on the top of the head and bottoms of the feet.\n" +
                "•\tWheat germ or powdered milk- Add to foods for extra protein.\n" +
                "•\tBlueberries contain an antioxidant that may slow down age-related motor changes, such as those seen in Alzheimer's disease.\n" +
                "•\tEating carrots, which are loaded with beta-carotene, is a safe way to acquire vitamin A through the diet. \n" +
                "•\tCitrus fruits.\n" +
                "•\t Fish and Green leafy vegetables\n");
    }
}

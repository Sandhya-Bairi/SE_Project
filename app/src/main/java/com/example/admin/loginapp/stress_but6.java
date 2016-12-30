package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stress_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_but6);

        TextView txtDetails1 = (TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tOmega-3 Fatty Acids-They are essential nutrients that help reduce inflammation caused by atherosclerosis. Consumption of omega-3 fatty acids, commonly found in fish, is linked to lower blood pressure, and a reduced risk of death from heart disease. ");

        TextView txtDetails2 = (TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tGreen Tea-Consumption of five to six cups of green tea per day reduces the risk of heart diseases. Green tea extract is also available as a supplement in capsule form.\n" +
                "•\tPomegranate- Powerful antioxidant chemicals in pomegranate fruit and juice may help reverse atherosclerosis and lower blood pressure.\n" +
                "•\tMagnesium and Potassium-Taking Magnesium supplements may reduce blood pressure and that they are good for overall heart function and heart disease. Potassium to improve heart function.\n" +
                "•\t Substituting magnesium and potassium salts for table salt can actually lower blood pressure, which in turn reduces heart diseases.\n");

        TextView txtDetails3 = (TextView)findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tRegular exercise,meditation and balanced healthy diet controls heart diseases by reducing stress level\n" +
                "•\tDo not get stressed ,it may lead to heart attack.\n");

    }
}

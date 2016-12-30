package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class bp_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp_but2);

        TextView txtDetails1=(TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• pregnancy (due to an increase in demand for blood from both mother and the growing fetus)\n" +
                "• large amounts of blood loss through injury\n" +
                "• impaired circulation caused by heart attacks or faulty heart valves\n" +
                "• weakness and a state of shock that sometimes accompany dehydration\n" +
                "• anaphylactic shock, a severe form of allergic reaction\n" +
                "• infections of the bloodstream\n" +
                "• endocrine disorders such as diabetes\n" +
                "• adrenal insufficiency, and thyroid disease");

        TextView txtDetails2=(TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• fatigue\n" +
                "• Lightheadedness\n" +
                "• dizziness\n" +
                "• nausea\n" +
                "• clammy skin\n" +
                "• depression\n" +
                "• loss of consciousness\n" +
                "• blurry vision");

        TextView txtDetails3=(TextView)findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tSalt water helps treat low blood pressure because the sodium in salt increases blood pressure. Do not overdo this remedy though, as excess salt can prove to be unhealthy. Simply mix one-half teaspoon of salt in a glass of water and drink it. You can also drink sports beverages.\n" +
                "•\tExtract the juice of 10 to 15 basil leaves. Add one teaspoon of honey to it. Drink this juice daily on an empty stomach.\n" +
                "•\tYou can prepare licorice tea by steeping one teaspoon of this herb (dried or powdered) in a cup of boiling water for about five minutes. You can take it daily for a few days.\n" +
                "•\tTake beetroot juice twice daily.\n" +
                "");

        TextView txtDetails4=(TextView)findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Avoid alcohol\n" +
                "• Avoid standing for long hours (in neurally mediated hypotension)\n" +
                "• Drink plenty of fluids to prevent dehydration\n" +
                "• Get up slowly after prolonged sitting or lying down\n" +
                "• Use of compression stockings to increase blood pressure in the legs \n");
    }
}

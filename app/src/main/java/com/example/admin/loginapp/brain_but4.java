package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but4);


        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tmumps\n" +
                "•\tHerpex simplex\n" +
                "•\tHIV\n" +
                "•\tchicken pox (very rare)\n" +
                "•\tmeasles\n" +
                "•\trubella\n" +
                "•\tColorado encephalitis -transmitted by the female wood tick.\n");


        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("\t\tMild symptoms include:\n" +
                "•\tfever\n" +
                "•\theadache\n" +
                "•\tvomiting\n" +
                "•\tstiff neck\n" +
                "•\tlethargy (exhaustion)\n" +
                "\t\tSevere symptoms include:\n" +
                "•\tvery high fever (103°F or higher)\n" +
                "•\tconfusion\n" +
                "•\tdrowsiness\n" +
                "•\thallucinations\n" +
                "•\tslower movements\n" +
                "•\tcoma\n" +
                "•\tseizures\n" +
                "•\tirritability\n" +
                "•\tsensitivity to light\n" +
                "•\tunconsciousness\n");


        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tvomiting\n" +
                "•\tbulging fontanel (soft spot in the scalp)\n" +
                "•\tconstant crying\n" +
                "•\tbody stiffness\n" +
                "•\tpoor appetite\n");


        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tTake 40 drops of tincture of rosemary twice a day to help support better concentration and memory while recovering from encephalitis. \n" +
                "\n" +
                "•\tTake 120 mg of ginkgo biloba extract twice daily to enhance memory and support clear thinking while you are recovering from encephalitis. \n" +
                "\n" +
                "•\tTake 1/2 mg of melatonin daily. \n" +
                "\n" +
                "•\tTake 250 mg of astralagus standardized extract four times a day for immune support and antiviral activity, and to help with weakness and exhaustion. \n");
    }
}

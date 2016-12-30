package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but11);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\t\tPituitary tumors cause an imbalance in production of hormones. \n" +
                "•\tExact causes are not known. \n" +
                "•\tCertain changes in a person’s DNA can cause cells in the pituitary to produce a tumor..\n" +
                "•\tChanges in other genes have been found in other types of pituitary adenomas \n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tgigantism \n" +
                "•\tmenstrual disorders \n" +
                "•\texcessive thirst \n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tChaste tree berry regulates hormones and supports the function of the pituitary gland. " +
                "Chaste tree berry may take several months to be effective and should be discussed with a health care provider prior to its use.\n" +
                "•\tAstragalus is an adaptogenic herb native to China." +
                " The recommended dose for astragalus is 500 mg of astragalus or 60 to 100 drops of tincture.\n" +
                "•\tLicorice tea -Recommended dosage of licorice for pituitary support is a decoction with 1/2 to 1 tsp." +
                " of the root steeped in boiling water for 10 to 15 minutes, taken three times per day.\n");
    }
}

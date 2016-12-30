package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\t\tBleeding can occur inside the brain, between the brain and the membranes, between the layers of the brain's covering or between the skull and the covering of the brain.\n•\tHead trauma .\n" +
                "•\tHigh blood pressure . \n" +
                "•\tAneurysm (weakening in a blood vessel wall that swells and bursts)\n" +
                "•\tBlood vessel abnormalities.\n" +
                "•\t Liver disease. \n" +
                "•\tBrain tumors .\n ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tA sudden severe headache\n" +
                "•\tSeizures with no previous history of seizures\n" +
                "•\tWeakness in an arm or leg\n" +
                "•\tNausea or vomiting\n" +
                "•\tDecreased alertness; lethargy\n" +
                "•\tChanges in vision\n" +
                "•\tTingling or numbness\n" +
                "•\tDifficulty speaking or understanding speech\n" +
                "•\tDifficulty swallowing\n" +
                "•\tDifficulty writing or reading\n" +
                "•\tLoss of fine motor skills, such as hand tremors\n" +
                "•\tLoss of coordination\n" +
                "•\tLoss of balance\n" +
                "•\tAn abnormal sense of taste\n" +
                "•\tLoss of consciousness\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tCayenne pepper, a kind of red pepper can stop external bleeding like Brain Hemorrhage. \n" +
                "•\tFish oil helps in the thinning of the blood and improves circulation. Vegetarians can consume DHA, a kind of omega-3 fatty acid, a structural component of our brain. \n" +
                "•\tThe extracts from Ginkgo biloba, one of the oldest species of trees can effectively treat brain Hemorrhage. \n" +
                "•\tVegetables contain vitamin B can also significantly prevent a Brain Hemorrhage.\n" +
                "•\tPerforming yoga on a regular can increase your brain power and solve the problem related to brain hemorrhage.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tTreat high blood pressure. .\n" +
                "•\tDon’t smoke.\n" +
                "•\tDon’t use drugs. \n" +
                "•\tDrive carefully, and wear your seat belt.\n" +
                "•\tIf you ride a motorcycle, always wear a helmet.\n" +
                "•\tInvestigate corrective surgery. \n");
    }
}

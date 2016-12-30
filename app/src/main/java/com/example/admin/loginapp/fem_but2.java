package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fem_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fem_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tOld age\n" +
                "•\tFirst childbirth at an old age\n" +
                "•\tFamily history\n" +
                "•\tPrior breast treatment with radiation therapy\n" +
                "•\tConsumption of alcoholic beverages\n" +
                "•\tIntake of progesterone and estrogen hormones\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tLump in the underarm region or near the breast\n" +
                "•\tIncreased discharge from the breast\n" +
                "•\tNipples become inverted\n" +
                "•\tChange in texture or morphology of breast like scaliness, unevenness, swelling, or reduction in size\n" +
                "•\tIncreased heat radiating from the breast\n" +
                "•\tPain is not felt even when pressure is applied\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tIt is always better to eat garlic in raw form as an oil, clove or powdered substance, rather than consuming it in a cooked form.\n" +
                "\n•\tConsume Broccoli as it contains the linamarase gene that when present inside cancer cells can breakdown into cyanide and effectively kill tumorous cells.\n" +
                "\n•\tA drug called doxorubicin was also found to enhance its anti-tumor activity by consuming grapes juice or extract everyday as a supplemental treatment.\n" +
                "\n•\tPrepare herbal green tea by boiling some amount of tea leaves in a glass of water till it reduces to half. This has anti-inflammatory properties and is very effective against breast cancer formation.\n" +
                "\n•\tUse olive oil in your kitchen instead of normal vegetable oils.\n");

    }
}

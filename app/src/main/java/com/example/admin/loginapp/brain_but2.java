package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class brain_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tBrain cancer that originates in the brain is called a primary brain tumour. It can spread and destroy nearby parts of the brain. Cancers of the breast, lung, skin, or blood cells (leukemia or lymphoma) can also spread (metastasize) to the brain, causing metastatic brain cancer.\n" +
                "•\tprevious radiation to the head\n" +
                "•\timmune suppression i.e taking medication to suppress the immune system\n" +
                "•\texposure to vinyl chloride (a chemical used in making plastic)\n" +
                "\t\tThe exact cause of cancer is unknown. ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tdizziness\n" +
                "•\tvision changes (such as double vision)\n" +
                "•\tcoordination problems\n" +
                "•\tweakness or numbness on one side of the body\n" +
                "•\tseizures\n" +
                "•\tchanges in mood, senses, personality, or feelings\n" +
                "•\tmemory problems\n" +
                "•\tconfusion or trouble concentrating\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tFolic acid rich diet prevents spreading of cancer cells. It is found in spinach, leafy vegetables, beans, rice and fruits like oranges, berries, etc. \n" +
                "•\tMore fresh the fruits and vegetables, the greater it provides benefit. Fruits should be eaten in their natural raw form. Antioxidants are also present in skins of many fruits like apples, citrus.\n" +
                "•\tIndirubin  obtained from indigo plant is a herbal substance that is said to  beat the brain tumors. \n" +
                "•\tFresh juice prepared from broccoli, kale and spinach is a rich source of minerals, proteins, vitamins, and enzymes. Carrots, beets and cabbage juice are also effective.\n" +
                "•\tPrepare an extract by boiling 5-6 Brazilian pepper fruit in 300 ml of water for about an hour. Then, strain it and drink it two times a day for five to six months. This will progressively show improvements.\n" +
                "•\tAround 50 gm of Alchemilla vulgaris is mixed in 300 ml of water. Strain it and take two times daily up to six months.\n" +
                "•\tTake One tablespoon of Maitake mushroom and add in 300 ml of water. Take this extract twice a day for five months.\n" +
                "•\tTake five to eight wolfberries in your daily diet for 6 months.\n" +
                "•\tPrepare mixture by boiling five to eight leaves of ligusticum porteri in 300 ml of water for half an hour. Strain this mixture and drink for five to six months.");

    }
}

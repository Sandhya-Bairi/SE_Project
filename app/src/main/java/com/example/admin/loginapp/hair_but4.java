package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but4);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Chronic cold\n" +
                "• Sinusitis\n" +
                "• Faulty diet\n " +
                "• Mental worries\n" +
                "• Lack of vitamin B complex, iron, copper and iodine\n" +
                "• Heredity factors\n" +
                "• Dirty conditions of the scalp\n" +
                "• Using electric dryers\n" +
                "• Using concentrated hair dyes\n" +
                "• Nutritional deficiency\n" +
                "• Washing hair with ward water\n" +
                "• Chronic constipation\n" +
                "• Anemia, Hormonal imbalance\n" +
                "• Illness and infectious diseases\n• Stress and anxiety\n• Toxic / heavy metal poisoning\n" +
                "• Chemotherapy and radiation\n"+
                "• Insufficient kidney energy\n• Vitiligo\n• Thyroid disease\n• Folic acid deficiency");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Thinning of hair\n" +
                "• Loss of hair color before the age of 35\n" +
                "• Brittle hair\n" +
                "• Headache (if grey hair is the result of sinus/ nutritional deficiency)");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tOne of the best home remedies for premature graying of hair comprises of curry leaves. Include them in your daily diet. Alternatively, you can put some curry leaves in coconut oil and boil it. Strain the oil and let it cool down. Apply it over the scalp.\n" +
                "\n•\tDry a few pieces of ribbed gourd in the sun. Soak them in coconut oil for about 3 to 4 hours. After this, boil it until the residue becomes black and cool it down a bit. Massage the scalp with the residue.\n" +
                "\n•\tExtract juice from fresh leaves of amaranth vegetable. Apply this juice on the hair. It will prove helpful in retaining the black color of hair and also aid the growth of new hair.\n" +
                "\n" +
                "•\tMassage the scalp with butter made out of cow's milk. This should be applied at least two times in a week.\n" +
                "\n•\tIndian gooseberry is beneficial in treating premature graying of hair. Cut the fruit into pieces and dry them. Once dried, put them in coconut oil, until the solid matter becomes dusty or powdered. Apply on the hair.\n" +
                "\n•\tMix a tsp of Indian gooseberry juice with a tsp of almond oil and few drops of lime juice. Apply this mixture on your hair and keep it overnight. In the morning, wash the hair. This is an effective home remedy for treating premature graying of hair.\n" +
                "\n•\tAvoid having refined flour and sugar, soft drinks, pastries, jam, too spicy food, hot food, chilies and oily food.\n" +
                "\n•\tEat a lot of fresh fruits and vegetables. They are effective in treating premature graying of hair.\n" +
                "\n•\tMix a liter of yoghurt with a tablespoon of yeast. Have a bowl of this mixture before every meal, as it is effective in treating premature graying.\n");

    }
}

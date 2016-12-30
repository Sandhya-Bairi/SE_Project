package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class allergy_but9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_but9);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tDue to pet’s salivary glands and their urine.\n" +
                "•\tCoughing and wheezing \n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tRed, itchy eyes \n" +
                "•\tRunny, itchy, stuffy nose\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tVitamin E is good is also great for your dog's dry skin. You can give your dog a  massage by applying vitamin E oil directly to the skin, a soaking bath with vitamin E added to the water \n" +
                "•\tDeliciously plain yogurt is a healthy treat for your dog. Just as with humans, the live acidophilus in the yogurt keeps the good bacteria in your dog's intestines in balance\n" +
                "•\tSoaking your dog in an Epsom salt bath twice a day for five minutes isn't convenient or practical, a homemade heat pack using a clean towel drenched in the same warm-water solution can be applied to wounds for the same effect. \n" +
                "•\tUse baby oatmeal cereal or grind it yourself in a food processor. Stir the oatmeal into a bath of warm water and let your dog soak in the healing goodness. \n");
        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tBan the pet from your bedroom.\n" +
                "•\tWash your hands after touching the pet.\n" +
                "•\tRemove wall-to-wall carpeting and upholstered furniture. Wood or tiled flooring and clean walls help reduce allergens.\n" +
                "•\tSelect throw rugs that can be washed in hot water and wash them frequently.\n" +
                "•\tCover heating and air-conditioning vents with a dense filtering material such as cheesecloth.\n" +
                "•\tInstall an air cleaner.\n" +
                "•\tVacuum frequently with a HEPA filter vacuum.\n" +
                "•\tUse a face mask while dusting or cleaning.\n" +
                "•\tBathe your pet regularly (every six weeks or so).\n" +
                "•\tRecruit a non-allergic person to regularly remove dander and clean the litter box.\n");
    }
}

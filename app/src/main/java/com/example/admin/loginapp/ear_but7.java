package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ear_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_but7);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• due to cold, cough and sinus");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("\n•\tMake a spice-ginger tea by boiling together 1 heaping tablespoon each of dried oregano, cilantro, rosemary, sage, and cinnamon, plus 3 slices of fresh ginger in 4 cups of water for 15 minutes. Cover the pot to prevent steam from escaping as it boils. Strain, and drink 3 cups a day for at least 3 weeks.\n" +
                "\n•\tMake a bone marrow soup with organic sheep’s bones or calves’ bones. Cook 3 pounds bones in a large pot filled with 8 cups water with 1/3 cup each of black beans, kidney beans, and adzuki beans, 2 diced carrots, 2 diced celery stalks, 1 sliced onion, and 1/2 cup dried seaweed. Season with 1 teaspoon each turmeric, cumin, and black pepper. Do not use salt.\n" +
                "\n•\tBegin breathing slowly and rhythmically, inhaling deeply and gently and exhaling slowly.\n" +
                "\n•\tCover both ears with your palms, with the fingers of each hand pointing toward each other at the back of the head.\n" +
                "\n•\tInhaling, place your index fingers on top of your middle fingers and then snap them off, striking the back of the head on the depressions located behind the ears at the base of the skull, where the Wind Pond (GB-20) acupoints are located.\n" +
                "\n•\tRepeat continuously, with about one strike per second. On an exhale, continue striking the Wind Pond points with your index fingers while bending forward at the waist.\n" +
                "\n•\tTilt your head down.\n" +
                "\n•\tContinue breathing and striking for 20 to 30 seconds, until you’ve struck the points 36 times.\n" +
                "\n•\tConclude the exercise by rising back to the sitting position on your last exhalation.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tA balanced diet of smaller and more frequent meals with ample amounts of complex carbohydrates and organic animal proteins is a good start.\n"+
                "\n•\tAdding more warming foods, such asorganic chicken and lamb, can help strengthen the kidney yang energy.\n" +
                "\n•\tScallions, sesame seeds, fish, baked tofu, soybeans, walnuts, eggs, lentils, black beans, lotus seeds, ginger, and cinnamon bark are also helpful.\n" +
                "\n•\tAvoid cold and raw foods and icy beverages, as the coldness may constrict the eustachian tubes, causing poor drainage from the inner ears.\n" +
                "\n•\tMaintain a diet low in saturated fats, and eliminate fried and greasy foods.\n" +
                "\n•\tAvoid processed meats and dairy products, as they have a tendency to increase mucus production. Protein deposits similar to those in milk have been found in the inner ear of patients with partial hearing loss.\n");


    }
}

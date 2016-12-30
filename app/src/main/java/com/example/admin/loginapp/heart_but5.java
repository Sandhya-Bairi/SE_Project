package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class heart_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_but5);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tGetting older\n" +"•\tDamage to your heart from having a heart attack\n" +"•\tCoronary artery disease\n" +"•\tCertain medicines, including beta-blockers and calcium channel blockers\n" +"•\tHeart muscle diseases, such as sarcoidosis\n" +"•\tCertain infectious diseases, such as Lyme disease\n•\tOther diseases, such as rheumatoid arthritis and systemic lupus erythematosus\n" +"•\tConditions you're born with (congenital disorders )\n" +"•\tSurgery on your heart, such as operation on your heart valves\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tFeel dizzy \n" +"•\tFaint or nearly faint \n" +"•\tFeel short of breath and have chest pain \n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tSoak 1 teaspoon of fenugreek seeds in water overnight. The next morning, eat the soaked seeds along with the water on an empty stomach.\n" + "•\tDrink 2 to 3 cups of ginger tea daily. Make the tea by adding 1 teaspoon of grated ginger to a cup of hot water. Let it steep for 5 minutes, strain and add a little honey.\n•\tAdd 3 chopped garlic cloves to a cup of milk and boil it. Allow it to cool and drink it daily before going to bed.\n" +"•\tAdd 1 teaspoon of turmeric powder and a little honey to a glass of warm milk. Drink it 1 or 2 times daily.\n" +"•\tMix the juice of 1 lemon in a glass of warm water, along with a little honey and black pepper powder. Drink it 1 or 2 times daily for a few weeks.\n•\tTake ginger juice, garlic juice, lemon juice, vinegar of equal quantity in a sauce pan and cook on medium heat for 30 mins. Keep mixing. Take it off heat, cool it completely. Add in 3 cups of honey and mix well. Pour this in a clean bottle and store in fridge. Drink 1 tblspn of this tonic, Empty Stomach in Morning. You can also have 1 tablespoon in afternoon and night.");

    }
}

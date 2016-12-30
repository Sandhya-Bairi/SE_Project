package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class heart_but7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_but7);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tEating large meals or lying down right after a meal\n" +
                "•\tBeing overweight or obese\n" +
                "•\tEating a heavy meal and lying on your back or bending over at the waist\n" +
                "•\tSnacking close to bedtime\n" +
                "•\tEating certain foods, such as citrus, tomato, chocolate, mint, garlic, onions, or spicy or fatty foods\n" +
                "•\tDrinking certain beverages, such as alcohol, carbonated drinks, coffee, or tea\n" +
                "•\tSmoking\n" +
                "•\tBeing pregnant\n" +
                "•\tTaking aspirin, ibuprofen, certain muscle relaxers, or blood pressure medications\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tA burning pain or discomfort that may move from your stomach to your abdomen or chest, or even up into your throat\n" +
                "•\tRegurgitation-a sour or bitter-tasting acid backing up into your throat or mouth\n" +"•\tBloating\n" +"•\tBloody or black stools or bloody vomiting\n" +"•\tBurping\n" +"•\tDysphagia-a narrowing of your esophagus, which creates the sensation of food being stuck in your throat\n" +
                "•\tHiccups that don't let up\n" +"•\tNausea\n" + "•\tWeight loss for no known reason\n" +"•\tWheezing, dry cough, hoarseness, or chronic sore throat\n" +
                "•\t Chest pain\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tDrink a ½ cup of aloe juice, cool or room temperature, before meals. Keep in mind that aloe can act as a laxative, so unless you’re looking to fit in a few extra bathroom Sudoku puzzles, look for a brand that has the laxative component removed.\n" +"•\tAfter a meal, pop in a piece of sugar-free gum and chew for 30 minutes to help ward off heartburn.\n" +"•\tHeartburn tends to get worse at night Try elevating your head about 6 inches when you sleep by placing bricks, books, or blocks under the legs at the head of your bed. You could also try a wedge-shaped pillow under your mattress Don’t lie down within 3-4 hours after eating, because lying down with a full stomach makes stomach contents press harder against your lower esophageal sphincter.\n•\tMix either a ½ teaspoon or 1 single teaspoon of baking soda into a glass of water that is no more than 8 ounces. Give it a good stir and drink all of the mixture. You can repeat this as needed but should not exceed seven ½ teaspoon doses in a 24 hour period. Also, avoid using this as a remedy for more than a week straight, as it is high in salt and can have side effects such as swelling or nausea.");

    }
}

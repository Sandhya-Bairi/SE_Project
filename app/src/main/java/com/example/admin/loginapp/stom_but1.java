package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class stom_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stom_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tAppendicitis\n" +
                "•\tCeliac disease (severe sensitivity to gluten from wheat and other grains that causes intestinal damage)\n" +
                "•\tColorectal cancer, gastric cancer, and pancreatic cancer\n" +
                "•\tDiverticulitis and diverticulosis\n" +
                "•\tFood poisoning\n" +
                "•\tGallstones\n" +
                "•\tGastroesophageal reflux disease (GERD)\n" +
                "•\tInflammatory bowel disease (includes Crohn’s disease and ulcerative colitis)\n" +
                "•\tIntestinal obstruction\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tAbdominal pain\n" +
                "•\tAbdominal swelling, bloating or distention\n" +
                "•\tBelching\n" +
                "•\tBurning in the throat\n" +
                "•\tConstipation\n" +
                "•\tDiarrhea\n" +
                "•\tGas and flatulence\n" +
                "•\tIndigestion\n" +
                "•\tNausea\n" +
                "•\tReflux\n" +
                "•\tVomiting\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tTo improve digestion and prevent digestive problems, you must include ginger in your diet. It is effective for preventing and reducing nausea, vomiting, flatulence, indigestion, bloating and diarrhea. Drink 2 to 3 cups of ginger tea daily.\n" +
                "\n•\tYou can take probiotic supplements include Greek yogurt, kefir, miso, sauerkraut, kimchi, tempeh, buttermilk and sour pickles.\n" +
                "\n•\tDrink peppermint tea once or twice a day. To make the tea, add 1 teaspoon of dried peppermint leaves to a cup of hot water. Cover and steep for 10 minutes. Strain and drink it.\n" +
                "\n•\tChew 1 teaspoon of fennel seeds after eating your meal to aid digestion.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tQuit smoking\n" +
                "•\tAvoid alcohol use\n" +
                "•\tCut high-fat and acidic foods from your diet\n" +
                "•\tEat a high-fiber, healthy diet\n" +
                "•\tExercise lightly five days each week\n" +
                "•\tAvoid daily aspirin use\n");
    }
}

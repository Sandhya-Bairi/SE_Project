package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class diabetes_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_but2);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tLiquorice root alleviates symptoms of low blood sugar. Cut the root in pieces and add to boiling water and boil this for five minutes, drink this once a day. Person with high blood pressure should avoid liquorice as it is known to increase blood pressure.\n" +
                "\n•\tApples are very effective for people with low blood sugar as it is rich in chromium and magnesium,\n" +
                "\n•\tWild yam is a very effective natural cure for low blood sugar. Yam should be boiled in water and left for an hour before drinking. The dried powdered root can be made into a paste, and this paste should be added to milk or a glass of warm water and consumed.\n" +
                "\n•\t Take a little molasses and add to a glass of warm water, drink this at least twice daily to improve blood sugar level.\n" +
                "\n" +
                "•\t Drinking tomato juice, twice daily, for two weeks, is very effective way to alleviate pancreatic disorders which cause low blood sugar.. Fresh tomatoes also can be included in the diet for better results.\n" +
                "\n•\tPumpkin seeds help in regulating the blood sugar level and is effective in treatment of Hypoglycemia. Powder pumpkin seeds and mix in a glass of milk or warm water and drink for beneficial results.\n" +
                "\n•\tBarley is a first-rate food for patients with low blood sugar. It has magnesium and beta-glucan which helps in regulating glucose absorption in blood.\n" +
                "\n•\tAn ideal diet for low blood sugar patient should be well balanced with enough nuts, fruits and fresh vegetables and carbohydrates. Seeds and nuts should be taken in raw form, grains should be cooked.\n" +
                "\n•\tThe diet should be supplemented with dairy products and substitutes (for proteins), bread and whole grain substitutes (for carbohydrates and dietary fiber) and vegetables or fresh fruit (for fiber and antioxidants).\n" +
                "\n•\t Chromium helps stabilize blood sugar both I case of hypo and hyperglycemia. Foods rich in chromium such as brewer’s yeast, potatoes, peas, oysters, whole wheat bread, shredded wheat breakfast cereal, rye bread and wheat germ are to be taken.\n" +
                "\n" +
                "•\t Proteins provide the body with a more consistent source of energy that sugar or fat. Keep Nuts, seeds, roasted soy beans and cheese handy to fill your protein needs on the go. \n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tA regular exercise program can produce positive changes in the lipid profile, reduce blood pressure and weight\n" +
                "\n•\t With careful manipulation of insulin doses and home monitoring of blood glucose levels, exercise need not adversely affect glycemic control.\n" +
                "\n•\t The metabolic and cardiovascular benefits that result from a sensible exercise program can greatly improve the quality of life for most diabetic patients.\n");
    }
}

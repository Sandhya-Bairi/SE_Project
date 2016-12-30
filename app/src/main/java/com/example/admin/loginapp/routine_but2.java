package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class routine_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_but2);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\t\tBREAKFAST\n" +
                "Kick start your metabolism by including protein at breakfast, choose from eggs, salmon, lean ham or low-fat dairy. We burn more calories digesting protein rather than carbs so, by making your breakfast a protein one, you'll be revving up your metabolism you'll eat fewer calories the rest of the day.\n" +
                "A protein breakfast needn't take any longer to prepare - top your morning toast with a scrambled egg, a slice of smoked salmon or some lean ham and when you do have a little more time enjoy an omelette or frittata.\n" +
                "Whatever you do don't skip breakfast as this sets your blood sugar off on a roller coaster, which means you'll end up choosing the wrong foods later in the day. Remember breakfast makes an important contribution towards your daily intake and it plays a key role in maintaining a healthy weight.\n" +
                "\n•\t\tMID-MORNING SNACK\n" +
                "Eating little and often is the ideal way to manage your blood sugar levels - this doesn't mean you'll be eating more but spreading your day's intake evenly throughout the day. Make every snack count with nourishing options that supply both the 'pick me up' you need while topping up your five-a-day. Swap your morning biscuits for oatcakes spread with peanut or almond nut butter and a banana or have a tasty dip with veggie sticks.\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\t\tLUNCH\n" +
                "Make lunch a mix of lean protein and starchy carbs. Carb-rich foods supply energy and without them you'll suffer that classic mid-afternoon slump. The key is to choose carbs that produce a steady rise in blood sugar, which means passing on the sugary 'white' foods and going for high fibre whole-grains which help you manage those afternoon munchies. Opt for an open rye-bread sandwich topped with salmon, chicken or low-fat dairy as well as plenty of salad or choose whole-grain toast topped with baked beans.\n" +
                "•\t\tMID-AFTERNOON\n" +
                "Satisfy that sweet craving and the need for energy with fruit. A handful of dried fruit combined with unsalted nuts or seeds, provides protein and healthy fats to keep you satisfied till supper.\n" +
                "Swap your chocolate or cereal bar for a handful of dried apple rings with a few almonds or walnuts. Alternatively stock your fridge with plenty of low calorie nibbles like cherry tomatoes, grapes and vegetable crudités, which will prevent you reaching for the biscuit tin when you fancy something sweet or crunchy.\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\t\tDinner\n" +
                "Don't curfew carbs - they're low in fat, fibre-rich and help you relax in the evening. Combine them with some healthy essential fats the ones you find in oily fish like salmon, mackerel and sardines as well as nuts, seeds and their oils. Your body can use these healthy fats overnight for regeneration and repair, which is important for maintaining healthy skin and hair.\n" +
                "Fill half your plate with a colourful variety of vegetables or salad, drizzle with a dressing made from flaxseed or rapeseed oil and add meat, fish or beans with brown rice, quinoa or wholemeal pasta.\n");

    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class routine_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_but1);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\t\t6:30 – 7:00 am: \n Drink two cups of warm water with lemon each morning. This increases the flow of digestive juices, helps to cleanse the body, and resets our pH balance, which helps reduce the risk of disease. Take one or two probiotic capsules for immunity, estrogen detoxification, and improved digestion. Ensure to select a brand with at least 10 to 15 billion cells per capsule. \n" +
                "\n•\t\t7:00 – 7:30 am:\n Do 30 minutes of cardiovascular exercise on an empty stomach. This will reduce elevated morning cortisol levels and burn extra body fat.\n" +
                "\n•\t\t 7:30 – 7:45 am:\n Enjoy a smoothie for breakfast each morning during the work week. In a blender, combine a whey protein isolate or vegan protein powder, one tablespoon natural almond butter, 1 tablespoon ground flaxseed, 1/2 cup of frozen berries, and water. Turn it into a power smoothie by adding one of these: lecithin, cinnamon, greens powder, or unsweetened cocoa powder. If you need to, skip the berries and put it in a shaker cup and drink it during the day. Consume your nutrient essentials, such as a high-quality multivitamin, vitamin D. \n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tDuring your day: Have a snack that contains protein at mid-morning and mid-afternoon each day. Pack two snacks and a lunch for the office each day. Options can include a small apple with some almonds, a boiled egg, tomatoes with balsamic dressing and a piece of feta cheese, hummus with veggie sticks and 4% Allegro cheese, or a protein bar that has a nutritional balance of 40:30:30 or 40:40:20. Ensure you are eating every three hours, and aim to never miss your afternoon snack. Studies show individuals who eat four times per day enjoy greater weight loss. Eating regularly will avoid blood-sugar highs and lows that can affect your mood and energy.\n" +
                "\n•\tKeep a 1.5 L bottle for water on your desk and fill it each morning, keeping in mind that you should finish it by the end of the day. Fill a thermos or a nice teapot with hot water, put in three or four green tea bags and let it steep. Drink the tea throughout the day in addition to your water. Be sure to steep your green tea to allow the active ingredients to reach full potency.\n" +
                "\n•\tGet in a workout: Aim to do a 30-minute, high-intensity resistance-training circuit three times each week to maintain metabolically active muscle and improve insulin sensitivity. Be sure to follow up your workout with a sugar-free drink that includes amino acids and antioxidants, which aid energy, exercise recovery, insulin balance, and cellular repair.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("\n•\t\t6:00 – 8:00 pm:\n Eat your hormonally balanced dinner before 8pm to avoid weight gain — earlier is better. Your plate should include lots of fibrous carbohydrates, made up of one-third salad and one-third veggies. The other third should be your protein. Your fats may fall on top of your carbohydrate selections (as an olive oil or salad dressing, for instance). Including a starchy carbohydrate like brown rice, sweet potato, or squash (about ½ a cup) once a day with your evening meal — rather than your lunch or breakfast — in order to boost serotonin levels and help you sleep. This simple habit will also help to maintain consistent energy throughout the day, but still some of you may prefer having your starch at lunch. Take your second dose of two to four omega-3 fish oil capsules with this meal.\n" +
                "\n•\t\t9:30 – 10:00 pm:\n Spend some time alone, even if it is just 15 minutes, to breathe deeply, meditate, ponder, review your goals, or write in a journal to wind down before bed and collect your thoughts. Designate this time as your time daily.\n" +
                "\n•\t\t10:30 – 11:00 pm:\n Aim to get to bed before 10 or 11pm, sleeping in a darkened room for optimal recovery and to maximize the release of melatonin and growth hormone. Most sleep experts agree that seven to eight hours a night is optimal. However, some people may require more or less sleep than others. If you wake without an alarm and feel refreshed when you get up, you’re likely getting the right amount of sleep for you.\n");
    }
}

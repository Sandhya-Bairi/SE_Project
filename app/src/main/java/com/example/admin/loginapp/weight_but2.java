package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class weight_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_but2);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tEat protein to gain muscle- If your goal is to put on muscle mass, then you need to be eating protein rich foods on a regular basis. It's especially good to eat protein after a workout. Lean meats (such as chicken, lean pork, and fish), eggs, beans, and lentils are all great sources of protein, as well as yogurt and nuts\n" +
                "\n•\tStir in protein powder to your yogurt, oatmeal, and other foods to add a protein and calorie boost\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("•\tAdd calorie-dense foods to your meals. Try adding full-fat cheese to the top of your meals. Stir some peanut butter and honey into your oatmeal. These foods are high in calories and can help you increase your overall caloric intake\n" +
                "\n•\tEat complex carbohydrates, such as brown rice, bulgur, barley, whole grains, and quinoa. Avoid simple carbs like white flour, sugar and white rice\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tUse milk powder. Instant milk powder is a simple way to beef up dishes, from casseroles to soup. Simply stir in the powder while you're cooking. Wait for it to dissolve before you serve the dish. \n•\tEat healthy oils and fats. Healthy oils, such as olive oil, avocado, and nuts, are rich in nutrients as well as high in calories. Adding a dash of oil to a salad or topping your meal with some sliced avocado is an easy way to increase calories.\n" +
                "\n•\tFor instance, if you're enjoying some mashed potatoes, stir in some olive oil to make them creamier. For a quick mid-afternoon snack, a handful of almonds or peanuts is a good option.\n" +
                "\n•\tSeeds such as sunflower and pumpkin seeds have a high level of calories and also contain \"good\" fats that raise your good cholesterol levels.[9]\n" +
                "\n•\tUse coconut oil sparingly. Although it does boost your \"good\" cholesterol levels, it is 90% saturated fat and too much of it could cause health issues\n");
        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\tFor instance, you can mix dried fruit, chocolate chips (dark is best), rolled oats, and a nut butter. Make them into golf-ball size portions, and store them wrapped individually in parchment paper or wax paper. \n" +
                "\n•\t Sometimes, eating all day long can fill you up, and you don't get enough calories to gain weight. However, if you get some of your calories in liquid form, you won't feel as full. \n" +
                "\n•\tYou want to skip sodas, which don't offer much nutrition. Instead, drink smoothies, liquid yogurt, and even fruit juice, all of which have calories and nutrients. \n" +
                "\n•\tDrinking water or any beverage before eating can fill you up. You want to leave room for the calories you need to consume. \n" +
                "\n•\tInstead of drinking water before you eat, try drinking a calorie-rich drink while eating, such as fruit juice or a smoothie. \n" +
                "\n•\tLifting and weight training help your body gain muscle weight, which is the best kind of weight for your body to put on. Start off slowly if you aren't used to doing this kind of training. Increase weight and decrease reps as you go along\n" +
                "\n•\tIn addition, exercise increases your appetite, making you want to eat more. \n" +
                "\n•\tYou can also try exercises such as swimming, biking, or doing push-ups.\n");
        TextView txtDetails5 = (TextView) findViewById(R.id.txtDetails5);
        txtDetails5.setMovementMethod(new ScrollingMovementMethod());
        txtDetails5.setText("\n•\tIdentify why you lost weight. If you are trying to gain weight back that you lost, you should first identify why you lost the weight. If you haven't seen a doctor, you should, as unexplained weight lost can point to any number of diseases, from an overactive thyroid gland to diabetes. \n" +
                "\n•\tTreat the underlying disease. If a disease caused you to lose weight, treating that disease may help you gain the weight back. Talk to your doctor about an appropriate treatment for whatever plagues you, as well as what treatment would be effective to help you gain weight and what the most effective way is for you to gain weight. \n•\tMake sure to eat balanced meals with protein, whole grains, vegetables, and fruit. Fish is a great protein that is high in nutrients. Don't forget bright-colored vegetables, leafy greens, and also include dairy in your diet, as well.");
    }
}

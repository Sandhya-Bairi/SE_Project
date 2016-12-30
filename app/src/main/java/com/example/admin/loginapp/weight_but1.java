package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class weight_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_but1);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\n1. Add Protein to Your Diet\n" +
                "Body burns calories when digesting and metabolizing the protein you eat, so a high-protein diet can boost metabolism by up to 80-100 calories per day .A high-protein diet can also make you feel more full and reduce your appetite. In fact, some studies show that people eat over 400 fewer calories per day on a high-protein diet. Even something as simple as eating a high-protein breakfast (like eggs) can have a powerful effect\n" +
                "\n2. Eat Whole, Single-Ingredient Foods\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("One of the best things you can do to become healthier is to base your diet on whole, single-ingredient foods. By doing this, you eliminate the vast majority of added sugar, added fat and processed food. Furthermore, eating whole foods also provides your body with the many essential nutrients that it needs to function properly.\n" +
                "\n3. Avoid Processed Foods\n" +
                "Processed foods are usually high in added sugars, added fats and calories.\n" +
                "\n4. Stock Up on Healthy Foods and Snacks\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("There are many healthy and natural snacks that are easy to prepare and take with you on the go. These include yogurt, whole fruit, nuts, carrots and hard-boiled eggs.\n" +
                "\n5. Limit Your Intake of Added Sugar\n" +
                "Eating a lot of added sugar is linked with some of the world’s leading diseases, including heart disease, type 2 diabetes and cancer. Minimizing your intake of added sugar is a great way to improve your diet.\n" +
                "\n6. Drink Water\n" +
                "Drinking water can help with weight loss i.e Drinking 0.5 litres of water may increase the calories you burn by 24–30% for an hour afterward. Drinking water before meals may also lead to reduced calorie intake, especially for middle-aged and older people.\n" +
                "\n7. Drink (Unsweetened) Coffee\n" +
                "Coffee drinking may support weight loss by increasing energy levels and the amount of calories you burn. Furthermore, black coffee is very weight loss friendly, since it can make you feel full but contains almost no calories.\n" +
                "\n8. Avoid Liquid Calories\n" +
                "Liquid calories come from beverages like sugary soft drinks, fruit juices, chocolate milk and energy drinks.\n" +
                "These drinks are bad for health in several ways, including an increased risk of obesity. \n" +
                "\n9. Limit Your Intake of Refined Carbs\n");
        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("Refined carbs are carbs that have had most of their beneficial nutrients and fiber removed. The main dietary sources of refined carbs are white flour, white bread, white rice, sodas, pastries, snacks, sweets, pasta, breakfast cereals and added sugar.\n" +
                "\n10. Fast Intermittently\n" +
                "Intermittent fasting is an eating pattern that cycles between periods of fasting and eating.\n" +
                "There are a few different ways to do intermittent fasting, including the 5:2 diet, the 16:8 method and the eat-stop-eat method.\n" +
                "Generally, these methods make you eat fewer calories overall, without having to consciously restrict calories during the eating periods.\n" +
                "\n11. Drink (Unsweetened) Green Tea\n");

        TextView txtDetails5 = (TextView) findViewById(R.id.txtDetails5);
        txtDetails5.setMovementMethod(new ScrollingMovementMethod());
        txtDetails5.setText("\nGreen tea is a natural beverage that is loaded with antioxidants. Drinking green tea is linked with many benefits, such as increased fat burning and weight loss.\n" +
                "\n12. Eat More Fruits and Vegetables\n" +
                "Fruits and vegetables are extremely healthy, weight-loss-friendly foods.\n" +
                "\n13. Count Calories Once in a While\n" +
                "Being aware of what you’re eating is very helpful when trying to lose weight.\n" +
                "There are several effective ways to do this, including counting calories, keeping a food diary or taking pictures of what you eat.\n" +
                "\n14. Use Smaller Plates\n" +
                "Some studies have shown that using smaller plates helps you eat less, because it changes how you see portion sizes.\n" +
                "\n15. Eat More Slowly\n" +
                "If you eat too fast, you may eat way too many calories before your body even realizes that you are full.\n" +
                "\n16. Replace Some Fat with Coconut Oil\n" +
                "Studies show that coconut oil they can boost your metabolism slightly, while helping you eat fewer calories. Note that this does not mean that you should add this fat to your diet, but simply replace some of your other fat sources with coconut oil.\n" +
                "\n17. Add Eggs to Your Diet\n" +
                "Eggs are the ultimate weight loss food. They are cheap, low in calories, high in protein and loaded with all sorts of nutrients.\n" +
                "\n18. Spice Up Your Meals\n" +
                "Chili peppers and jalapenos contain a compound called capsaicin, which may boost metabolism and increase the burning of fat\n" +
                "\n19. Get Enough Sleep\n" +
                "Getting enough sleep is incredibly important for weight loss, as well as to prevent future weight gain. This is partly because sleep deprivation disrupts the daily fluctuations in appetite hormones, leading to poor appetite regulation.\n" +
                "\n20. Eat More Fiber\n" +
                "Fiber-rich foods may help with weight loss. Make sure to increase your fiber intake gradually to avoid abdominal discomfort, such as bloating, cramps and diarrhea.\n" +
                "\n21. Do Some Sort of Cardio\n" +
                "Doing cardio — whether it is jogging, running, cycling, power walking or hiking — is a great way to burn calories and improve both mental and physical health.\n" +
                "\n22. Add Resistance Exercises\n" +
                "\n" +
                "If you lose a lot of muscle, your body will start burning fewer calories than before .By lifting weights regularly, you’ll be able to prevent this loss in muscle mass  \n" +
                "\n23. Use Whey Protein\n" +
                "Most people get enough protein from diet alone. However, for those who don’t, taking a whey protein supplement is an effective way to boost protein intake.\n" +
                "\n24. Practice Mindful Eating\n" +
                "\n" +
                "25. Mindful eating is a method used to increase awareness while eating. It helps you make conscious food choices and develop awareness of your hunger and satiety cues.\n" +
                "\n" +
                "26. Focus on Changing Your Lifestyle\n" +
                "Instead of focusing only on losing weight, make it a primary goal to nourish your body with healthy food and nutrients.\n");
    }
}

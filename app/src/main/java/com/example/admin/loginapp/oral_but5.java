package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class oral_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Mouth cancer occurs when cells on your lips or in your mouth develop changes (mutations) in their DNA.\n " +
                "• These mutations allow cancer cells to grow and divide when healthy cells would die.\n" +
                "• The accumulating mouth cancer cells can form a tumor. \n" +
                "• Also caused by the heavy alcohol use, excessive sun exposure to your lips.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• A sore, irritation, lump or thick patch in the mouth, lip, or throat\n" +
                "• A white or red patch in the mouth, A feeling that something is caught in the throat\n" +
                "• Difficulty chewing or swallowing, Difficulty moving the jaw or tongue\n" +
                "• Numbness in the tongue or other areas of the mouth,\n" +
                "• Swelling of the jaw that causes dentures to fit poorly or become uncomfortable,\n"+
                "• Pain in one ear without hearing loss");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Chewing 2-3 basil leaves daily is very effective in curing oral cancer within a very short time. You can also crush some leaves and then have 3 teaspoons of the powder. You should have it 2-3 times daily along with a glass of water. " +
                "➣ Coriander seeds can be consumed simply by chewing 5-6 seeds daily. Take a cup of water, boil it and then add 9-10 coriander seeds in it. After that heat it and steep it. Then strain it and drink 3-4 cups daily." +
                "➣ Chew some grape seeds daily or u can also crush some grape seeds and add it to a cup of water and drink it3-4 times daily\n" +
                "➣ Take some honey and mix it with some coconut milk and heat them well and then apply it on your gums and teeth, massage well for 20 -25 minutes.\n" +
                "➣ Take a lemon and rub it gently on the gums and teeth for 3-4 times daily\n" +
                "➣ Eat a lot of raspberries \n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Don't smoke or use any tobacco products and drink alcohol in moderation (and refrain from binge drinking).\n" +
                "• Eat a well-balanced diet, limit your exposure to the sun." +
                "• Repeated exposure increases the risk of cancer on the lip, especially the lower lip.");
    }
}

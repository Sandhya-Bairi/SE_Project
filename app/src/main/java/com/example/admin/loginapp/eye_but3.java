package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but3);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Accidental Injury\n • High Blood Pressure\n • Coughing\n • Eye Rubbing \n • Vitamin C deficiency");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("➣"+Html.fromHtml(getString(R.string.my_text1))+"\nYou need to place atleast ten jasmine flowers in a glass of water and leave it for 10 to 12 hours. Use a dropper to put 3 to 4 drops of this mixture in your affected eyes to get rid of blood vessel in eye.\n" +
                "\n➣"+Html.fromHtml(getString(R.string.my_text2)) +"\nKeep the cucumbers in a freezer and cut the chilled one into slices and place it on the eyelids for 10 to 15 minutes.\n " +
                "\n➣"+Html.fromHtml(getString(R.string.my_text3))+"\nFor this take a ice cube in a clean cloth and compress your eyes with it. You will get some relief from the pain and itching.\n" +
                "\n➣"+Html.fromHtml(getString(R.string.my_text4))+"\nApplying some honey on the eyes can help you to reduce the inflammation.\n" +
                "\n➣"+Html.fromHtml(getString(R.string.my_text5))+"\nLemon juice has antibiotic and anti-inflammatory properties. It is rich in vitamin C and can help your immune system to fight infection.One should dilute it with water so that it does not add to the irritation. Putting some diluted lemon juice on the eyelid can be effective in conjunctivitis.\n" +
                "\n➣"+Html.fromHtml(getString(R.string.my_text6))+"\nWarm compress on the eyelid can go a long way in reducing the inflammation. For this soak a clean piece of cloth in warm water, rinse the water and apply the cloth on the closed eye. Keep it there for some time. Repeat the process three to four times. You will get relief from the itch and pain.\n" +
                "\n➣"+Html.fromHtml(getString(R.string.my_text7))+"\nThis is a wonder herb commonly available at almost every home. It has a soothing effect, it is anti-inflammatory and is a good moisturizer. For benefit you need fresh aloe vera. Take out some aloe vera juice and dip a cotton ball in it.Now apply this juice over the affected eye. You can also use it as an eyewash. For this dissolve some aloe juice in boiled water, cool it and use it to wash the eyes.\n");

    }
}

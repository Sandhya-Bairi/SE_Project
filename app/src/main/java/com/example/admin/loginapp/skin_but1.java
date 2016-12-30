package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but1);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\t\tThe varicella-zoster virus causes the chickenpox infection. Most cases occur through contact with an infected person. The virus may be contagious several days before blisters appear, and it remains contagious until all blisters have crusted over. It is spread through:\n" +
                "• saliva\n" +
                "• coughing\n" +
                "• sneezing\n" +
                "• contact with blisters\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• fever\n" +
                "• headache\n" +
                "• loss of appetite\n" +
                "• rashes\n" +
                "• developing red or pink bumps all over your body\n" +
                "• bumps filled with fluid that leak\n" +
                "• bumps that scab over and begin to heal\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Baking Soda\nStir one-half tablespoon of baking soda in a glass of water. Use a soft washcloth to put the solution on the affected parts of the body and allow it to dry.\n" +
                "Another option is to mix one-half or one cup of baking soda in your bath water and soak in it. \n\n" +
                "➣ Indian Lilac(Neem)\nTake a handful of neem leaves, crush them and apply the paste on the affected areas. Adding neem leaves in bath water is also beneficial.\n\n" +
                "➣ Carrots and Coriander\nCut up 100 grams of carrots to get about a cup of chopped carrots and chop 60 grams or one and one- half cup of fresh coriander leaves and boil them in about two and one-quarter cup of water until half the amount of water evaporates.\n" +
                "Drink the soup once a day for about a month. You can also eat the boiled carrots and coriander leaves for added strength.\n\n" +
                "➣ Oatmeal\nGrind two cups of oatmeal into a fine powder.\n" +
                "Put the powdered oatmeal in two liters (one-half gallon) of lukewarm water.\n" +
                "Soak in the bathwater for 15 to 20 minutes.\n\n" +
                "➣ Brown Vinegar\nSimply add one-half cup of brown vinegar to lukewarm bathwater, and soak in the bath for about 10 to 15 minutes.\n\n" +
                "➣ Honey\nGet a good quality, pure honey and coat the affected area with it.\n" +
                "Repeat the process two to three times a day until the scars are gone.\n\n" +
                "➣ Herbal Tea\nPut one tablespoon of any of these herbs in a cup of boiling water. Let it steep for a few minutes and then strain it.\n" +
                "Add a little cinnamon, honey and lemon juice and sip the tea slowly.\n" +
                "Drink this herbal tea a few times a day for best results.\n\n" +
                "➣ Lavender oil\nDilute a little lavender essential oil with carrier oil like almond oil or coconut oil and apply it on the affected areas and leave it on until it dries. Repeat twice daily.\n" +
                "Add a few drops each of lavender and chamomile essential oils in lukewarm water and soak in this bath for about 10 minutes.\n\n" +
                "\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Get vaccinated for chickenpox." +
                "\n\n• Keep your immune system strong. " +
                "\n\n• Getting more sleep (or better quality sleep), eating more fresh fruit and vegetables, cutting down on refined sugars, reducing your alcohol consumption, quitting cigarette smoking, practicing good hygiene and light exercise ");


    }
}

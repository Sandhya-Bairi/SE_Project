package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class eye_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Face injury \n• Facelifts\n• Cosmetic Surgery\n• Jaw Surgery \n• Bug bites\n• Skin infection around the eyes\n• Allergic Reactions ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Swelling\n• Pain\n• Black, blue, red or greenish color around the eye\n• Blurred Vision \n• Inability to move the eye\n• Headache");

        TextView txtDetails3=(TextView)findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("• Apply an ice pack around the eye. This will numb the nerves, and you won’t feel the pain for some time. Repeat this remedy every hour." +
                "\n• Soak oatmeal in warm water and gently massage around the eye for 10-15 minutes. This will provide some relief in the pain. After the oatmeal massage, apply vitamin E oil. This remedy takes 3 days to heal the black eye." +
                "\n• Place witch hazel pads on the bruised eye. It will heal any kind of bruise in a couple of days." +
                "\n• Dab a cotton ball in hot water and apply it on the bruised eye. This will reduce the swelling from your eye." +
                "\n• Take a metal spoon and put it in the refrigerator. Take it out after a few hours and put the back part of the spoon on the bruised eye. This will work like an ice pack." +
                "\n• Eat pineapple or drink the juice of it. This will also help in healing the black eye fast." +
                "\n• Like pineapple, papaya also helps in reducing the swelling and pain." +
                "\n• Take the oil of arnica and apply it on the black eye. You can also use any cream, which contains arnica oil. This will cure the black eye really fast." +
                "\n• Take a raw potato and cut very thin slices. Put these slices in a refrigerator for like half an hour and place it on the black eye." +
                "\n• Cut thin slices of chilled cucumber and put it on the affected eye. This will provide help to the painful eye. This is a very good cure for the black eye." +
                "\n• Take a tea bag and soak it in warm water. Then, place warm tea bag on the black eye. Remember, tea bag should be warm when you place it on your eye. This will reduce swelling and provide relief in the pain. This is one of the best treatments for the black eye." +
                "\n• Make tea using comfrey roots and soak a cotton ball in it. Place it on the black eye and relax. Comfrey roots will soothe the nerves and the pain will be reduced. Or, you can make a paste of comfrey roots and apply it on the affected eye." +
                "\n• Take a plastic bag and put unpopped popcorn in it. Put it in the refrigerator and leave it for an hour or two. Then, place the chilled unpopped popcorn on the affected eye. This will also provide relief." +
                "\n• Eat an orange or drink orange juice. Orange contains vitamin C, which will help to prevent bruising." );


        TextView txtDetails4=(TextView)findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Do not put too much pressure on the eyeball.\n • Use 2 pillows instead of one while sleeping.\n• Take complete sleep for healthy eyes.\n" +
                "• Do not rub the eye.\n• Keep your chin upwards \n• Wear glasses if you are going out");
    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Interface33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface33);

        TextView txtDetails1=(TextView)findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Blurred vision\n" +
                "• Burning of the skin\n" +
                "• Convulsions\n" +
                "• Diarrhea\n" +
                "• Excessive sweating\n" +
                "• Fainting\n" +
                "• Increased thirst\n" +
                "• Loss of muscle coordination\n" +
                "• Nausea and vomiting\n" +
                "• Numbness and tingling\n" +
                "• Rapid pulse\n" +
                "• Severe pain\n" +
                "• Skin discoloration\n" +
                "• Bleeding and Swelling at the site of the bite\n");

        TextView txtDetails2=(TextView)findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("\n1. Keep the person calm. Reassure them that bites can be effectively treated in an emergency room. Restrict movement, and keep the affected area below heart level to reduce the flow of venom.\n" +
                "\n2. If you have a pump suction device ,follow the manufacturer's directions.\n" +
                "\n3. Remove any rings or constricting items, because the affected area may swell. Create a loose splint to help restrict movement of the area. Clean the wound and cover it with a dressing. \n" +
                "\n4. If the area of the bite begins to swell and change color, the snake was probably venomous.\n" +
                "\n5. Monitor the person's vital signs -- temperature, pulse, rate of breathing, and blood pressure -- if possible. If there are signs of shock (such as paleness), lay the person flat, raise the feet about a foot, and cover the person with a blanket.\n" +
                "\n6. Get medical help right away and bring in the dead snake only if this can be done safely. .\n");

        TextView txtDetails3=(TextView)findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("1. apply cold compresses to a snake bite.\n\n" +
                " 2. cut into a snake bite with a knife or razor.\n\n" +
                " 3. Try to suck out the venom by mouth.\n\n" +
                " 4. Give the person stimulants or pain medications unless a doctor tells you to do so.\n\n" +
                " \t\t Call 911 or your local emergency number if someone has been bitten by a snake. If possible, call ahead to the emergency room so that anti venom can be ready when the person arrives.\n");

        TextView txtDetails4=(TextView)findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Don't provoke a snake. That is when many serious snake bites occur.\n\n" +
                "• Tap ahead of you with a walking stick before entering an area where you can't see your feet. Snakes will try to avoid you if given enough warning.\n\n" +
                "• When hiking in an area known to have snakes, wear long pants and boots if possible\n\n");

        //TextView txtDetails5 = (TextView) findViewById(R.id.text2);
        //txtDetails5.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

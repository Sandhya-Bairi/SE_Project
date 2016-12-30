package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Interface35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface35);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tFirst assess the extent of injuries. \n" +
                "\n•\tCheck if the person is breathing and if he has a pulse.\n" +
                "\n•\tImmediately call for an ambulance or rush the person to a hospital.\n" +
                "\n•\tIf there is something obstructing the airway, use your index and middle finger to clear the airway.\n" +
                "\n•\tIf there is no pulse, start CPR . \n" +
                "\n•\tIf there is bleeding from the mouth or the patient is vomiting, turn the person to his/her side. Place the person’s arm that is under him straight out and the arm closest to you across his chest.\n" +
                "\n•\tIf there are extensive wounds, try to control the bleeding using pressure to the area using a cloth.\n" +
                "\n•\tIf the person’s neck is in an awkward position or the person is unconscious, do not move the patient. This could mean that the person’s neck is broken, don’t move the person\n" +
                "\n•\tUsually accident victims feel excessively cold due to shock. Therefore keeping them warm is essential to survival\n" +
                "\n•\t Do not give the person any water, food or other fluids through the mouth, it could lead to the patient choking.\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("1.\tIntense pain at the site of the injury that worsens with movement.\n" +
                "\n2.\tSwelling, numbness, or bluish color of the injured area.\n" +
                "\n3.\tDeformity of the limb or joint if the injury occurred in the arm or leg.\n" +
                "\n4.\tBone protruding through the skin.\n" +
                "\n5.\tHeavy bleeding at the injury site and shock.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tIf it is an open fracture, cover the wound with a sterile dressing and secure it with a bandage. Apply pressure around the wound to control any bleeding.\n" +
                "\n•\tSupport the injured body part to stop it from moving. This should ease any pain and prevent any further damage.\n" +
                "\n•\tOnce you’ve done this, call 999 or 112 for medical help. While waiting for help to arrive, don’t move them unless they’re in immediate danger.\n" +
                "\n•\tProtect the injured area by using bandages to secure it to an uninjured part of the body to stop it from moving. If they lose consciousness at any point, open their airway, check their breathing and prepare to treat someone who’s become unconscious.\n");
        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("Step 1: Rest\n" +
                "Ankle sprain - Rest\nHelp them to sit or lie down and support in a comfortable raised position the part they’ve hurt.\n");
        TextView txtDetails5 = (TextView) findViewById(R.id.txtDetails5);
        txtDetails5.setMovementMethod(new ScrollingMovementMethod());
        txtDetails5.setText("\nStep 2: Ice\nTo cool the area, apply a cold compress, like an ice pack or cold pad. This will help to reduce " +
                "the swelling, bruising and pain. Do not leave on for more than ten minutes.\n\nStep 3: Comfortable support\n" +
                "Ankle sprain comfortable support\nLeave the cold compress in place or wrap a soft layer of padding. Tie a " +
                "support bandage around it, which goes up as far as the next joint\n" +
                "\nStep 4: Elevation\n" +
                "Elevate the injured ankle\nElevate the injury and support it with something soft, like cushions.");


    }
}

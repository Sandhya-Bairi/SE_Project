package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Interface31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface31);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\t\tIf a person is unconscious but breathing, place them in the recovery position until help arrives. " +
                "Keep them under observation and don't obstruct their airway.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("\n\t\tIf a person isn't breathing normally after an incident, call an ambulance" +
                " and start CPR straight away. \n\tUse hands-only CPR if you aren't trained to perform rescue breaths.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•anaphylaxis \n•bleeding\n•drowning \n•poisoning\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("\n\tIt is a severe allergic reaction that can occur after an insect " +
                "sting or after eating certain foods. Reaction can be very fast.");

        TextView txtDetails5 = (TextView) findViewById(R.id.txtDetails5);
        txtDetails5.setMovementMethod(new ScrollingMovementMethod());
        txtDetails5.setText("\t\tFirst Aid:\n 1.During anaphylactic shock, it may be difficult for the person to breathe, as their tongue and throat may swell.\n" +
                "\n2. Check if the person is carrying any medication. Some people who know they have severe allergies may carry an adrenaline self-injector. Casualties who have had an intramuscular injection of adrenaline must be checked by a healthcare professional as soon as possible after the injection.\n" +
                "\n3. Make sure they're comfortable (sitting upright)\n");

        TextView txtDetails6 = (TextView) findViewById(R.id.txtDetails6);
        txtDetails6.setMovementMethod(new ScrollingMovementMethod());
        txtDetails6.setText("If something is embedded:\n" +
                "\nTake care not to press down on the object. Instead, press firmly on either side of the object and build up padding around it " +
                "before bandaging, to avoid putting pressure on the object itself.\n" +
                "If nothing is embedded:\n" +
                "\n•Apply and maintain pressure to the wound with your gloved hand, using a clean pad or dressing if possible; continue to apply pressure until the bleeding stops. \n" +
                "\n•Use a clean dressing to bandage the wound firmly.\n" +
                "\n•If bleeding continues through the pad, apply pressure to the wound  until the bleeding stops and then apply another pad over the top. \n" +
                "\n•If a body part, such as a finger, has been severed, place it in a plastic bag or wrap it in cling film and make sure it goes with the casualty to hospital.\n" +
                "\n•Always seek medical help for bleeding unless it's minor.\n" +
                "\n•In certain situations, where bleeding is very severe and from the body’s extremities, such as the head, neck and torso, it may be appropriate to use haemostatic dressings or a tourniquet which contain properties that help the blood to clot quicker. A tourniquet is a band that's wrapped tightly around a limb to stop blood loss. Haemostatic dressings and tourniquets should only be used by people who have been trained to apply them.\n");

        TextView txtDetails7 = (TextView) findViewById(R.id.txtDetails7);
        txtDetails7.setMovementMethod(new ScrollingMovementMethod());
        txtDetails7.setText("First Aid:\n" +
                "\n•\tOnce the person is on land, if they're not breathing, open the airway and give five initial rescue breaths before starting CPR. If you're alone, perform CPR for one minute before calling for emergency help.\n" +
                "\n•\tFind out how to give CPR, including rescue breaths.\n" +
                "\n•\tIf the person is unconscious but still breathing, put them into the recovery position with their head lower than their body and call an ambulance immediately.\n" +
                "\n•\tContinue to observe the casualty\n");
        TextView txtDetails8 =(TextView) findViewById(R.id.txtDetails8);
        txtDetails8.setMovementMethod(new ScrollingMovementMethod());
        txtDetails8.setText("First Aid:\n" +
                "\n•\tFind out what's been swallowed, so you can tell the paramedic or docto.\n" +
                "\n•\tDo not give the person anything to eat or drink unless advised \n" +
                "\n•\tDo not try to cause vomiting.\n" +
                "\n•\tStay with the person.\n" +
                "\n•\tCheck for breathing, perform CPR if necessary.\n" +
                "\n•\tDon't perform mouth-to-mouth resuscitation if the casualty's mouth is contaminated with the poison.\n" +
                "\n•\tDon't leave them if they're unconscious it could cause them to vomit which finally results in chocking.\n" +
                "\n•\tIf the casualty is conscious and breathing normally, put them into the recovery position and monitor breathing\n");

    }
}

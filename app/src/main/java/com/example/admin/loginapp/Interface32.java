package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Interface32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface32);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("1.STOP BURNING IMMEDIATELY:\n• Put out the fire\n•Help the person to smother flames\n" +
                "•Remove smouldering material from the person. \n•Remove hot or burnt clothing \n" +
                "2.REMOVE CONSTRICTIVE CLOTHING IMMEDIATELY:\n•Take off jewellery, belts, and tight clothing. Burns can swell quickly.\n ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• Injuries are mild but pain develops\n• No blisters seen \n• Burnt area becomes white\n");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•Remove patient from heat source\n" +
                "•Remove the burnt clothing\n" +
                "•Run cool water over burnt are\n" +
                "•Gently clean the injured area and dry\n" +
                "•Apply anti biotic such as Silver Sulphadiazine\n" +
                "•Use a sterile bandage to cover burns\n•Take tetanus vaccination, if required\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("•\t Burns extends to middle skin layer,may turn white with swellling \n" +
                "•\t Swelling, redness and pain observed\n" +
                "•\t Blisters may develop, that ooze a clear fluid \n" +
                "•\t Restricts movement and dehydration may occur\n ");

        TextView txtDetails5 = (TextView) findViewById(R.id.txtDetails5);
        txtDetails5.setMovementMethod(new ScrollingMovementMethod());
        txtDetails5.setText("•Clean the affected area thoroughly\n" +
                "•Gently dry\nSkin graft and physical theraphy may be required\n" +
                "•Apply antibiotic cream over affected area\n•Splints may be used to rest affected joints \n•Hospitalization is essential\n");

        TextView txtDetails6 = (TextView) findViewById(R.id.txtDetails6);
        txtDetails6.setMovementMethod(new ScrollingMovementMethod());
        txtDetails6.setText("• Damage occurs to all 3 skin layers\n" +
                "•Destroys adjacent hair follicles,sweat glands,nerve endings beacuse of which there is no pain\n•Injured area does not turn white on touch and no blisters\n" +
                "•Disfigurement may be there\n" +
                "•Swelling occurs\n" +
                "•Skin develops leathery texture and discoloration \n");

        TextView txtDetails7 = (TextView) findViewById(R.id.txtDetails7);
        txtDetails7.setMovementMethod(new ScrollingMovementMethod());
        txtDetails7.setText("•\t Requires immediate hospital care \n" +
                "•\t Dehydration treated through intravenous fluid supply and oxygen is administered \n•Periodically run clean cool water over burns \n" +
                "•\t Nutritious diet helps to heal quickly \n");

        TextView txtDetails8 = (TextView) findViewById(R.id.txtDetails8);
        txtDetails8.setMovementMethod(new ScrollingMovementMethod());
        txtDetails8.setText("•\tInstall smoke alarm in your home \n•Avoid synthetic clothing while cooking \n");

        TextView txtDetails9 = (TextView) findViewById(R.id.txtDetails9);
        txtDetails9.setMovementMethod(new ScrollingMovementMethod());
        txtDetails9.setText("https://www.youtube.com/watch?v=CJt7XySKqYI\n" +
                  "https://www.youtube.com/watch?v=2pVGG09VmfQ\n");
    }
}

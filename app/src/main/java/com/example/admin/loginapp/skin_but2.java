package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class skin_but2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_but2);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• Nickel, which can be found in jewelry, belt buckles, and metal buttons on jeans\n" +
                "• Perfumes found in cosmetics\n" +
                "• Clothing dyes, hair dye, latex, adhesives, soaps and cleaning products\n" +
                "• poison ivy and other plants\n" +
                "• antibiotic creams or ointments that are used on the skin, such as neomycin\n");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• itching\n" +
                "• a burning sensation or pain\n" +
                "• red bumps that may ooze, drain, or crust\n" +
                "• warm, tender skin, scaly, raw, or thickened skin, dry, red, or rough skin\n" +
                "• inflammation, cuts, rash");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("➣ Apply a thin layer of coconut oil or a coconut oil lotion bar  which helps cool eczema itching and pain" +
                "\n➣ You will need…\n" +
                "\t\t- Roughly 1 cup of oatmeal\n" +
                "\t\t- Cheesecloth, muslin, or something similar\n" +
                "\t\t- A bathtub\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("• Pour the oatmeal into some cheesecloth or muslin and tie it off securely into a little bundle." +
                "• Tie an extra-long piece of material around the top. " +
                "• Fill the tub part way and then use the extra piece to hang the bag right below the faucet. " +
                "• Run the bath until it’s full and the water is milky and smooth. " +
                "• Soak for 10-15 minutes before getting out, patting gently dry with a lean towel, and applying your usual moisturizer. " +
                "• Feel free to just let the bag float in the water after the tub is filled-you can give it a squeeze now and then to" +
                " get even more of the good stuff out.");
    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hair_but5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_but5);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("• The cause of alopecia areata(hair loss in patches) is probably an autoimmune reaction." +
                "\n\t\t This means the body's immune system incorrectly attacks the body's own cells. " +
                "In the case of alopecia areata, the cells under attack are in the hair follicles " +
                "(structures that grow hair), especially follicles within the scalp.");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("• hair loss in small round patches\n" +
                "• you will notice clumps of hair on your pillow or in the shower\n" +
                "• hair loss on other parts\n" +
                "• Tingling area where the hair has been lost.\n" +
                "• Uneven loss of hair, usually on one side of the scalp," +
                " happening over a short period of time\n" +
                "• Healthy hair near the bald patches can be pulled out easily\n" +
                "• your fingernails may develop pitting\n" +
                "• Hair narrows as it gets closer to the scalp, resulting in an “exclamation point” appearance.");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tApply onion juice directly on the scalp\n" +
                "\n" +
                "•\tVegetables such as potatoes, peppers, and cucumbers are commonly turned to to reduce hair loss, primarily due to the high silicon content found in their skins. Silicon is known to strengthen both hair and nails\n" +
                "\n" +
                "•\tApply a paste of gram flour mixed with coconut milk on to the scalp\n" +
                "\n" +
                "•\tDip a cloth into green tea and wipe or dab the bare patches of your scalp\n" +
                "•\tApply the oil mixed with hibiscus flower petals\n" +
                "•\tApply fenugreek seeds paste\n");
    }
}

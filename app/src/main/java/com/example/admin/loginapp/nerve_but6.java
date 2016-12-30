package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class nerve_but6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nerve_but6);

        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("•\tA variety of different types of autoimmune diseases can produce symptoms of nerve pain and nerve damage which include multiple sclerosis, Guillain-Barré syndrome (a condition in which the immune system attacks the peripheral nerves), myasthenia gravis, lupus and inflammatory bowel disease\n•\tCancer can cause nerve pain and nerve damage in multiple ways. In some instances, cancerous masses may push against or crush nerves. \n" +
                "•\tAdditionally, chemotherapy and radiotherapy may produce nerve pain and nerve damage in certain individuals.\n•\tAnything that results in trauma or compression of nerves can result in nerve pain and nerve damage.\n" +
                "•\t About 50% of people with diabetes suffer from nerve damage, which becomes more likely as the disease progresses. \n" +
                "•\tVarious substances like medications, such as chemotherapy for cancer and certain drugs used to treat HIV. Toxic substances that may be ingested accidentally, including lead, arsenic and mercury, may also cause damage to your nerves.\n" +
                "•\tDeficiencies of certain nutrients, including vitamins B6 and B12, may produce symptoms of nerve pain and nerve damage, including weakness or burning sensations.\n");
        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("1.Eat Vitamin-Enriched Food \n" +
                "2. Yoga, meditation, aerobics can be helpful in keeping the nervous system healthy. Pranayam, a breathing exercise, is the best way to prevent nervous weakness. But remember not to practice it immediately after a meal.\n" +
                "3. Ginseng and ashwagandha, which are helpful in relieving stress, is one of the best herbal remedies for nervousness.\n" +
                "4. Ensure that diet includes milk and milk products, fish and meat, and dry fruits like cashew nuts, almond, and pumpkin seeds. Also include green leafy vegetables and sprouts in your diet. \n" +
                "5. Eat ample amount of berries as they contain iron, sodium, phosphorus and helps in strengthening our nerves.\n" +
                "6.Drink plenty of water to avoid dehydration.\n");
        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("•\tMaintain good posture.\n" +
                "•\tIncorporate strength and flexibility exercises into your regular exercise program.\n" +
                "•\tLimit repetitive activities, and take frequent breaks when engaging in these activities. \n" +
                "•\tMaintain a healthy weight.\n");
    }
}

package com.example.admin.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class recepies_but1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies_but1);
        TextView txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails1.setMovementMethod(new ScrollingMovementMethod());
        txtDetails1.setText("\tPlain salads can be prepared easily by mixing all the fruits diced in cubes, a pinch of salt and pepper to taste. ");

        TextView txtDetails2 = (TextView) findViewById(R.id.txtDetails2);
        txtDetails2.setMovementMethod(new ScrollingMovementMethod());
        txtDetails2.setText("\tYogurt salads can be prepared by mixing all fruit diced with a cup of plain yogurt and a half tablespoon of oregano with some chopped mint leaves. ");

        TextView txtDetails3 = (TextView) findViewById(R.id.txtDetails3);
        txtDetails3.setMovementMethod(new ScrollingMovementMethod());
        txtDetails3.setText("\tMayonnaise salads can be prepared by mixing four spoons of mayonnaise to the diced fruits with some pepper to the taste. \n" +
                "•\tMayonnaise can be prepared in home. Bring milk to a boil and add a tablespoon of all-purpose –flour (maida) to a cup of water and mix it well without lumps and then just add this mixture to the boiled milk and stir it continuously to avoid forming lumps and add salt to taste. Cook it till you get a nice smoothie, consistence.\n");

        TextView txtDetails4 = (TextView) findViewById(R.id.txtDetails4);
        txtDetails4.setMovementMethod(new ScrollingMovementMethod());
        txtDetails4.setText("a.\tPlain juices can be made by chopping any fruit like orange, straw berry, grapes, pomegranate, apple, banana, pineapple, mango, guava etc. or vegetables like carrot, beet root, tomato, lemon etc. and blend them with some water. If you wish u can add 10-12 mint leaves while blending\n" +
                "b.\tMixed juices can be made in the similar way but use combinations of i) carrot, orange, beet root, ii) tomato, orange, apple, iii) lemon, pineapple, grapes.\n");

        TextView txtDetails5 = (TextView) findViewById(R.id.txtDetails5);
        txtDetails5.setMovementMethod(new ScrollingMovementMethod());
        txtDetails5.setText("Take 2-3 eggs in a bowl, add some black pepper, salt and beat it and put that mixture in a hot sauce pan, wait for a minute and then just scramble it from edges to the center and let it cook for a minute. Take 2 slices of wheat bread and apply some butter on one side of 2 slices, then just put the scramble egg mixture on to one slice and put some lectus leaves on to it and cover it with another bread slice. You can toast it or you can directly have it with mayonnaise.");

        TextView txtDetails6 = (TextView) findViewById(R.id.txtDetails6);
        txtDetails6.setMovementMethod(new ScrollingMovementMethod());
        txtDetails6.setText("Simply boil the vermicelli with some salt to taste and a drop of oil. You can just eat it directly or you can just add some hot milk and a tablespoon of honey, mix it and have it. Take a pan and put a tablespoon of oil in it, add cumin seeds and let it splutter and add chopped ginger, fry it for a minute and add curry leaves, a pinch of turmeric powder and add cooked vermicelli and mix it well and have it with bread or consume it directly");
    }
}

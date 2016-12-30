package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Interface2 extends AppCompatActivity implements View.OnClickListener{

    Button eyeCare,oralCare,skinCare,beautyCare,hyperTension,nose,hairCare,arthritis;
    Button stomache,sugar,women,allergy,heart,stress,brain,nerves,ear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface2);

        eyeCare = (Button) findViewById(R.id.eyeCare);
        oralCare = (Button) findViewById(R.id.oralcare);

        skinCare = (Button) findViewById(R.id.skincare);
        beautyCare=(Button)findViewById(R.id.beautycare);

        hyperTension = (Button) findViewById(R.id.hypertension);
        nose = (Button) findViewById(R.id.nose);

        hairCare = (Button) findViewById(R.id.haircare);
        arthritis=(Button)findViewById(R.id.arthritis);

        stomache = (Button) findViewById(R.id.stomache);
        sugar = (Button) findViewById(R.id.sugar);

        women = (Button) findViewById(R.id.women);
        allergy= (Button)findViewById(R.id.allergy);

        heart  = (Button)findViewById(R.id.heart);
        stress = (Button)findViewById(R.id.stress);

        brain = (Button)findViewById(R.id.brain);
        nerves = (Button)findViewById(R.id.nerves);

        ear=(Button)findViewById(R.id.ear);

        eyeCare.setOnClickListener(this);
        skinCare.setOnClickListener(this);

        oralCare.setOnClickListener(this);
        beautyCare.setOnClickListener(this);

        hyperTension.setOnClickListener(this);
        nose.setOnClickListener(this);

        hairCare.setOnClickListener(this);
        arthritis.setOnClickListener(this);

        stomache.setOnClickListener(this);
        sugar.setOnClickListener(this);

        women.setOnClickListener(this);
        allergy.setOnClickListener(this);

        heart.setOnClickListener(this);
        stress.setOnClickListener(this);

        brain.setOnClickListener(this);
        nerves.setOnClickListener(this);

        ear.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.eyeCare:
                startActivity(new Intent(Interface2.this, Interface21.class));
                break;
            case R.id.oralcare:
                startActivity(new Intent(Interface2.this, Interface22.class));
                break;
            case R.id.skincare:
                startActivity(new Intent(Interface2.this, Interface23.class));
                break;
            case R.id.beautycare:
                startActivity(new Intent(Interface2.this, Interface24.class));
                break;
            case R.id.hypertension:
                startActivity(new Intent(Interface2.this, Interface25.class));
                break;
            case R.id.nose:
                startActivity(new Intent(Interface2.this, Interface26.class));
                break;
            case R.id.haircare:
                startActivity(new Intent(Interface2.this, Interface27.class));
                break;
            case R.id.arthritis:
                startActivity(new Intent(Interface2.this, Interface28.class));
                break;
            case R.id.stomache:
                startActivity(new Intent(Interface2.this, Interface29.class));
                break;
            case R.id.sugar:
                startActivity(new Intent(Interface2.this, Interface210.class));
                break;
            case R.id.women:
                startActivity(new Intent(Interface2.this, Interface211.class));
                break;
            case R.id.allergy:
                startActivity(new Intent(Interface2.this, Interface212.class));
                break;
            case R.id.heart:
                startActivity(new Intent(Interface2.this, Interface213.class));
                break;
            case R.id.stress:
                startActivity(new Intent(Interface2.this, Interface214.class));
                break;
            case R.id.brain:
                startActivity(new Intent(Interface2.this, Interface215.class));
                break;
            case R.id.nerves:
                startActivity(new Intent(Interface2.this, Interface216.class));
                break;
            case R.id.ear:
                startActivity(new Intent(Interface2.this, Interface217.class));
                break;
        }
    }
}

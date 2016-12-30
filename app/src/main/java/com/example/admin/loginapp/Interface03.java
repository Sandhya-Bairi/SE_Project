package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interface03 extends AppCompatActivity implements View.OnClickListener{

    Button basicFirstAid,fire,snakeBite,cpr,acci,currShock,delivery,fits,sunStroke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface03);

            basicFirstAid= (Button) findViewById(R.id.basicFirstAid);
            fire = (Button) findViewById(R.id.fire);

            snakeBite = (Button) findViewById(R.id.snakeBite);
            cpr=(Button)findViewById(R.id.cpr);

            acci = (Button) findViewById(R.id.acci);
            currShock = (Button) findViewById(R.id.currShock);

            delivery = (Button) findViewById(R.id.delivery);
            fits=(Button)findViewById(R.id.fits);

            sunStroke = (Button) findViewById(R.id.sunStroke);

            basicFirstAid.setOnClickListener(this);
            fire.setOnClickListener(this);

            snakeBite.setOnClickListener(this);
            cpr.setOnClickListener(this);

            acci.setOnClickListener(this);
            currShock.setOnClickListener(this);

            delivery.setOnClickListener(this);
            fits.setOnClickListener(this);

            sunStroke.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.basicFirstAid:
                    startActivity(new Intent(Interface03.this, Interface31.class));
                    break;

                case R.id.fire:
                    startActivity(new Intent(Interface03.this, Interface32.class));
                    break;
                case R.id.snakeBite:
                    startActivity(new Intent(Interface03.this, Interface33.class));
                    break;
                case R.id.cpr:
                    startActivity(new Intent(Interface03.this, Interface34.class));
                    break;
                case R.id.acci:
                    startActivity(new Intent(Interface03.this, Interface35.class));
                    break;
                case R.id.currShock:
                    startActivity(new Intent(Interface03.this, Interface36.class));
                    break;
                case R.id.delivery:
                    startActivity(new Intent(Interface03.this, Interface37.class));
                    break;
                case R.id.fits:
                    startActivity(new Intent(Interface03.this, Interface38.class));
                    break;
                case R.id.sunStroke:
                    startActivity(new Intent(Interface03.this, Interface39.class));
                    break;
            }
        }

    }

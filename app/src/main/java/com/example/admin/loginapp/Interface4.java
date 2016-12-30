package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interface4 extends AppCompatActivity implements View.OnClickListener {

    Button dailyroutine,healthyrecepies,weightmanagement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface4);

        dailyroutine=(Button)findViewById(R.id.dailyroutine);
        healthyrecepies = (Button)findViewById(R.id.healthyrecepies);
        weightmanagement = (Button)findViewById(R.id.weightmanagement);

        dailyroutine.setOnClickListener(this);
        healthyrecepies.setOnClickListener(this);
        weightmanagement.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dailyroutine:
                startActivity(new Intent(Interface4.this, interface41.class));
                break;
            case R.id.healthyrecepies:
                startActivity(new Intent(Interface4.this, interface42.class));
                break;
            case R.id.weightmanagement:
                startActivity(new Intent(Interface4.this, interface43.class));
                break;

        }

    }
}

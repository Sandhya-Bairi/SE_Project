package com.example.admin.loginapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.Image;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.logging.Handler;

public class Interface1 extends AppCompatActivity implements View.OnClickListener{

    Button diseases,firstaid,fitness,logout;
    TextView convo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_interface1);
        diseases = (Button) findViewById(R.id.diseasesCure);
        firstaid = (Button) findViewById(R.id.firstAid);
        fitness = (Button) findViewById(R.id.fitnessDiet);
        logout = (Button) findViewById(R.id.logout);
        convo=(TextView)findViewById(R.id.convoButton);
        diseases.setOnClickListener(this);
        firstaid.setOnClickListener(this);
        fitness.setOnClickListener(this);
        convo.setOnClickListener(this);
        logout.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.diseasesCure:
                Intent intent=new Intent(Interface1.this, Interface2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.firstAid:
                intent = new Intent(Interface1.this, Interface03.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.fitnessDiet:
                intent=new Intent(Interface1.this, Interface4.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.convoButton:
                intent = new Intent(Interface1.this, MyActivity.class);
                startActivity(intent);
                break;
            case R.id.logout:
                intent = new Intent(Interface1.this, Login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                AlertDialog.Builder builder = new AlertDialog.Builder(Interface1.this);
                builder.setMessage("Logged out successfully");
                builder.setCancelable(true);
                startActivity(intent);
                finish();
                break;
        }
    }
}

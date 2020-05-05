package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LeaderLevel1 extends AppCompatActivity {
    Button beginner;
    Button intermediate;
    Button expert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_level1);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarr);
     //   setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.drawable.ic_icon);
        setTitle("Fundamental LeaderBoard");
     //   getSupportActionBar().setHomeButtonEnabled(true);
     //   getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        beginner=findViewById(R.id.beginner);
        intermediate=findViewById(R.id.intermediate);
        expert=findViewById(R.id.expert);
        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),LeaderBoardAcSec1B.class);
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });
        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),LeaderBoardAcSec1I.class);
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });
        expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),LeaderBoardAcSec1E.class);
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

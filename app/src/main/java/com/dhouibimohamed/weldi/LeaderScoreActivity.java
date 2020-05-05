package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LeaderScoreActivity extends AppCompatActivity {


    Button lfunda;
    Button os;
    Button hw;
    Button finale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_score);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarr);
        //setSupportActionBar(toolbar);
        setTitle("Leadrs Scores");
        //toolbar.setNavigationIcon(R.drawable.ic_icon);
        lfunda=findViewById(R.id.fundamentals);
        os=findViewById(R.id.b3);
       // hw=findViewById(R.id.b4);

        lfunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),LeaderLevel1.class);
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),LeaderLevel2.class);
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

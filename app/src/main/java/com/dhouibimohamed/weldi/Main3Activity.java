package com.dhouibimohamed.weldi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dhouibimohamed.weldi.ParentsCatActivity.Cat1Activity;
import com.dhouibimohamed.weldi.ParentsCatActivity.Cat2Activity;
import com.dhouibimohamed.weldi.ParentsCatActivity.Cat3Activity;
import com.dhouibimohamed.weldi.ParentsCatActivity.Cat4Activity;
import com.dhouibimohamed.weldi.ParentsCatActivity.Cat5Activity;
import com.dhouibimohamed.weldi.RetroEntities.ParentActivity2;


public class Main3Activity extends AppCompatActivity {
    Button lfunda;
    Button b;
    Button sc;
    Button hard;
    Button sport;
    Button pp;
    Button coloring;
    Button br;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lfunda = findViewById(R.id.fundamentals);
        br = findViewById(R.id.memory);
        sport = findViewById(R.id.sport);
        hard = findViewById(R.id.hardware);
        pp = findViewById(R.id.pp);
        b = findViewById(R.id.texti);
        coloring = findViewById(R.id.coloring);


        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Cat1Activity.class);

                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Cat2Activity.class);

                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);


            }
        });

        lfunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ParentActivity2.class);


                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

            }
        });

        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Cat3Activity.class);

                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Cat5Activity.class);
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

            }
        });
        coloring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Cat4Activity.class);
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });


    }

}

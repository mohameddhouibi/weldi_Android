package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MemoryActivity extends AppCompatActivity {
    ImageView iv11,iv12,iv13,iv14,iv21,iv22,iv23,iv24,iv31,iv32,iv33,iv34;


    Integer [] cardsArray= {101,102,103,104,105,106,201,202,203,204,205,206};
    int image101,image102,image103,image104,image105,image106,
            image201,image202,image203,image204,image205,image206;
    int firstCard,secondCard;
    int clickedfirst,clickedsecond;
    int cardNumber =1;
    TextView compteur;
    int turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        compteur = (TextView) findViewById(R.id.compteur);

        CountDownTimer count = new CountDownTimer(30*1000,1000) {
            @Override
            public void onTick(long l) {
                compteur.setText(""+l/1000);
            }

            @Override
            public void onFinish() {
                finish();

            }
        }.start();

        iv11 = (ImageView) findViewById(R.id.iv_11);
        iv12 = (ImageView) findViewById(R.id.iv_12);
        iv13 = (ImageView) findViewById(R.id.iv_13);
        iv14 = (ImageView) findViewById(R.id.iv_14);
        iv21 = (ImageView) findViewById(R.id.iv_21);
        iv22 = (ImageView) findViewById(R.id.iv_22);
        iv23 = (ImageView) findViewById(R.id.iv_23);
        iv24 = (ImageView) findViewById(R.id.iv_24);
        iv31 = (ImageView) findViewById(R.id.iv_31);
        iv32 = (ImageView) findViewById(R.id.iv_32);
        iv33 = (ImageView) findViewById(R.id.iv_33);
        iv34 = (ImageView) findViewById(R.id.iv_34);

        iv11.setTag("0");
        iv12.setTag("1");
        iv13.setTag("2");
        iv14.setTag("3");
        iv21.setTag("4");
        iv22.setTag("5");
        iv23.setTag("6");
        iv24.setTag("7");
        iv31.setTag("8");
        iv32.setTag("9");
        iv33.setTag("10");
        iv34.setTag("11");
        frontOfCardsRessources();
        Collections.shuffle(Arrays.asList(cardsArray));

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv11,theCard);

            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv12,theCard);
            }
        });
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv13,theCard);
            }
        });
        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv14,theCard);
            }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv21,theCard);
            }
        });
        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv22,theCard);
            }
        });
        iv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv23,theCard);
            }
        });
        iv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv24,theCard);
            }
        });
        iv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv31,theCard);
            }
        });
        iv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv32,theCard);
            }
        });
        iv33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv33,theCard);
            }
        });
        iv34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv34,theCard);
            }
        });


    }

    public void doStuff(ImageView iv,int card)
    {
        if(cardsArray[card]==101){
            iv.setImageResource(image101);
        }else if(cardsArray[card]==102){
            iv.setImageResource(image102);
        }else if(cardsArray[card]==103){
            iv.setImageResource(image103);
        }else if(cardsArray[card]==104){
            iv.setImageResource(image104);
        }else if(cardsArray[card]==105){
            iv.setImageResource(image105);
        }else if(cardsArray[card]==106){
            iv.setImageResource(image106);
        }else if(cardsArray[card]==201){
            iv.setImageResource(image201);
        }else if(cardsArray[card]==202){
            iv.setImageResource(image202);
        }else if(cardsArray[card]==203){
            iv.setImageResource(image203);
        }else if(cardsArray[card]==204){
            iv.setImageResource(image204);
        }else if(cardsArray[card]==205){
            iv.setImageResource(image205);
        }else if(cardsArray[card]==206){
            iv.setImageResource(image206);
        }

        if(cardNumber==1)
        {
            firstCard = cardsArray[card];
            if(firstCard >200)
            {
                firstCard = firstCard -100;
            }
            cardNumber = 2;
            clickedfirst = card;
            iv.setEnabled(false);
        }
        else if(cardNumber ==2)
        {
            secondCard = cardsArray[card];
            if(secondCard >200)
            {
                secondCard = secondCard -100;
            }
            cardNumber = 1;
            clickedsecond = card;


            iv11.setEnabled(false);
            iv12.setEnabled(false);
            iv13.setEnabled(false);
            iv14.setEnabled(false);
            iv21.setEnabled(false);
            iv22.setEnabled(false);
            iv23.setEnabled(false);
            iv24.setEnabled(false);
            iv31.setEnabled(false);
            iv32.setEnabled(false);
            iv33.setEnabled(false);
            iv34.setEnabled(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },800);
        }
    }
    public void calculate()
    {
        if (firstCard==secondCard)
        {
            if (clickedfirst==0) {
                iv11.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 1){
                iv12.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 2){
                iv13.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 3){
                iv14.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 4){
                iv21.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 5){
                iv22.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 6){
                iv23.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 7){
                iv24.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 8){
                iv31.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 9){
                iv32.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 10){
                iv33.setVisibility(View.INVISIBLE);
            }else if(clickedfirst == 11){
                iv34.setVisibility(View.INVISIBLE);
            }


            if (clickedsecond==0) {
                iv11.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 1){
                iv12.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 2){
                iv13.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 3){
                iv14.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 4){
                iv21.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 5){
                iv22.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 6){
                iv23.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 7){
                iv24.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 8){
                iv31.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 9){
                iv32.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 10){
                iv33.setVisibility(View.INVISIBLE);
            }else if(clickedsecond == 11){
                iv34.setVisibility(View.INVISIBLE);
            }
        }else {
            iv11.setImageResource(R.drawable.question);
            iv12.setImageResource(R.drawable.question);
            iv13.setImageResource(R.drawable.question);
            iv14.setImageResource(R.drawable.question);
            iv21.setImageResource(R.drawable.question);
            iv22.setImageResource(R.drawable.question);
            iv23.setImageResource(R.drawable.question);
            iv24.setImageResource(R.drawable.question);
            iv31.setImageResource(R.drawable.question);
            iv32.setImageResource(R.drawable.question);
            iv33.setImageResource(R.drawable.question);
            iv34.setImageResource(R.drawable.question);
        }
        iv11.setEnabled(true);
        iv12.setEnabled(true);
        iv13.setEnabled(true);
        iv14.setEnabled(true);
        iv21.setEnabled(true);
        iv22.setEnabled(true);
        iv23.setEnabled(true);
        iv24.setEnabled(true);
        iv31.setEnabled(true);
        iv32.setEnabled(true);
        iv33.setEnabled(true);
        iv34.setEnabled(true);

        checkEnd();
    }
    public void checkEnd()
    {
        if(iv11.getVisibility() == View.INVISIBLE &&
                iv12.getVisibility() == View.INVISIBLE &&
                iv13.getVisibility() == View.INVISIBLE &&
                iv14.getVisibility() == View.INVISIBLE &&
                iv21.getVisibility() == View.INVISIBLE &&
                iv22.getVisibility() == View.INVISIBLE &&
                iv23.getVisibility() == View.INVISIBLE &&
                iv24.getVisibility() == View.INVISIBLE &&
                iv31.getVisibility() == View.INVISIBLE &&
                iv32.getVisibility() == View.INVISIBLE &&
                iv33.getVisibility() == View.INVISIBLE &&
                iv34.getVisibility() == View.INVISIBLE )
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MemoryActivity.this);
            alertDialogBuilder
                    .setMessage("Game Over")
                    .setCancelable(false)
                    .setPositiveButton("New", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(),MemoryActivity.class);
                            startActivity(intent);
                            finish();

                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    public void frontOfCardsRessources()
    {
        image101 = R.drawable.dog;
        image102 = R.drawable.cat;
        image103 = R.drawable.bird;
        image104 = R.drawable.deer;
        image105 = R.drawable.owl;
        image106 = R.drawable.fish;
        image201 = R.drawable.dogc;
        image202 = R.drawable.catc;
        image203 = R.drawable.birdc;
        image204 = R.drawable.deerc;
        image205 = R.drawable.owlc;
        image206 = R.drawable.fishc;
    }

}

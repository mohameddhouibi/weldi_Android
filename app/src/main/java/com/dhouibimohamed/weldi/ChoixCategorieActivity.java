package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.dhouibimohamed.weldi.RetroEntities.ParentActivity1;

public class ChoixCategorieActivity extends AppCompatActivity {
Spinner spin ;
String[] mOptions={"Generalknowledges","Sport","Tounsi","Maths","Art","Cinema"};
Button b0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_categorie);
        spin=findViewById(R.id.spinnercategorie);
        b0=findViewById(R.id.b0);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,mOptions);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);


        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent i = new Intent(ChoixCategorieActivity.this, ParentActivity1.class);
                    startActivity(i);
                }
                if(position==1){
                    Intent i = new Intent(ChoixCategorieActivity.this, choix2Activity.class);
                    startActivity(i);
                }
                if(position==2){
                    Intent i = new Intent(ChoixCategorieActivity.this, Choix3Activity.class);
                    startActivity(i);
                }
                if(position==3){
                    Intent i = new Intent(ChoixCategorieActivity.this, Choix4Activity.class);
                    startActivity(i);
                }
                if(position==4){
                    Intent i = new Intent(ChoixCategorieActivity.this, Choix5Activity.class);
                    startActivity(i);
                }
                if(position==5){
                    Intent i = new Intent(ChoixCategorieActivity.this, Choix6Activity.class);
                    startActivity(i);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

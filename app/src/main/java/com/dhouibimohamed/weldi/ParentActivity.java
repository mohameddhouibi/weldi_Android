package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dhouibimohamed.weldi.RetroEntities.ParentActivity1;

public class ParentActivity extends AppCompatActivity {

    Button profil ;
    Button profilChild ;
    Button registreChild;
    Button addQuestion ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        profil=findViewById(R.id.b0);
        profilChild=findViewById(R.id.b1);
        registreChild=findViewById(R.id.b2);
        addQuestion=findViewById(R.id.b3);


        profilChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ParentActivity.this,ProfileChildviaParentActivity.class);
                i.putExtra("id_child", "1");
                startActivity(i);

            }
        });
        registreChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ParentActivity.this,Activity_SignUp.class);
                i.putExtra("id_parent", "1");
                startActivity(i);

            }
        });
        addQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ParentActivity.this, ChoixCategorieActivity.class);
                i.putExtra("id_parent", "1");
                startActivity(i);
            }
        });
    }
}

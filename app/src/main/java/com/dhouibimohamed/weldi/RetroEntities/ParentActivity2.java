package com.dhouibimohamed.weldi.RetroEntities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dhouibimohamed.weldi.ParentFragments.Frag1;
import com.dhouibimohamed.weldi.R;


public class ParentActivity2 extends AppCompatActivity {
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent2);
        start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag1()).commit();
                start.setVisibility(View.INVISIBLE);
            }
        });
    }


}

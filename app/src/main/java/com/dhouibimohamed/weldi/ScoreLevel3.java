package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dhouibimohamed.weldi.DbHelper.DbHelper;

public class ScoreLevel3 extends AppCompatActivity {
    DbHelper dbHelper = new DbHelper(this);
    TextView s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_level3);
        int hwB, hwI, hwE;
        hwB=hwI=hwE=0;
        hwB=dbHelper.getScoreHardwareB();
        hwI=dbHelper.getScoreHardwareI();
        hwE=dbHelper.getScoreHardwareE();
        s1=(TextView)findViewById(R.id.st1);
        s2=(TextView)findViewById(R.id.st2);
        s3=(TextView)findViewById(R.id.st3);
        if(hwB<10)
        {
            s1.setText("0"+ hwB);
        }
        else
        {
            s1.setText(""+ hwB);
        }
        if(hwI<10)
        {
            s2.setText("0"+ hwI);
        }
        else
        {
            s2.setText(""+ hwI);
        }
        if(hwE<10)
        {
            s3.setText("0"+ hwE);
        }
        else
        {
            s3.setText(""+ hwE);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

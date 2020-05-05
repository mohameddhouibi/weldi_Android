package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ProfileParentActivity extends AppCompatActivity {
    EditText FirstName,Phone,Email,Password;
    Button save ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parent);
        FirstName = findViewById(R.id.Name);
        Phone = findViewById(R.id.Gender);
        Email = findViewById(R.id.BirthDate);
        Password = findViewById(R.id.Size);
        save = findViewById(R.id.save);
    }
}

package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.security.Key;
import java.util.HashMap;

public class ProfileChildActivity extends AppCompatActivity {
    TextView Phone,Email,Password,phone1,phone2;
    TextView FirstName ;
    Button save ;
    FirebaseAuth firebaseAuth ;
    FirebaseDatabase firebaseDatabase ;
    DatabaseReference databaseReference ;
    ImageView photo_profile ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_child);
        FirstName = findViewById(R.id.Name);
        Email = findViewById(R.id.emaiil);
        Phone = findViewById(R.id.Scorecomp);
        phone1 = findViewById(R.id.Scoresport);
        phone2 = findViewById(R.id.scorefonda);
        Password = findViewById(R.id.Size);
        save = findViewById(R.id.save);
        firebaseAuth.getInstance();
       // firebaseUser=firebaseAuth.getCurrentUser();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        firebaseDatabase=firebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("users");
        //String image_url=getIntent().getStringExtra("imgurl");
        //photo_profile=findViewById(R.id.profile_icon);
        //Glide.with(ProfileChildActivity.this).load(image_url).into(photo_profile);
        Query query=databaseReference.orderByChild("email").equalTo(user.getEmail());
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot ds :dataSnapshot.getChildren()){

                        String name =""+ds.child("displayName").getValue();
                        String email=""+ds.child("email").getValue();
                        String sc1=""+ds.child("compMarksB").getValue();
                        String sc2=""+ds.child("osMarksB").getValue();
                        String sc3=""+ds.child("hardwareMarksB").getValue();
                        FirstName.setText(name);
                        Email.setText(email);
                        Phone.setText(sc1);
                        phone1.setText(sc2);
                        phone2.setText(sc3);

                        try {

                        }catch (Exception e){
                        }
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileChildActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

    }

}

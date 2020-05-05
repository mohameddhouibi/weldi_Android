package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class ProfileChildviaParentActivity extends AppCompatActivity {
    RelativeLayout rl1,rl2;
    TextView t1,t2,t3,t4,t5;
    EditText childEmail;
    Button confirmer ;
    FirebaseAuth firebaseAuth ;
    FirebaseDatabase firebaseDatabase ;
    DatabaseReference databaseReference ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_childvia_parent);
        childEmail=findViewById(R.id.ChildEmail);
        confirmer=findViewById(R.id.confirmChild);
        rl1=findViewById(R.id.rl1);
        rl2=findViewById(R.id.rl2);
        t1=findViewById(R.id.Name);
        t2=findViewById(R.id.Scorecomp);
        t3=findViewById(R.id.Scoresport);
        t4=findViewById(R.id.scorefonda);
        t5=findViewById(R.id.scoreperso);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        firebaseDatabase=firebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("users");
        confirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl1.setVisibility(View.INVISIBLE);
                rl2.setVisibility(View.VISIBLE);

                Query query=databaseReference.orderByChild("email").equalTo(childEmail.getText().toString());

                query.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for(DataSnapshot ds :dataSnapshot.getChildren()){

                            String name =""+ds.child("displayName").getValue();
                            String email=""+ds.child("compMarksI").getValue();
                            String sc1=""+ds.child("compMarksB").getValue();
                            String sc2=""+ds.child("osMarksB").getValue();
                            String sc3=""+ds.child("hardwareMarksB").getValue();
                            t1.setText(name);
                            t2.setText(email);
                            t3.setText(sc1);
                            t4.setText(sc2);
                            t5.setText(sc3);
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });


            }
        });

    }
}

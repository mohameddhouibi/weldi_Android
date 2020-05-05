package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.dhouibimohamed.weldi.RetroEntities.ParentActivity3;
import com.dhouibimohamed.weldi.Retrofit.INodeJS;
import com.dhouibimohamed.weldi.Retrofit.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ParentActivity4 extends AppCompatActivity {
    Context mContext=ParentActivity4.this;


    TextView tvLogin;
    INodeJS myAPI ;
    EditText edit_name ;
    EditText edit_email ;
    EditText edit_password ;
    Button Registre ;
    Button Signin;
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent4);
        Retrofit retrofit = RetrofitClient.getInstance();
        myAPI=retrofit.create(INodeJS.class);

        edit_name=findViewById(R.id.edusername);
        edit_email=findViewById(R.id.edemail);
        edit_password=findViewById(R.id.edpass);
        Registre=findViewById(R.id.button1);
        Signin=findViewById(R.id.btn_Already_Member);
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(ParentActivity4.this, ParentActivity3.class);
                startActivity(i);

            }
        });

        Registre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser(edit_name.getText().toString(),edit_email.getText().toString(),edit_password.getText().toString());
            }
        });
    }

    private void registerUser(String nom ,String email, String password) {
        Call<String> registrecall = RetrofitClient.getInstance().create(INodeJS.class).registreUser(nom,email,password);
        registrecall.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()){
                    Intent i =new Intent(ParentActivity4.this, ParentActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(mContext, "error login1", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(mContext, "error login", Toast.LENGTH_LONG).show();

            }
        });

    }
}

package com.dhouibimohamed.weldi.RetroEntities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.dhouibimohamed.weldi.ParentActivity;
import com.dhouibimohamed.weldi.ParentActivity4;
import com.dhouibimohamed.weldi.R;
import com.dhouibimohamed.weldi.Retrofit.INodeJS;
import com.dhouibimohamed.weldi.Retrofit.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ParentActivity3 extends AppCompatActivity {
    private static final String TAG = "ParentActivity3Activity" ;
    Context mContext= ParentActivity3.this;
    TextView tvSignup;
    EditText edit_email ;
    EditText edit_password ;
    Button Login ;
    Button Registre ;
    INodeJS myAPI ;
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
        setContentView(R.layout.activity_parent3);
        Retrofit retrofit = RetrofitClient.getInstance();
        myAPI=retrofit.create(INodeJS.class);
        Login=findViewById(R.id.signins);
        Registre=findViewById(R.id.btn_new_user);
        edit_email=findViewById(R.id.user_email);
        edit_password=findViewById(R.id.user_pass);
        edit_password.setText("1234");
        edit_email.setText("hamma@hamma.com");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser(edit_email.getText().toString(),edit_password.getText().toString());
            }
        });
        Registre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ParentActivity3.this, ParentActivity4.class);
                startActivity(i);
            }
        });
    }
    private void loginUser(String email, String password) {
        Call<Client> loginCall = RetrofitClient.getInstance().create(INodeJS.class).loginUser(email,password);

        loginCall.enqueue(new Callback<Client>() {
            @Override
            public void onResponse(Call<Client> call, Response<Client> response) {
                if (response.isSuccessful()){


                    Intent i = new Intent(ParentActivity3.this, ParentActivity.class);
                    int idParent = response.body().getIdUser();
                    i.putExtra("idParent",idParent);
                    startActivity(i);
                }
                else{
                    Toast.makeText(mContext, "error login", Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Call<Client> call, Throwable t) {
                Log.e(TAG, "onFailure: ",t );
                Toast.makeText(mContext, "error login", Toast.LENGTH_LONG).show();
            }
        });
    }
}

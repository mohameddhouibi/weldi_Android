package com.dhouibimohamed.weldi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dhouibimohamed.weldi.Model.UserModel;
import com.dhouibimohamed.weldi.Retrofit.INodeJS;
import com.dhouibimohamed.weldi.Retrofit.RetrofitClient;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_SignUp extends AppCompatActivity {

    EditText username;
    EditText uemail;
    EditText upassword;
    EditText urepassword;
    Button btn_Sign_Up;
    Button btn_Already_Member;
    LoginButton loginButton ;
    Button ya7shifih ;
    Context mContext=Activity_SignUp.this;

    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    private boolean isTaken=true;
    private CallbackManager callbackManager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sign_up);
        username = (EditText) findViewById(R.id.edusername);
        uemail = (EditText) findViewById(R.id.edemail);
        upassword = (EditText) findViewById(R.id.edpass);
        ya7shifih=findViewById(R.id.login_buttonnn);
        urepassword = (EditText) findViewById(R.id.edrepass);
        btn_Sign_Up = (Button) findViewById(R.id.button1);
        btn_Already_Member = (Button) findViewById(R.id.btn_Already_Member);
        setAuthInstance();
        setDatabaseInstance();
        btn_Sign_Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegisterUser();
            }
        });
        loginButton =findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        callbackManager = CallbackManager.Factory.create();

        btn_Already_Member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_SignUp.this,Activity_Login.class);
                startActivity(i);
            }
        });

        ya7shifih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginButton.setVisibility(View.INVISIBLE);
                loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {


                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                    }
                });
            }
        });

    }

 //facebook//

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        callbackManager.onActivityResult(requestCode,resultCode,data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    AccessTokenTracker tokenTracker = new AccessTokenTracker() {
        @Override
        protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken)
        {
            if(currentAccessToken==null)
            {
                uemail.setText("");
                username.setText("");
                Toast.makeText(Activity_SignUp.this,"User Logged out",Toast.LENGTH_LONG).show();
            }
            else
                loadUserProfile(currentAccessToken);
        }
    };

    private void loadUserProfile(AccessToken newAccessToken)
    {
        GraphRequest request = GraphRequest.newMeRequest(newAccessToken, new GraphRequest.GraphJSONObjectCallback() {
            @Override
            public void onCompleted(JSONObject object, GraphResponse response)
            {
                try {
                    String first_name = object.getString("first_name");
                    String last_name = object.getString("last_name");
                    String email = object.getString("email");
                    String id = object.getString("id");
                    String image_url = "https://graph.facebook.com/"+id+ "/picture?type=normal";
                    uemail.setText(email);
                    String mdp="12345678";
                    username.setText(first_name+last_name);
                    upassword.setText(mdp);
                    urepassword.setText(mdp);
                    RequestOptions requestOptions = new RequestOptions();
                    requestOptions.dontAnimate();
                    //Intent i=new Intent();
                    //i.putExtra("imgurl",image_url);
                   // startActivity(i);
                  //  Glide.with(Activity_Login.this).load(image_url).into(circleImageView);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        Bundle parameters = new Bundle();
        parameters.putString("fields","first_name,last_name,email,id");
        request.setParameters(parameters);
        request.executeAsync();

    }
    private void checkLoginStatus()
    {
        if(AccessToken.getCurrentAccessToken()!=null)
        {
            loadUserProfile(AccessToken.getCurrentAccessToken());
        }
    }

//facebook //
    private void setAuthInstance() {
        mAuth = FirebaseAuth.getInstance();
    }

    private void setDatabaseInstance() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public boolean validate() {
        boolean valid = true;

        String name = username.getText().toString();
        String email = uemail.getText().toString();
        String password = upassword.getText().toString();
        String reEnterPassword = urepassword.getText().toString();
        if (name.isEmpty()) {
            username.setError("enter user name");
            valid = false;
        } else {
            username.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            uemail.setError("enter a valid email address");
            valid = false;
        } else {
            uemail.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            upassword.setError(" entered password must contain 7 alphanumeric characters minimum");
            valid = false;
        } else {
            upassword.setError(null);
        }

        if (reEnterPassword.isEmpty() || reEnterPassword.length() < 4 || reEnterPassword.length() > 10 || !(reEnterPassword.equals(password))) {
            urepassword.setError("Password Do not match");
            valid = false;
        } else {
            urepassword.setError(null);
        }
        return valid;
    }

    private void onRegisterUser() {
        String name = username.getText().toString();
        Log.d("Name",""+name);
        boolean exist = retreiveUserNames(name);
        if (!validate()) {
        }
        else if (exist) {
            signUp(getUserEmail(), getUserPassword());
        } else {
            signUp(getUserEmail(), getUserPassword());
        }
    }

    public boolean retreiveUserNames(final String sUserName) {
        mDatabase = FirebaseDatabase.getInstance().getReference("userNames");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot userSnapshot : dataSnapshot.getChildren()) {
                    String existingUsername = userSnapshot.getKey();
                    Log.d("Ex",""+sUserName);
                    Log.d("Shot ", "" + existingUsername);
                    if(sUserName.equals(existingUsername)) {
                        isTaken = true;
                        Log.d("BooleanShot ", "" + isTaken);
                        break;
                    }
                    else if(!(sUserName.equals(existingUsername))) {
                        isTaken = false;
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(), "Connection Error. Please try again in some time.", Toast.LENGTH_SHORT).show();
            }
        });
        return isTaken;
    }
    private String getUserDisplayName() {
        return username.getText().toString().trim();
    }
    private String getUserEmail() {
        return uemail.getText().toString().trim();
    }
    private String getUserPassword() {
        return upassword.getText().toString().trim();
    }
    public int getCompMarksB(){
        return 0;
    }
    public int getCompMarksI(){
        return 0;
    }
    public int getCompMarksE(){
        return 0;
    }
    private int getHardwareMarksB() { return 0; }
    private int getHardwareMarksI() { return 0; }
    private int getHardwareMarksE() { return 0; }
    private int getOSMarksB() { return 0; }
    private int getOSMarksI() { return 0; }
    private int getOSMarksE() { return 0; }

    private int getFinalMarks()
    {
        return 0;
    }


    private void signUp(String email, String password) {
        final ProgressDialog progressDialog = new ProgressDialog(Activity_SignUp.this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creating Account...");
        progressDialog.show();
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();

                if(task.isSuccessful()) {
                    onAuthSuccess(task.getResult().getUser());
                }
                else {
                    Toast.makeText(getApplicationContext(), "" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void onAuthSuccess(FirebaseUser user) {
        createNewUser(user.getUid());
        createUserNames();
        goToMainActivity();
    }
    private void goToMainActivity() {
        Intent intent = new Intent(Activity_SignUp.this,ProfileChildActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    private void createNewUser(String userId){
        UserModel user = buildNewUser();
        FirebaseDatabase.getInstance().getReference("users").child(userId).setValue(user);
    }
    public void createUserNames() {
        //mDatabase.child("userNames").child(getUserDisplayName()).setValue(true);
        FirebaseDatabase.getInstance().getReference("userNames").child(getUserDisplayName()).setValue(true);
    }
    private UserModel buildNewUser() {
        return new UserModel(
                getUserDisplayName(),
                getUserEmail(),
                new Date().getTime(),
                getCompMarksB(),
                getCompMarksI(),
                getCompMarksE(),
                getHardwareMarksB(),
                getHardwareMarksI(),
                getHardwareMarksE(),
                getOSMarksB(),
                getOSMarksI(),
                getOSMarksE(),
                getFinalMarks()
        );
    }
}

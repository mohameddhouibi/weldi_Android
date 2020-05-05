package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dhouibimohamed.weldi.RetroEntities.ParentActivity1;
import com.dhouibimohamed.weldi.RetroEntities.Question;
import com.dhouibimohamed.weldi.Retrofit.INodeJS;
import com.dhouibimohamed.weldi.Retrofit.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Choix5Activity extends AppCompatActivity {
    private static final String TAG = "ParentActivity1";
    Context mContext = Choix5Activity.this;
    EditText edit_quest;
    EditText edit_opt1;
    EditText edit_opt2;
    EditText edit_opt3;
    EditText edit_opt4;
    EditText edit_answer;
    EditText edit_categ;
    Button addqst;
    INodeJS myAPI;
    String categorie="Art";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix5);

        //Init APi
        Retrofit retrofit = RetrofitClient.getInstance();
        myAPI = retrofit.create(INodeJS.class);

        //view
        edit_quest=findViewById(R.id.question);
        edit_opt1=findViewById(R.id.option1);
        edit_opt2=findViewById(R.id.option2);
        edit_opt3=findViewById(R.id.option3);
        edit_opt4=findViewById(R.id.option4);
        edit_answer=findViewById(R.id.answer1);
        addqst=findViewById(R.id.addquestion);
        addqst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                additional(edit_quest.getText().toString(),
                        edit_opt1.getText().toString(),
                        edit_opt2.getText().toString(),
                        edit_opt3.getText().toString(),
                        edit_opt4.getText().toString(),
                        edit_answer.getText().toString(),
                        categorie
                );
            }
        });
    }
    private void additional(String QUESTION1, String OPTA1, String OPTB1, String OPTC1, String OPTD1, String ANSWER1, String CATEGORY1) {
        Call<Question> registrable = RetrofitClient.getInstance().create(INodeJS.class).addquestionparent(QUESTION1,OPTA1,OPTB1,OPTC1,OPTD1,ANSWER1,CATEGORY1);
        registrable.enqueue(new Callback<Question>() {
            @Override
            public void onResponse(Call<Question> call, Response<Question> response) {
                if (response.isSuccessful()){
                    Toast.makeText(mContext, "question added", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(mContext, "error add", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Question> call, Throwable t) {
                Toast.makeText(mContext, "error add", Toast.LENGTH_LONG).show();

            }
        });

    }
}

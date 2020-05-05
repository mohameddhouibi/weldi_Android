package com.dhouibimohamed.weldi.ParentFragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import android.os.Handler;
import com.dhouibimohamed.weldi.R;
import com.dhouibimohamed.weldi.RetroEntities.Question;
import com.dhouibimohamed.weldi.Retrofit.INodeJS;
import com.dhouibimohamed.weldi.Retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    TextView question;
    RadioButton rb0;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    String CorrectAnswer;
    ImageView vrai;
    ImageView faux;
    MediaPlayer media ;
    final Handler handler = new Handler();
    int score;


    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag1, container, false);
        rb0 = (RadioButton) view.findViewById(R.id.radio0);
        rb1 = (RadioButton) view.findViewById(R.id.radio1);
        rb2 = (RadioButton) view.findViewById(R.id.radio2);
        rb3 = (RadioButton) view.findViewById(R.id.radio3);
        question = (TextView) view.findViewById(R.id.qstparent);
        vrai = (ImageView) view.findViewById(R.id.vrai);
        faux = (ImageView) view.findViewById(R.id.faux);
        GetQuestion();
        rb0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb0.getText() == CorrectAnswer) {
                    score = score + 5;
                    vrai.setVisibility(View.VISIBLE);
                    faux.setVisibility(View.INVISIBLE);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag2()).commit();
                        }
                    }, 1000);
                } else {
                    vrai.setVisibility(View.INVISIBLE);
                    faux.setVisibility(View.VISIBLE);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag2()).commit();
                        }
                    }, 1000);

                }
            }
        });

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.getText() == CorrectAnswer) {
                    score = score + 5;
                    vrai.setVisibility(View.VISIBLE);
                    faux.setVisibility(View.INVISIBLE);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag2()).commit();
                        }
                    }, 1000);
                } else {
                    vrai.setVisibility(View.INVISIBLE);
                    faux.setVisibility(View.VISIBLE);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag2()).commit();
                        }
                    }, 1000);

                }
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb2.getText() == CorrectAnswer) {
                    score = score + 5;
                    vrai.setVisibility(View.VISIBLE);
                    faux.setVisibility(View.INVISIBLE);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag2()).commit();
                        }
                    }, 1000);
                } else {
                    vrai.setVisibility(View.INVISIBLE);
                    faux.setVisibility(View.VISIBLE);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag2()).commit();
                        }
                    }, 1000);

                }
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb3.getText() == CorrectAnswer) {
                    score = score + 5;
                    vrai.setVisibility(View.VISIBLE);
                    faux.setVisibility(View.INVISIBLE);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag2()).commit();
                        }
                    }, 1000);
                } else {
                    vrai.setVisibility(View.INVISIBLE);
                    faux.setVisibility(View.VISIBLE);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new Frag2()).commit();
                        }
                    }, 1000);

                }
            }
        });
        return view;
    }

    private void GetQuestion() {


        final Call<List<Question>> QuestionList1 = RetrofitClient.getInstance().create(INodeJS.class).QuestionList1();
        QuestionList1.enqueue(new Callback<List<Question>>() {
            @Override
            public void onResponse(Call<List<Question>> call, Response<List<Question>> response) {
                if (response.isSuccessful()) {
                    List<Question> list = new ArrayList<Question>();
                    list = response.body();
                    Question qst1 = list.get(0);
                    question.setText(qst1.getQUESTION1());
                    rb0.setText(qst1.getOPTA1());
                    rb1.setText(qst1.getOPTC1());
                    rb2.setText(qst1.getOPTB1());
                    rb3.setText(qst1.getOPTD1());
                    CorrectAnswer = qst1.getANSWER1();
                    //    test.setText(qst1.getQUESTION1());
                } else {


                }
            }

            @Override
            public void onFailure(Call<List<Question>> call, Throwable t) {
                Log.e("", t.getMessage());

            }

        });

    }

}

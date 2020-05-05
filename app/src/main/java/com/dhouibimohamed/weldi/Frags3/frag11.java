package com.dhouibimohamed.weldi.Frags3;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.dhouibimohamed.weldi.ParentFragments.Frag2;
import com.dhouibimohamed.weldi.R;
import com.dhouibimohamed.weldi.RetroEntities.Question;
import com.dhouibimohamed.weldi.Retrofit.INodeJS;
import com.dhouibimohamed.weldi.Retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class frag11 extends Fragment {
    final Handler handler = new Handler();
    int score;


    public frag11() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag44, container, false);

    }
}

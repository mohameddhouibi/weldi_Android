package com.dhouibimohamed.weldi.Frags1;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.dhouibimohamed.weldi.R;


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
        View view = inflater.inflate(R.layout.fragment_frag22, container, false);


        return view;
    }


}

package com.example.app03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app03.databinding.FragmentTVBinding;


public class TVFragment extends Fragment {
    private FragmentTVBinding fragmentTVBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentTVBinding = FragmentTVBinding.inflate(inflater);
        View view = fragmentTVBinding.getRoot();
        Data data = new Data("TextView Fragment", 0xff00ffff, 50);
        fragmentTVBinding.setData(data);

        return view;

//        return inflater.inflate(R.layout.fragment_t_v, container, false);
    }
}
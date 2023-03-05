package com.example.app03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app03.databinding.FragmentButtonBinding;

public class ButtonFragment extends Fragment {
    private FragmentButtonBinding fragmentButtonBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentButtonBinding = FragmentButtonBinding.inflate(inflater);
        View view = fragmentButtonBinding.getRoot();
        return view;
//        return inflater.inflate(R.layout.fragment_button, container, false);
    }
}
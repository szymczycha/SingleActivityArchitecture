package com.example.app03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app03.databinding.FragmentImageBinding;

public class ImageFragment extends Fragment {
    private FragmentImageBinding fragmentImageBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentImageBinding = FragmentImageBinding.inflate(inflater);
        View view = fragmentImageBinding.getRoot();

        return view;
//        return inflater.inflate(R.layout.fragment_image, container, false);
    }
}
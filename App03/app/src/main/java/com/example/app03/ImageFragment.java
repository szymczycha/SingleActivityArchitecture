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
        Data data = new Data("Image fragment", 0xff003e42, 50, "https://cdn.discordapp.com/attachments/715515134419796039/1081981830498103347/bigButterfly.png");
        fragmentImageBinding.setData(data);
        return view;
//        return inflater.inflate(R.layout.fragment_image, container, false);
    }
}
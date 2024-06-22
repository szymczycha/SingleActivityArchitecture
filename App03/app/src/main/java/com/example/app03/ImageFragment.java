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
        Data data = new Data("Image fragment", 0xff003e42, 50, "https://tr.rbxcdn.com/4caf56312d6722d708493b0a341602a0/420/420/Hat/Png");
        fragmentImageBinding.setData(data);
        return view;
//        return inflater.inflate(R.layout.fragment_image, container, false);
    }
}
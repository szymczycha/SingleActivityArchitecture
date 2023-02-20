package com.example.app01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app01.databinding.FragmentABinding;

public class Fragment_A extends Fragment {
    private FragmentABinding fragmentABinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentABinding = FragmentABinding.inflate(getLayoutInflater());
        View view = fragmentABinding.getRoot();
        fragmentABinding.fragmentAButton.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString("B", fragmentABinding.fragmentAEditText.getText().toString());
            getParentFragmentManager().setFragmentResult("B", bundle);
        });
        getParentFragmentManager()
                .setFragmentResultListener("A", this, (s, b) -> {
                    Log.d("xxx","A");
                    Log.d("xxx",b.getString("A"));
                    fragmentABinding.fragmentALabel.setText(b.getString("A"));
                });
        return view;
    }
}
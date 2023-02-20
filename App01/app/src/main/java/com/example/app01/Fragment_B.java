package com.example.app01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app01.databinding.FragmentABinding;
import com.example.app01.databinding.FragmentBBinding;

public class Fragment_B extends Fragment {
    private FragmentBBinding fragmentBBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentBBinding = FragmentBBinding.inflate(getLayoutInflater());
        View view = fragmentBBinding.getRoot();
        fragmentBBinding.fragmentBButton.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString("A", fragmentBBinding.fragmentBEditText.getText().toString());
            getParentFragmentManager().setFragmentResult("A", bundle);
        });
        getParentFragmentManager()
                .setFragmentResultListener("B", this, (s, b) -> {
                    Log.d("xxx","B");
                    Log.d("xxx",b.getString("B"));
                    fragmentBBinding.fragmentBLabel.setText(b.getString("B"));
                });
        return view;
    }
}
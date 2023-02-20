package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import com.example.app01.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private Fragment_A fragment_a;
    private Fragment_B fragment_b;
    private String currentFragment = "A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
        fragment_a = new Fragment_A();
        fragment_b = new Fragment_B();
        replaceFragment(fragment_a);

        activityMainBinding.mainFragmentAButton.setOnClickListener(v -> {
            replaceFragment(fragment_a);
            currentFragment = "A";
        });
        activityMainBinding.mainFragmentBButton.setOnClickListener(v -> {
            replaceFragment(fragment_b);
            currentFragment = "B";
        });
        activityMainBinding.mainPassDataButton.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString(currentFragment, activityMainBinding.mainEditText.getText().toString());
            getSupportFragmentManager().setFragmentResult(currentFragment, bundle);
        });

    }
    private Fragment getCurrentFragment(){
        if(Objects.equals(currentFragment, "A")){
            return fragment_a;
        }else{
            return fragment_b;
        }
    }
    public void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commit();
    }
}
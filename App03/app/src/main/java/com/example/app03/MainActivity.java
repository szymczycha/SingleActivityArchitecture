package com.example.app03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.app03.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
        replaceFragment(new TVFragment());
        activityMainBinding.bottomMenu.setOnItemSelectedListener(v -> {
            Log.d("xxx", String.valueOf(activityMainBinding.bottomMenu.getLabelVisibilityMode()) );
            switch (v.getItemId()) {
                case R.id.menuTextView:
                    replaceFragment(new TVFragment());
                    break;
                case R.id.menuButtons:
                    replaceFragment(new ButtonFragment());
                    break;
                case R.id.menuImage:
                    replaceFragment(new ImageFragment());
                    break;
            }


            return true;
        });

//        setContentView(R.layout.activity_main);
    }
    public void replaceFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentHolder, fragment)
                .commit();
    }
}

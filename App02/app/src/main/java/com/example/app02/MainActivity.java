package com.example.app02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import com.example.app02.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
        activityMainBinding.toolbar.setNavigationOnClickListener(v->{
            activityMainBinding.drawerLayout.openDrawer(GravityCompat.START);
        });
        activityMainBinding.navigationView.setNavigationItemSelectedListener(item->{
            activityMainBinding.drawerLayout.closeDrawer(GravityCompat.START);

            int id = item.getItemId();

            switch(id){
                case R.id.menu_home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.menu_home2:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.menu_login:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.menu_settings:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.menu_share:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.menu_rate:
                    replaceFragment(new HomeFragment());
                    break;
            }

            return true;
        });


    }

    public void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commit();
    }
}
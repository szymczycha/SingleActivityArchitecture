package com.example.app03;

import android.app.ActionBar;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

import java.io.File;

public class Converters
{
    @BindingAdapter("app:textSize")
    public static void textSize(TextView textView, int size){
        textView.setTextSize(size);
    }
    @BindingAdapter("app:imageSize")
    public static void imageSize(ImageView imageView, int size){

        imageView.setLayoutParams(new LinearLayout.LayoutParams(3*size+200, 3*size+200));
//        imageView.setMinimumHeight(size);
//        imageView.setMaxHeight(size);
    }
    @BindingAdapter("app:imageURL")
    public static void imageURL(ImageView imageView, String imageURL){
        Glide.with(imageView.getContext())
                .load(imageURL)
                .into(imageView);
//        if(imageURL.equals("bigbutterfly.png")){
//            imageView.setImageResource(R.drawable.bigbutterfly);
//        }else if(imageURL.equals("girlandboy.png")){
//            imageView.setImageResource(R.drawable.girlandboy);
//        }
    }
}

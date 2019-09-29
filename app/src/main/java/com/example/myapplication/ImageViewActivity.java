package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mTv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mTv4 = (ImageView)findViewById(R.id.image2);
        Glide.with(this).load("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=479859184,2105379545&fm=58").into(mTv4);


    }
}

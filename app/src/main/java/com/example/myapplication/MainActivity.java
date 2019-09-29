package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView,mBtnButton,mBtnImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //left
        mBtnTextView = (Button)findViewById(R.id.btn_textview);
        mBtnButton = (Button)findViewById(R.id.btn_button);
        mBtnImageView =(Button)findViewById(R.id.btn_imageview);


        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到TextView演示界面
                Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ////跳转到Button演示界面
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        setListeners();
    }
    private void  setListeners(){
        OnClick onClick = new OnClick();
        mBtnImageView.setOnClickListener(onClick);
    }
    private  class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_imageview:
                    //跳转到ImageView
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}

package com.example.viewer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewerItemActivity extends AppCompatActivity implements View.OnTouchListener {

    private String mPict;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);

        Intent intent = getIntent();
        Bundle ex = intent.getExtras();
        if(ex != null){
            mPict = ex.getString("PICT");
        }

        ImageView imageView = (ImageView)findViewById(R.id.imageView1);
        if("マリノスケ".equals(mPict)){
            imageView.setImageResource(R.drawable.IMG_0009);
        }else if("チャンピオンフラッグ1".equals(mPict)){
            imageView.setImageResource(R.drawable.IMG_0031);
        }else if("チャンピオンフラッグ2".equals(mPict)){
            imageView.setImageResource(R.drawable.IMG_1445);
        }

        Button backBtn = (Button)findViewById(R.id.backbutton);
        backBtn.setOnTouchListener(this);
        Button emailBtn = (Button)findViewById(R.id.emailbutton);
        emailBtn.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event){
        switch (v.getId()){
            case R.id.backbutton:
                break;
            case R.id.emailbutton:
                break;
        }
        return false;
    }
}

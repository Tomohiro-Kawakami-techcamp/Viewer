package com.example.viewer;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ViewerItemActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
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

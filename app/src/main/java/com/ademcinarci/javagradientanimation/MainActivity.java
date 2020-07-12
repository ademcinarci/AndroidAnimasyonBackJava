package com.ademcinarci.javagradientanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        RelativeLayout relativeLayout;
        relativeLayout = findViewById(R.id.background);
        relativeLayout.setBackgroundResource(R.drawable.animasyonbackground);
        AnimationDrawable gecisanimasyon = (AnimationDrawable) relativeLayout.getBackground();
        gecisanimasyon.setEnterFadeDuration(10);
        gecisanimasyon.setExitFadeDuration(3000);
        gecisanimasyon.start();
    }
}
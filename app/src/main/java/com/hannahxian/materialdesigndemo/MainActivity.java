package com.hannahxian.materialdesigndemo;

import android.animation.Animator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.transition.Explode;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.hannahxian.materialdesigndemo.UI.SecondActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Bind(R.id.activity_main)
    RelativeLayout activityMain;
    @Bind(R.id.jump)
    Button jump;
    Animator anim;
    @Bind(R.id.animtest)
    Button animtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Drawable d = getDrawable(R.drawable.images);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.images);
        int getColor = Palette.generate(b).getDarkVibrantColor(Color.BLUE);
        jump.setTextColor(getColor);


    }

    @OnClick(R.id.jump)
    public void onClick() {
        getWindow().setExitTransition(new Explode());
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent,
                ActivityOptions
                        .makeSceneTransitionAnimation(this).toBundle());
    }
}

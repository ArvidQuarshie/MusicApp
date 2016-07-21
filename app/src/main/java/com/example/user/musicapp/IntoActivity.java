package com.example.user.musicapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;

public class IntoActivity  extends AppIntro {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(SampleSlide.newInstance(R.layout.first_fragment));
        addSlide(SampleSlide.newInstance(R.layout.second_fragment));
        addSlide(SampleSlide.newInstance(R.layout.third_fragment));
        addSlide(SampleSlide.newInstance(R.layout.fourth_fragment));



        // OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(Color.parseColor("#26547C"));
        setSeparatorColor(Color.parseColor("#26547c"));

        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);


    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        Intent intent = new Intent(IntoActivity.this,MainActivity.class);
        startActivity(intent);


    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
       Intent intent = new Intent(IntoActivity.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
    }


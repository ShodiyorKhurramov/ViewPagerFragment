package com.example.m4l8t2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.m4l8t2.Fragment.FirstFragment;
import com.example.m4l8t2.Fragment.SecondFragment;
import com.example.m4l8t2.Model.User;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstListener {
    SecondFragment secondFragment;
    FirstFragment firstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment=(FirstFragment) getSupportFragmentManager().findFragmentById(R.id.FirstFragment);
        secondFragment=(SecondFragment) getSupportFragmentManager().findFragmentById(R.id.SecondFragment);
    }


    @Override
    public void onFirstSend(User user) {
        secondFragment.updateSecondUser(user);
    }


}
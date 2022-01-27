package com.example.m4l8t2.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.m4l8t2.Model.User;
import com.example.m4l8t2.R;

public class SecondFragment extends Fragment {
  TextView tv_second;

    @Nullable
    @Override
    public View onCreateView
            (@NonNull LayoutInflater inflater,
             @Nullable ViewGroup container,
             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second,container,false);
         tv_second=view.findViewById(R.id.tv_second);
               return  view;
    }


 public    void updateSecondUser(User user){
        tv_second.setText(user.toString());

    }

}

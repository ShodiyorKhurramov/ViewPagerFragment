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

public class FirstFragment extends Fragment {
    FirstListener firstListener;
    TextView tv_first;


    @Nullable
    @Override
    public View onCreateView
            (@NonNull LayoutInflater inflater,
             @Nullable ViewGroup container,
             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first,container,false);
         tv_first=view.findViewById(R.id.tv_first);
         Button button=view.findViewById(R.id.bt_first);
         User user= new User("Shodiyor",99);

          button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  firstListener.onFirstSend(user);
              }
          });


               return  view;

           }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof  FirstListener){
            firstListener = (FirstListener) context;
        }else{
            throw new RuntimeException(context.toString()+"runtime");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

        firstListener=null;
    }

//  public   void updateFirtUser(User user){
//        tv_first.setText(user.toString());
//
//    }

  public   interface FirstListener{
        void onFirstSend(User user);

    }
}

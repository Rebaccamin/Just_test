package com.example.wu_.just_text;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wu-成敏 on 2015/10/5.
 */
public class Myfragment2 extends Fragment {
    /*第一次调用:layout转化为view对象
    解释inflate的三个参数：resource：fragment加载的布局文件     root加载的父viewgroup  attachroot false指不返回父viewgroup
    */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment, container, false);
        TextView text=(TextView)view.findViewById(R.id.mytext);
        text.setText("啊哦!");
        return view;
    }
}

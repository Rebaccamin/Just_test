package com.example.wu_.just_text;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class myfragment3 extends Fragment {
    private TextView tv;
    /*每次创建绘制frgment组件view时回调这个方法
   */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2,container,false);
       TextView tv=(TextView)view.findViewById(R.id.text3);
        tv.setText("第一个fragment！");
        Log.d("Main","onCreateView");
        return view;
    }
/*当fragment被添加到activity中回调这个方法，只会调用一次。*/
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("Main","onAttach方法被调用！");
    }
    /**
     * 创建Fragment时会回调，只会调用一次
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Main", "Fragment1---onCreate()");

    }
    /**
     * 当Fragment所在的Activty启动完成后调用
     */
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Main", "Fragment1---onActivityCreated()");

    }
    /**
     * 启动Fragment
     */
    public void onStart() {

        super.onStart();
        Log.i("Main", "Fragment1---onStart()");

    }
    /**
     * 恢复Fragment时会被回调，调用onStart（）方法后面一定会调用onResume()方法
     */
    public void onResume() {
        super.onResume();
        Log.i("Main", "Fragment1---onResume()");

    }
    /**
     * 暂停Fragment
     */
    public void onPause() {
        super.onPause();
        Log.i("Main", "Fragment1---onPause()");

    }
    /**
     * 停止Fragment
     */
    public void onStop() {
        super.onStop();
        Log.i("Main", "Fragment1---onStop()");

    }
    /**
     * 销毁Fragment所包含的View组件时
     */
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Main", "Fragment1---onDestroyView()");

    }
    /**
     * 销毁Fragment时会被回调
     */
    public void onDestroy() {
        super.onDestroy();
        Log.i("Main", "Fragment1---onDestroy()");

    }
    /**
     * Fragment从Activity中删除时会回调该方法，并且这个方法只会调用一次
     */
    public void onDetach() {
        super.onDetach();
        Log.i("Main", "Fragment1---onDetach()");
    }
}

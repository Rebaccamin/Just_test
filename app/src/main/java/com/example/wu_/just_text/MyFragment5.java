package com.example.wu_.just_text;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MyFragment5 extends Fragment {
    private String code="Thank you,Activity!";

    public MyListener listener;
    public interface MyListener
    {
        public void thank(String code);
    }

    public void onAttach(Activity activity) {
        listener=(MyListener) activity;
        super.onAttach(activity);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment5, container, false);
        TextView tv = (TextView) view.findViewById(R.id.text5);
        Button b5=(Button)view.findViewById(R.id.b5);
        String text=getArguments().get("name")+"";
        tv.setText(text);
        Toast.makeText(getActivity(), "已成功接收到" + text, Toast.LENGTH_SHORT).show();
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "向Activity发送" + code, Toast.LENGTH_SHORT).show();
                listener.thank(code);
            }
        });
        return view;
    }
}

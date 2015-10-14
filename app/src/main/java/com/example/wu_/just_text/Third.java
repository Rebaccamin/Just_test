package com.example.wu_.just_text;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
//切换fragment
public class Third extends Activity{
    private ImageButton b1;
    private boolean flag=true;
    private Fragment f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        init();
        b1 = (ImageButton) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction beginTransaction = fragmentManager
                        .beginTransaction();
                if (flag) {
                    MyFragment4 frag4 = new MyFragment4();
                    beginTransaction.replace(R.id.layout1, frag4);
                    flag = false;
                } else {
                    myfragment3 frag3 = new myfragment3();
                    beginTransaction.replace(R.id.layout1, frag3);
                    flag = true;

                }

                beginTransaction.commit();
            }
        });

    }

    private void init() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager
                .beginTransaction();
        myfragment3 frag3 = new myfragment3();
        beginTransaction.add(R.id.layout1,frag3);
        beginTransaction.commit();
    }
}

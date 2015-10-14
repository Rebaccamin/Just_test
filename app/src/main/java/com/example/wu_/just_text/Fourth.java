package com.example.wu_.just_text;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fourth extends Activity implements MyFragment5.MyListener {
    private EditText editext;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4);
        editext = (EditText) findViewById(R.id.editText);
        send = (Button) findViewById(R.id.send);


        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = editext.getText().toString();
                MyFragment5 fragment5 = new MyFragment5();
                Bundle bundle = new Bundle();
                bundle.putString("name", text);
                fragment5.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction beginTransaction = fragmentManager
                        .beginTransaction();
                beginTransaction.add(R.id.layout, fragment5);
                beginTransaction.commit();
                Toast.makeText(Fourth.this, "向Fragment了合肥入库话费开好房喝咖啡和个坑两句话歌手来人发送数据" + text,
                        Toast.LENGTH_SHORT).show();
            }
        });
/*
        FragmentManager fragmentManager = getFragmentManager();
        Fragment findFragmentById = fragmentManager.findFragmentById(R.id.frag);
        MyFragment frag=(MyFragment) findFragmentById;
        frag.setAaa("fragment静态传值");*/
    }
    public void thank(String code) {

        Toast.makeText(Fourth.this, "已成功接收到" + code + "，客气了！",
                Toast.LENGTH_SHORT).show();
    }
}

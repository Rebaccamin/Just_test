package com.example.wu_.just_text;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Second extends Activity {

    private TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        tv=(TextView)findViewById(R.id.mytext);
        Button button=(Button)findViewById(R.id.mybutton);
        button.setText("Change");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
     tv.setText("第一个静态fragment");
            }
        });
    }
}

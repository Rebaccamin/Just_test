package com.example.wu_.just_text;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;

public class Just_text extends Activity implements RadioGroup.OnCheckedChangeListener {
private RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_text);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        rg.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
                case R.id.first: {
                    Intent intent=new Intent(this,Second.class);
                    startActivity(intent);
                    break;

                }
                case R.id.second: {
                    Myfragment2 fragment2=new Myfragment2();
                    //开启一个管理fragment的事物
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                    beginTransaction.add(R.id.frame, fragment2);
                    beginTransaction.addToBackStack(null);
                    beginTransaction.commit();
                    break;
                }
                case R.id.third: {
                    Intent intent=new Intent(Just_text.this,Third.class);
                    startActivity(intent);
                    break;
                }
                case R.id.fourth: {
                    Intent intent=new Intent(Just_text.this,Fourth.class);
                    startActivity(intent);

                    break;
                }
            }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_just_text, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

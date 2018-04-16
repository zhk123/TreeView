package com.zk.treeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zk.mylibrary.CustomUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = CustomUtil.getName();
        Log.i("TAG_lib", "onCreate: " + name);
    }
}

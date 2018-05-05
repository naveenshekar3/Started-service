package com.example.root.startedservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view)
    {
        mIntent= new Intent(MainActivity.this,MyService.class);
        startService(mIntent);
    }

    public void stop(View view)
    {
        stopService(mIntent);
    }
}

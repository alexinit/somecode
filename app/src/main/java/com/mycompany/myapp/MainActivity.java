package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	protected void onDestroy()
	{
		Toast.makeText(MainActivity.this,"退出",Toast.LENGTH_SHORT).show();
	}
	
}

package com.anisdroid.Material_Design;

import android.app.*;
import android.os.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;

public class MainActivity extends ActionBarActivity 
{
	private Toolbar ttt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		ttt = (Toolbar) findViewById(R.id.app_bar);
		setSupportActionBar(ttt);
		
    }
}

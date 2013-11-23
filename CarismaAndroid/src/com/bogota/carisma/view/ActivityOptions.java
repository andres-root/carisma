package com.bogota.carisma.view;

import com.bogota.carisma.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ActivityOptions extends Activity 
{

	
	public void onCreate(Bundle savedInstanceState)
	{
		
		   super.onCreate(savedInstanceState);
		   requestWindowFeature(Window.FEATURE_NO_TITLE);
		   setContentView(R.layout.activity_options);
		
	}
	
	
}

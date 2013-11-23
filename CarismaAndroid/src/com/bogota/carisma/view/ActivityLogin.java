package com.bogota.carisma.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import com.bogota.carisma.R;

public class ActivityLogin extends Activity {
	
	private EditText email;
	private EditText password;
	
	public void onCreate(Bundle savedInstanceState)
	{
		
		   super.onCreate(savedInstanceState);
		   requestWindowFeature(Window.FEATURE_NO_TITLE); 
		   setContentView(R.layout.activity_login);
		   
		   email = (EditText) findViewById(R.id.editText1);
		   password = (EditText) findViewById(R.id.editText20);
		   		   
	}
	
	
	public void checkLogin(View view)
	{
		/*
		Intent intent = new Intent(ActivityLogin.this, MainActivity.class);
        startActivity(intent);
        finish();
		*/
	}
	
}

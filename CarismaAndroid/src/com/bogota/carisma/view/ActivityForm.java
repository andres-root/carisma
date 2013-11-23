package com.bogota.carisma.view;

import com.bogota.carisma.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Spinner;

public class ActivityForm extends Activity{

	private EditText name;
	private Spinner age;
	private EditText email;
	
	public void onCreate(Bundle savedInstanceState){
		
		   super.onCreate(savedInstanceState);
		   requestWindowFeature(Window.FEATURE_NO_TITLE); 
		   setContentView(R.layout.activity_form);
		
		   name = (EditText) findViewById(R.id.editText1);
		   age = (Spinner) findViewById(R.id.age);
		   email = (EditText) findViewById(R.id.editText20);		   
		   
	}
	
	public void uploadForm(View view)
	{
		
		
		
	}
	
	
}

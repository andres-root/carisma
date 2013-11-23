package com.bogota.carisma.view;

import com.bogota.carisma.R;

import android.app.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class ActivitySplash extends Activity {

	private Handler handler;     
    private boolean firtsTime=false;
	
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		
		setContentView(R.layout.activity_splash);
		
		handler = new Handler();
		
        handler.postDelayed(getRunnableStartApp(), 5000);
		
	}
	
	private Runnable getRunnableStartApp(){
        	
        Runnable runnable = new Runnable(){
            
        public void run(){

	        	 if(firtsTime){
	        		 	   
	        		 /*
	        		 Intent intent = new Intent(ActivitySplash.this, MainActivity.class);
	                 startActivity(intent);
	                 finish();  		
	        		 */
	        	 }else if (!firtsTime){
	        		 	/*        		        		 
	        		 Intent intent = new Intent(ActivitySplash.this, ActivityLogin.class);
	        		 startActivity(intent);
	        		 finish(); 
 		 */
	        	 }

           }
        
        };
        
        
        return runnable;
        
    }
	
	
}


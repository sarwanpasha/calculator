package com.example.calculator;


import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	Button Add,subtract,mul,div,submit,star,hash,equal,clear;
	Button one,two,three,four,five,six,seven,eight,nine,zero;
	EditText show;
	int value;
	int second_value;
	String operator;
	boolean op=false; 
	float numberof;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show=(EditText)findViewById(R.id.tvShow);
       
//        for(int id:idList){
//        	View v=(View)findViewById(id);
//        	v.setOnClickListener(btnClick);
//        }
        
        Add = (Button)findViewById(R.id.btn_plus);
    	subtract = (Button)findViewById(R.id.btn_minus);
    	mul = (Button)findViewById(R.id.btn_mul);
    	div = (Button)findViewById(R.id.btn_div);
    	submit = (Button)findViewById(R.id.btnSubmit);
    	one = (Button)findViewById(R.id.btn1);
    	two = (Button)findViewById(R.id.btn2);
    	three = (Button)findViewById(R.id.btn3);
    	four = (Button)findViewById(R.id.btn4);
    	five = (Button)findViewById(R.id.btn5);
    	six = (Button)findViewById(R.id.btn6);
    	seven = (Button)findViewById(R.id.btn7);
    	eight = (Button)findViewById(R.id.btn8);
    	nine = (Button)findViewById(R.id.btn9);
    	zero = (Button)findViewById(R.id.btn_zero);
    	star = (Button)findViewById(R.id.btn_star);
    	hash = (Button)findViewById(R.id.btn_hash);
    	show = (EditText)findViewById(R.id.tvShow);
    	show.setText(String.valueOf(value));
    	clear = (Button)findViewById(R.id.btn_clear);
    	equal = (Button)findViewById(R.id.btn_equal);
    	
    	
    	Add.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			nMath("+");
    			
    		}
    	});
    	
    	subtract.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			nMath("-");
    			
    		}
    	});
    	
    	mul.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			nMath("*");
    			
    		}
    	});
    	
    	div.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			nMath("/");
    			
    		}
    	});
    	equal.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			nResult();
    			
    		}
    	});
    	
    	submit.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			nResult();
    			
    		}
    	});
    	
    	one.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("1");
    			
    		}
    	});
    	
    	two.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("2");
    			
    		}
    	});
    	
    	three.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("3");
    			
    		}
    	});
    	
    	four.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("4");
    			
    		}
    	});
    	
    	five.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("5");
    			
    		}
    	});
    	
    	six.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("6");
    			
    		}
    	});
    	
    	seven.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("7");
    			
    		}
    	});
    	
    	eight.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("8");
    			
    		}
    	});
    	
    	nine.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("9");
    			
    		}
    	});
    	
    	zero.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("0");
    			
    		}
    	});
    	
    	star.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("*");
    			
    		}
    	});
    	
    	hash.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			getKeyboard("#");
    			
    		}
    	});
    	clear.setOnClickListener(new View.OnClickListener() {
     		
     		@Override
     		public void onClick(View arg0) {
     			show.setText("0");
    			operator="";
    			numberof=0;
    			
    		}
     	});
        
    }

    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void nMath(String str){
    	
    	numberof=Float.parseFloat(show.getText().toString());
    	operator=str;
    	show.setText("0");
    	
    	
    }
    public void getKeyboard(String str){
    	String scrCurrent=show.getText().toString();
    	scrCurrent =str;
    	show.setText(scrCurrent);
    	
    }
    public void nResult(){
    	float numof=Float.parseFloat(show.getText().toString());
    	float result=0;
    	if(operator.equals("+")){
    		result= numof + numberof;
    	}
    	if(operator.equals("-")){
    		result= numberof - numof;
    	}
    	if(operator.equals("*")){
    		result= numof * numberof;
    	}
	if(operator.equals("/")){
		result= numberof /numof ;
	}
	show.setText(String.valueOf(result));
    }

}

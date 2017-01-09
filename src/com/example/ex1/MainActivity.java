package com.example.catchybus_1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class Sec_activity extends Activity {
	TextView res1;
	TextView res2;
	TextView res3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		res1 = (TextView) findViewById(R.id.text1);
		res2 = (TextView) findViewById(R.id.text2);
		res3 = (TextView) findViewById(R.id.text3);
		Typeface tfont = Typeface.createFromAsset(getAssets(),
				"AlexBrush-Regular.ttf");
		Typeface t1font = Typeface.createFromAsset(getAssets(),
				"DeliusSwashCaps-Regular.ttf");
		Typeface t2font = Typeface.createFromAsset(getAssets(),
				"KaushanScript-Regular.otf");
		Intent i = getIntent();
		String datafrmMain = i.getStringExtra("username");
		res1.setTypeface(tfont);
		res1.setText("hey " + datafrmMain);
		res2.setTypeface(t1font);
		res2.setText("Hi " + datafrmMain);
		res3.setTypeface(t2font);
		res3.setText("Welcome to catchy bus " + datafrmMain);

	}

}

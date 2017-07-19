package com.acadgild.assignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button btnHideSeek;
	TextView textPic;

	boolean hide = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Instantiation of widgets

		btnHideSeek = (Button) findViewById(R.id.buttonHideSeek);
		textPic = (TextView) findViewById(R.id.textData);

		btnHideSeek.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {

		switch (view.getId()) {
		case R.id.buttonHideSeek:
			if (hide) {
				hide = false;
				textPic.setVisibility(View.VISIBLE);
				btnHideSeek.setText("HIDE");
			}
			else{
				hide = true;
				textPic.setVisibility(View.INVISIBLE);
				btnHideSeek.setText("SEEK");
			}
		}

	}

}
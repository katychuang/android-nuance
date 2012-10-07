package com.tapped.nfc;

//import com.tapped.nfc.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.text.Html;
import android.widget.TextView;


public class MainActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    String html = "DETAILS<br> " +
    		"-------------------------<br /> " +
    		"Name: Cranberry<br /> " +
    		"RGB: 255, 68, 68<br />" +
    		"Hex: #FF4444<br>";
	  TextView mTextView = (TextView)findViewById(R.id.detail1);
	  mTextView.setText(Html.fromHtml(html));
  }


}

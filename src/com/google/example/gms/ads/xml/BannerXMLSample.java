package com.google.example.gms.ads.xml;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class BannerXMLSample extends Activity
{
	WebView view;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);


		AdRequest adRequest = new AdRequest.Builder().build();
		AdView adView = (AdView) this.findViewById(R.id.adView);
		adView.loadAd(adRequest);
		
	}
	

}

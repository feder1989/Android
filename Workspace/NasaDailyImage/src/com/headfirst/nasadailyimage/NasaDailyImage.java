package com.headfirst.nasadailyimage;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class NasaDailyImage extends Activity {

	TextView titleView, dateView, descriptionView;
	ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		IotdHandler handler = new IotdHandler();
		handler.processFeed();
		resetDisplay(handler.getTitle(), handler.getDate(), handler.getImage(),
				handler.getDescription());
	}

	private void initialize() {
		titleView = (TextView) findViewById(R.id.imageTittle);
		dateView = (TextView) findViewById(R.id.imageDate);
		imageView = (ImageView) findViewById(R.id.imageDisplay);
		descriptionView = (TextView) findViewById(R.id.imageDescription);
	}

	private void resetDisplay(String title, String date, Bitmap image,
			StringBuffer description) {
		this.titleView.setText(title);
		this.dateView.setText(date);
		this.imageView.setImageBitmap(image);
		this.descriptionView.setText(description);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nasa_daily_image, menu);
		return true;
	}

}

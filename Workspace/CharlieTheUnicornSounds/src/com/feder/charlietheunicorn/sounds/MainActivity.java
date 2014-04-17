package com.feder.charlietheunicorn.sounds;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	MediaPlayer intro;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		intro = MediaPlayer.create(MainActivity.this, R.raw.hey_charlie);
		intro.start();
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(2800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openMenu = new Intent(
							"com.feder.charlietheunicorn.sounds.MENUBOTONES");
					startActivity(openMenu);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		intro.release();
		finish();
	}
}

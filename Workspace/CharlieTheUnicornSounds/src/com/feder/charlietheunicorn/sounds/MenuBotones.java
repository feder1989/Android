package com.feder.charlietheunicorn.sounds;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.media.MediaPlayer;

public class MenuBotones extends Activity implements OnClickListener {

	Button btnGlup, btnNoFugu, btnPutABanana, btnSparkle;
	MediaPlayer sonido;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_sounds);
		initializerWidgets();
		btnGlup.setOnClickListener(this);
		btnNoFugu.setOnClickListener(this);
		btnPutABanana.setOnClickListener(this);
		btnSparkle.setOnClickListener(this);
	}

	private void initializerWidgets() {
		btnGlup = (Button) findViewById(R.id.btnGlup);
		btnNoFugu = (Button) findViewById(R.id.btnNoooFugu);
		btnPutABanana = (Button) findViewById(R.id.btnPutABanana);
		btnSparkle = (Button) findViewById(R.id.btnSparkle);
	}

	@Override
	public void onClick(View v) {
		if (sonido != null) {
			sonido.release();
		}
		switch (v.getId()) {
		case R.id.btnGlup:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.glup);
			break;
		case R.id.btnNoooFugu:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.nooo_fugu);
			break;
		case R.id.btnPutABanana:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.put_a_banana);
			break;
		case R.id.btnSparkle:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.sparkle);
			break;
		default:
			break;
		}
		sonido.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		sonido.release();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

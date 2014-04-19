package com.feder.charlietheunicorn.sounds;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class MenuBotones extends Activity implements OnClickListener {

	Button btnBananaKing, btnBrurrr, btnCandyMountain, btnCharlieWakeup,
			btnCharlieee, btnGlup, btnGoCandyMountain, btnNoFugu,
			btnPutABanana, btnSparkle, btnLalala, btnLeopleuradon,
			btnNoooDarkness, btnShuggaShoe, btnShutup, btnSwimAway,
			btnChuuShoe, btnAmulet, btnBridge, btnZeta, btnFishes, btnFuture,
			btnNarwhal, btnRing, btnSneaky, btnWhale, btnDoor;
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
		btnBananaKing.setOnClickListener(this);
		btnBrurrr.setOnClickListener(this);
		btnCandyMountain.setOnClickListener(this);
		btnCharlieWakeup.setOnClickListener(this);
		btnCharlieee.setOnClickListener(this);
		btnGoCandyMountain.setOnClickListener(this);
		btnLalala.setOnClickListener(this);
		btnLeopleuradon.setOnClickListener(this);
		btnNoooDarkness.setOnClickListener(this);
		btnShuggaShoe.setOnClickListener(this);
		btnShutup.setOnClickListener(this);
		btnSwimAway.setOnClickListener(this);
		btnChuuShoe.setOnClickListener(this);
		btnAmulet.setOnClickListener(this);
		btnBridge.setOnClickListener(this);
		btnZeta.setOnClickListener(this);
		btnFishes.setOnClickListener(this);
		btnFuture.setOnClickListener(this);
		btnNarwhal.setOnClickListener(this);
		btnRing.setOnClickListener(this);
		btnSneaky.setOnClickListener(this);
		btnWhale.setOnClickListener(this);
		btnDoor.setOnClickListener(this);
	}

	private void initializerWidgets() {
		btnGlup = (Button) findViewById(R.id.btnGlup);
		btnNoFugu = (Button) findViewById(R.id.btnNoooFugu);
		btnPutABanana = (Button) findViewById(R.id.btnPutABanana);
		btnSparkle = (Button) findViewById(R.id.btnSparkle);
		btnBananaKing = (Button) findViewById(R.id.btnBananaKing);
		btnBrurrr = (Button) findViewById(R.id.btnBrurrr);
		btnCandyMountain = (Button) findViewById(R.id.btnCandyMountain);
		btnCharlieWakeup = (Button) findViewById(R.id.btnHeyCharlieWakeup);
		btnCharlieee = (Button) findViewById(R.id.btnCharlieee);
		btnGoCandyMountain = (Button) findViewById(R.id.btnGoCandyMountain);
		btnLalala = (Button) findViewById(R.id.btnLalala);
		btnLeopleuradon = (Button) findViewById(R.id.btnLeopleuradon);
		btnNoooDarkness = (Button) findViewById(R.id.btnNoooDarkness);
		btnShuggaShoe = (Button) findViewById(R.id.btnShuggaShoe);
		btnShutup = (Button) findViewById(R.id.btnShutUp);
		btnSwimAway = (Button) findViewById(R.id.btnSwimAway);
		btnChuuShoe = (Button) findViewById(R.id.btnChuuShoe);
		btnAmulet = (Button) findViewById(R.id.btnAmulet);
		btnBridge = (Button) findViewById(R.id.btnBridge);
		btnZeta = (Button) findViewById(R.id.btnZeta);
		btnFishes = (Button) findViewById(R.id.btnFishesLoveYou);
		btnFuture = (Button) findViewById(R.id.btnInTheFuture);
		btnNarwhal = (Button) findViewById(R.id.btnNarwhal);
		btnRing = (Button) findViewById(R.id.btnRingRing);
		btnSneaky = (Button) findViewById(R.id.btnSneaky);
		btnWhale = (Button) findViewById(R.id.btnWhale);
		btnDoor = (Button) findViewById(R.id.btnDoor);
	}

	@Override
	public void onClick(View v) {
		if (sonido != null) {
			try {
				sonido.release();
			} catch (Exception e) {
				e.printStackTrace();
			}

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
		case R.id.btnBananaKing:
			sonido = MediaPlayer.create(MenuBotones.this,
					R.raw.youre_banana_king);
			break;
		case R.id.btnBrurrr:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.brurrr);
			break;
		case R.id.btnCandyMountain:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.candy_mountain);
			break;
		case R.id.btnHeyCharlieWakeup:
			sonido = MediaPlayer.create(MenuBotones.this,
					R.raw.hey_charlie_wakeup);
			break;
		case R.id.btnCharlieee:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.charlieee);
			break;
		case R.id.btnGoCandyMountain:
			sonido = MediaPlayer.create(MenuBotones.this,
					R.raw.go_candy_mountain);
			break;
		case R.id.btnLalala:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.la_la_la);
			break;
		case R.id.btnLeopleuradon:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.leopleuradon);
			break;
		case R.id.btnNoooDarkness:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.nooo_darkness);
			break;
		case R.id.btnShuggaShoe:
			sonido = MediaPlayer.create(MenuBotones.this,
					R.raw.shugga_shugaa_shoe_shoe);
			break;
		case R.id.btnShutUp:
			sonido = MediaPlayer.create(MenuBotones.this,
					R.raw.shutup_unbeliever);
			break;
		case R.id.btnSwimAway:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.swim_away);
			break;
		case R.id.btnChuuShoe:
			sonido = MediaPlayer.create(MenuBotones.this,
					R.raw.the_chu_chu_shoe);
			break;
		case R.id.btnAmulet:
			sonido = MediaPlayer.create(MenuBotones.this,
					R.raw.the_magic_amulet);
			break;
		case R.id.btnBridge:
			sonido = MediaPlayer.create(MenuBotones.this,
					R.raw.the_magic_bridge);
			break;
		case R.id.btnZeta:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.zeta);
			break;
		case R.id.btnFishesLoveYou:
			sonido = MediaPlayer
					.create(MenuBotones.this, R.raw.fishes_love_you);
			break;
		case R.id.btnInTheFuture:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.in_the_future);
			break;
		case R.id.btnNarwhal:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.narwhal);
			break;
		case R.id.btnRingRing:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.ring_ring);
			break;
		case R.id.btnSneaky:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.sneaky);
			break;
		case R.id.btnWhale:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.whale);
			break;
		case R.id.btnDoor:
			sonido = MediaPlayer.create(MenuBotones.this, R.raw.the_door);
			break;
		default:
			sonido = null;
			break;
		}
		if (sonido != null) {
			sonido.start();
			sonido.setOnCompletionListener(new OnCompletionListener() {
				public void onCompletion(MediaPlayer mp) {
					mp.release();
				};
			});
		}
	}

	@Override
	protected void onPause() {
		super.onPause();
		try {
			sonido.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

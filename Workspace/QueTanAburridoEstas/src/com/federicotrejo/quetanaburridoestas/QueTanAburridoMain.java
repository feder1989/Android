package com.federicotrejo.quetanaburridoestas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class QueTanAburridoMain extends Activity {
	
	int nivel;
	Button btnAburrido, btnEmail;
	TextView tvNivel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.que_tan_aburrido_main);
		
		nivel = 0;
		btnAburrido = (Button) findViewById(R.id.btnAburrido);
		tvNivel = (TextView) findViewById(R.id.tvNivel);
		btnEmail = (Button) findViewById(R.id.btnEmail);
		
		btnAburrido.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				nivel++;
				tvNivel.setText("" + nivel);				
			}
		});
		
		btnEmail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentEmail = new Intent("com.federicotrejo.quetanaburridoestas.EMAIL");
				startActivity(intentEmail);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.que_tan_aburrido_main, menu);
		return true;
	}

}

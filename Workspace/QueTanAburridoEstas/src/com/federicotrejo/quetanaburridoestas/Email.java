package com.federicotrejo.quetanaburridoestas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements View.OnClickListener {

	EditText personsEmail, personsName;
	String emailAdd, name;
	Button sendEmail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initializeVars();
		sendEmail.setOnClickListener(this);
	}

	private void initializeVars() {
		personsEmail = (EditText) findViewById(R.id.etEmail);
		personsName = (EditText) findViewById(R.id.etName);
		sendEmail = (Button) findViewById(R.id.bSentEmail);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub

		convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
		String emailaddress[] = { emailAdd };
		String message = "Hola! Soy"
				+ name
				+ " y queria decirte que estuve midiendo mi nivel de aburrimiento."
				+ '\n' + "PS. Sigo aburrido";
		
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Asi de aburrido");
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);

	}

	private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
		// TODO Auto-generated method stub
		emailAdd = personsEmail.getText().toString();
		name = personsName.getText().toString();		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}

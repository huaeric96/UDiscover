package com.example.udiscover;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Check GPS
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void onTourClicked(View view)
	{
		Intent intent = new Intent(this, GetTourActivity.class);

		startActivity(intent);
	}

	public void onDirectionsClicked(View view)
	{
		Intent intent = new Intent(this, GetTourActivity.class);

		startActivity(intent);
	}

	public void onInformationClicked(View view)
	{
		Intent intent = new Intent(this, GetDirectionsActivity.class);

		startActivity(intent);
	}

}

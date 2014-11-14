package ctec.sampleandroidstateproject.controller;

import ctec.sampleandroidstateproject.model.AndroidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Transfer data class for the controller.
 * @author S. McKell Nichols
 * @version 1.0
 */
public class TransferDataActivity extends Activity
{
	/**
	 * Calls the appState for the class.
	 */
	private AndroidAppState appState;
	/**
	 * Provides the text that will be used to display info inserted on the first screen by the user.
	 */
	private TextView comboText;
	/**
	 * Button that returns the user to the home page.
	 */
	private Button homeButton;
	
	/**
	 * onCreate method. Initalizes the method and calls components - appState, text view, and button.
	 * Also calls the listeners.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transfer_data);
		
		appState = (AndroidAppState) getApplication();
		comboText = (TextView) findViewById(R.id.combinedTextView);
		homeButton = (Button) findViewById(R.id.homeButton);
		
		comboText.setText(appState.getName() + " is " + appState.getAge() + " and says " + appState.getStuff() + " about " + appState.getPhrase());
		
		setupListeners();
	}
	
	/**
	 * Method that creates the listeners for the class.
	 * In this case there is only one button that returns the user home.
	 */
	private void setupListeners()
	{
		homeButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
			}
		});
	}
}

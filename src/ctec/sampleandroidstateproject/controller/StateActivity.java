package ctec.sampleandroidstateproject.controller;

import ctec.sampleandroidstateproject.model.AndroidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * The state activity for the controller class.
 * @author S. McKell Nichols
 * @version 1.0
 */
public class StateActivity extends Activity
{
	/**
	 * Text fields for the class.
	 */
	private EditText ageField, nameField, phraseField, stuffField;
	/**
	 * Button used to switch between screens.
	 */
	private Button changeButton;
	/**
	 * Creates the appState for the class.
	 */
	private AndroidAppState appState;
	
	/**
	 * onCreate method. Initializes the method and calls the different components - text fields, button, and appState.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_state);
		
		ageField = (EditText) findViewById(R.id.ageEditText);
		nameField = (EditText) findViewById(R.id.nameEditText);
		phraseField = (EditText) findViewById(R.id.phraseEditText);
		stuffField = (EditText) findViewById(R.id.stuffEditText);
		changeButton = (Button) findViewById(R.id.swapButton);
		
		appState = (AndroidAppState) getApplication();
		
		setupListeners();
	}
	
	/**
	 * Place to set up and keep the listeners of the project.
	 * In this case, there is only one button as of yet to switch between screens.
	 */
	private void setupListeners()
	{
		changeButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				appState.setName(nameField.getText().toString());
				appState.setAge(ageField.getText().toString());
				appState.setPhrase(phraseField.getText().toString());
				appState.setStuff(stuffField.getText().toString());
				
				Intent otherScreenIntent = new Intent(currentView.getContext(), TransferDataActivity.class);
				startActivityForResult(otherScreenIntent, 0);
			}
		});
	}
}

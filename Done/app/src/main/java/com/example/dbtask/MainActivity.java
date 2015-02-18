package com.example.dbtask;

import com.example.dbtask2.HomeScreen;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * FIRST ACTIVITY OF THE ASSIGNMENT FROM WHERE APPLICATION IS DIRECTED TO THE BOTH TASKS.
 * 
 * @author Android
 *
 */
public class MainActivity extends ActionBarActivity {


	private EditText mStudentIdEditText=null;               //set student id edit text to null
	private Button mSubmitButton=null;                      //set submit button to null


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mStudentIdEditText = (EditText)findViewById(R.id.studentId_edittext);
		mSubmitButton =(Button)findViewById(R.id.Submit_button);
		mSubmitButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				
				//STUDENT ID'S STORED AS AN STATIC VALUE 
				Constant.student_id = mStudentIdEditText.getText().toString();
				if(Constant.student_id!=null && Constant.student_id.length()>0 ){           //Student ID has to be greater than 0

					Intent intent = new Intent(MainActivity.this, HomeScreen.class);        // start a new intent and go to home screen
					startActivity(intent);

					/*showAlertDialog("Message", "Select the type of DB?", MainActivity.this, false);*/
				}else{
					Toast.makeText(MainActivity.this, "Please enter your student Id.", Toast.LENGTH_SHORT).show();  // shows a text saying that you need to enter a student id
				}

			}
		});

	}
}

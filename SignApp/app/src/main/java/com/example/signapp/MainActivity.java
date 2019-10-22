package com.example.signapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public final static String EXTRA_MESSAGE = "key";
    public final static String Extra_Message2 = "key2";

    public void sign_up(View v){

        Intent sign_upActivity = new Intent(getApplicationContext(),Profile.class);

        EditText FirstNameET = (EditText) findViewById(R.id.FirstNameET);
        EditText LastNameET = (EditText) findViewById(R.id.LastNameET);

        String textFN = FirstNameET.getText().toString();
        String textLN = LastNameET.getText().toString();

        sign_upActivity.putExtra(EXTRA_MESSAGE,textFN);
        sign_upActivity.putExtra(Extra_Message2,textLN);

        startActivity(sign_upActivity);
    }

    public void Register(View v){

        Intent RegisterActivity = new Intent(getApplicationContext(),Register.class);

        startActivity(RegisterActivity);

    }
}

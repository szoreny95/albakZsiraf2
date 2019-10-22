package com.example.signapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public final static String Message = "key";
    public final static String Message2 = "key2";
    public final static String Message3 = "key3";

    public void Register(View view)
    {
        Intent sign_upActivity = new Intent(getApplicationContext(),Profile.class);

        EditText FirstName = (EditText) findViewById(R.id.FirsNameRS_id);
        EditText LastName = (EditText) findViewById(R.id.LastNameRS_id);
        EditText Department = (EditText) findViewById(R.id.DepartmentRS_id);

        String FirstName_text = FirstName.getText().toString();
        String LastName_text = LastName.getText().toString();
        String Department_text = Department.getText().toString();

        sign_upActivity.putExtra(Message,FirstName_text);
        sign_upActivity.putExtra(Message2,LastName_text);
        sign_upActivity.putExtra(Message3,Department_text);

        startActivity(sign_upActivity);

    }
}

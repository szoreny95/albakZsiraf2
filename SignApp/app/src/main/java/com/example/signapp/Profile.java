package com.example.signapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView FirstNamePF = (TextView) findViewById(R.id.FirstNamePF);
        TextView LastNamePF = (TextView) findViewById(R.id.LastNamePF);
        TextView DepartmentPF = (TextView) findViewById(R.id.DepartmentPF);

        Intent intent = getIntent();

        String message;
        String message2;
        String message3;
        String message4;
        String message5;


            message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
            message2 = intent.getStringExtra(MainActivity.Extra_Message2);

            FirstNamePF.setText(message);
            LastNamePF.setText(message2);
            DepartmentPF.setText("-");

            message3 = intent.getStringExtra(Register.Message);
            message4 = intent.getStringExtra(Register.Message2);
            message5 = intent.getStringExtra(Register.Message3);

            FirstNamePF.setText(message3);
            LastNamePF.setText(message4);
            DepartmentPF.setText(message5);
    }
}

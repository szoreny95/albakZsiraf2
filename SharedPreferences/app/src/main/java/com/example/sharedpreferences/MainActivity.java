package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static final String MY_PREFS_NAME = "MyPrefsFile";

    @Override
    public void onPause() {
        super.onPause();

        CheckBox checkBox= (CheckBox) findViewById(R.id.checkBox);

        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();

        if(checkBox.isChecked())
            savePreferences();
        else{
            editor.clear();
            editor.commit();
        }

    }

    @Override
    public void onResume() {
        super.onResume();

        loadPreferences();
    }

    public void Calendar(View view){

        final TextView date=(TextView) findViewById(R.id.ChosenDate);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        final int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                        date.setText(day + "/" + month + "/" + year);

                    }
                }, year , month , dayOfMonth);

        datePickerDialog.show();

    }

    private void Clear(){

        TextView Name_id=(TextView) findViewById(R.id.Name_id) ;
        TextView Email_id=(TextView) findViewById(R.id.Email_id);

        Name_id.setText("");
        Email_id.setText("");
    }

    private void savePreferences() {

        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();

        // Edit and commit
        TextView Name_id=(TextView) findViewById(R.id.Name_id) ;
        TextView Email_id=(TextView) findViewById(R.id.Email_id);

        String Name = Name_id.getText().toString();
        String Email = Email_id.getText().toString();

        editor.putString("name", Name);
        editor.putString("Email",Email);
        editor.commit();
    }

    private void loadPreferences() {

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);

        TextView Name_id=(TextView) findViewById(R.id.Name_id) ;
        TextView Email_id=(TextView) findViewById(R.id.Email_id);

        String name = prefs.getString("name", "");
        Name_id.setText(name);
        String Email = prefs.getString("Email","");
        Email_id.setText(Email);

    }

}
package com.example.pickerfortime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTime(View view)
    {
        DialogFragment newFragment = new BlankFragment();
        newFragment.show(getSupportFragmentManager(),getString(R.string.timepicker));
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        // Convert time elements into strings.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // Assign the concatenated strings to timeMessage.
        String timeMessage = (hour_string + ":" + minute_string);

        Toast.makeText(this,getString(R.string.time1)
                + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
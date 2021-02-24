package com.example.lauron_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.display);

        int birthMonth = 4;
        int birthDay = 25;
        int birthYear = 2004;

        int currentMonth = 2;
        int currentDay = 24;
        int currentYear = 2021;

        int myageinmonths, myageindays, myageinyears;

        if(birthMonth > currentMonth){
            currentMonth += 12;
            currentYear -= 1;
        }

        if(birthDay > currentDay){
            currentDay += 31;
            currentMonth -= 1;
        }

        myageinmonths = currentMonth - birthMonth;
        myageindays = currentDay - birthDay;
        myageinyears = currentYear - birthYear;

        display.setText("My precise age is\n"+String.valueOf(myageinyears)+" Years,\n"+String.valueOf(myageinmonths)+" Months,\n"+String.valueOf(myageindays)+" Days.");

    }
}

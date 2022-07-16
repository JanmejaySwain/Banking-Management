package com.basicbankingmanagement.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.basicbankingmanagement.DBHelper;
import com.basicbankingmanagement.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button viewUser , history;
    DBHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        viewUser = findViewById(R.id.alluser);
        history = findViewById(R.id.historybutton);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), HistoryActivity.class));
            }
        });


        dbhelper = new DBHelper(this);
        Log.d("MainActivity", "DATABASE ADD DATA STARTED");



        dbhelper.addContacts("Gayatri Mohapatra", "1111103", "10000", "5454545454654");
        dbhelper.addContacts("Jagamohan Swain", "1111102", "10000", "46546546546546");
        dbhelper.addContacts("Samarendra Swain", "1111111", "10000", "65465465465465");
        dbhelper.addContacts("Akuli Swain", "11111012", "10000", "46546546546546");
        dbhelper.addContacts("Subhalaxmi Swain", "1111113", "10000", "65465465465465");
        dbhelper.addContacts("Kriti Kumar Behera", "1111109", "10000", "9090323291");
        dbhelper.addContacts("Janmejay Swain", "1111101", "10000", "65465456");
        dbhelper.addContacts("Mrityunjay Patra", "1111110", "10000", "654654654654");
        dbhelper.addContacts("Saurav Sharma", "1111107", "10000", "5454456454");
        dbhelper.addContacts("Chitaranjan Sethy", "1111105", "10000", "54544654654654");
        dbhelper.addContacts("Pratush Kumar Tripathy", "1111106", "10000", "5445454465");
        dbhelper.addContacts("Rajashree Mohapatra", "1111104", "10000", "554545454545");
        dbhelper.addContacts("Sritam Samal", "1111108", "10000", "45454544545454");
        Log.d("MainActivity", "DATABASE END INSERT");
        viewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("sonu", "MainActivity On Click Button");
                startActivity(new Intent(MainActivity.this, AllUserList.class));
            }
        });

    }
}
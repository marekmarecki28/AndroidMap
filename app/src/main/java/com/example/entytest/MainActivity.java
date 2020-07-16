package com.example.entytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view)
    {
        Intent intent = new Intent(this, ShowMapActivity.class);
        startActivity(intent);
    }

    public void searchMap(View view)
    {
        Intent intent = new Intent(this, SearchMapActivity.class);
        startActivity(intent);
    }
}
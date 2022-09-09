package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Abtyoga extends AppCompatActivity
{
    TextView tabtyog, tcontents;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abtyoga);

        tabtyog = findViewById(R.id.tabtyog);
        tcontents = findViewById(R.id.tabtyog);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
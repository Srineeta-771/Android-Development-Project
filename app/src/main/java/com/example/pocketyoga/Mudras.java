package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Mudras extends AppCompatActivity
{
    TextView tgyan, tchinmaya, tvayu, tagni, tvarun, tprana, tshunya, tsurya, tprithvi, tadi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudras);

        tgyan= findViewById(R.id.tgyan);
        tchinmaya= findViewById(R.id.tchinmaya);
        tvayu= findViewById(R.id.tvayu);
        tagni= findViewById(R.id.tagni);
        tvarun= findViewById(R.id.tvarun);
        tprana= findViewById(R.id.tprana);
        tshunya= findViewById(R.id.tshunya);
        tsurya= findViewById(R.id.tsurya);
        tprithvi= findViewById(R.id.tprithvi);
        tadi= findViewById(R.id.tadi);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
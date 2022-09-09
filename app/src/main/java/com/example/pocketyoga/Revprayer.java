package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Revprayer extends AppCompatActivity 
{
    VideoView vrevprayer;
    ImageButton ibrevprayer;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revprayer);

        ibrevprayer = (ImageButton)findViewById(R.id.ibrevprayer);
        ibrevprayer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vrevprayer = (VideoView)findViewById(R.id.vrevprayer);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.revprayer;
        Uri uri = Uri.parse(videoPath);
        vrevprayer.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vrevprayer.setMediaController(mediaController);
        mediaController.setAnchorView(vrevprayer);
    }

    public void openDialog()
    {
        RevprayerDialog revprayerdialog = new RevprayerDialog();
        revprayerdialog.show(getSupportFragmentManager(), "revprayer dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
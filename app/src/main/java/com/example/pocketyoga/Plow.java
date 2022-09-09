package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Plow extends AppCompatActivity 
{
    VideoView vplow;
    ImageButton ibplow;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plow);

        ibplow = (ImageButton)findViewById(R.id.ibplow);
        ibplow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vplow = (VideoView)findViewById(R.id.vplow);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.plow;
        Uri uri = Uri.parse(videoPath);
        vplow.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vplow.setMediaController(mediaController);
        mediaController.setAnchorView(vplow);
    }

    public void openDialog()
    {
        PlowDialog plowdialog = new PlowDialog();
        plowdialog.show(getSupportFragmentManager(), "plow dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Bridge extends AppCompatActivity 
{
    VideoView vbridge;
    ImageButton ibbridge;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);

        ibbridge = (ImageButton)findViewById(R.id.ibbridge);
        ibbridge.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vbridge = (VideoView)findViewById(R.id.vbridge);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.bridge;
        Uri uri = Uri.parse(videoPath);
        vbridge.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vbridge.setMediaController(mediaController);
        mediaController.setAnchorView(vbridge);
    }

    public void openDialog()
    {
        BridgeDialog bridgedialog = new BridgeDialog();
        bridgedialog.show(getSupportFragmentManager(), "bridge dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
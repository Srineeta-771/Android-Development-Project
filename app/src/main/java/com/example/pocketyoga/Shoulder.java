package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Shoulder extends AppCompatActivity 
{
    VideoView vshoulder;
    ImageButton ibshoulder;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);

        ibshoulder = (ImageButton)findViewById(R.id.ibshoulder);
        ibshoulder.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vshoulder = (VideoView)findViewById(R.id.vshoulder);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.shoulder;
        Uri uri = Uri.parse(videoPath);
        vshoulder.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vshoulder.setMediaController(mediaController);
        mediaController.setAnchorView(vshoulder);
    }

    public void openDialog()
    {
        ShoulderDialog shoulderdialog = new ShoulderDialog();
        shoulderdialog.show(getSupportFragmentManager(), "shoulder dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
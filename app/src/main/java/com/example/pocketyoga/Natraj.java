package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Natraj extends AppCompatActivity 
{
    VideoView vnatraj;
    ImageButton ibnatraj;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natraj);

        ibnatraj = (ImageButton)findViewById(R.id.ibnatraj);
        ibnatraj.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vnatraj = (VideoView)findViewById(R.id.vnatraj);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.natraj;
        Uri uri = Uri.parse(videoPath);
        vnatraj.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vnatraj.setMediaController(mediaController);
        mediaController.setAnchorView(vnatraj);
    }

    public void openDialog()
    {
        NatrajDialog natrajdialog = new NatrajDialog();
        natrajdialog.show(getSupportFragmentManager(), "natraj dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
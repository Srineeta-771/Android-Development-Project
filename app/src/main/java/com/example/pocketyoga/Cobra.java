package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Cobra extends AppCompatActivity 
{
    VideoView vcobra;
    ImageButton ibcobra;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobra);

        ibcobra = (ImageButton)findViewById(R.id.ibcobra);
        ibcobra.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vcobra = (VideoView)findViewById(R.id.vcobra);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.cobra;
        Uri uri = Uri.parse(videoPath);
        vcobra.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vcobra.setMediaController(mediaController);
        mediaController.setAnchorView(vcobra);
    }

    public void openDialog()
    {
        CobraDialog cobradialog = new CobraDialog();
        cobradialog.show(getSupportFragmentManager(), "cobra dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
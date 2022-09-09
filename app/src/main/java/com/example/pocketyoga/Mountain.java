package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Mountain extends AppCompatActivity
{
    VideoView vmountain;
    ImageButton ibmountain;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);

        ibmountain = (ImageButton)findViewById(R.id.ibmountain);
        ibmountain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vmountain = (VideoView)findViewById(R.id.vmountain);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.mountain;
        Uri uri = Uri.parse(videoPath);
        vmountain.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vmountain.setMediaController(mediaController);
        mediaController.setAnchorView(vmountain);
    }

    public void openDialog()
    {
        MountainDialog mountaindialog = new MountainDialog();
        mountaindialog.show(getSupportFragmentManager(), "mountain dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
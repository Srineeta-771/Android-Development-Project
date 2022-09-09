package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Camel extends AppCompatActivity 
{
    VideoView vcamel;
    ImageButton ibcamel;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camel);

        ibcamel = (ImageButton)findViewById(R.id.ibcamel);
        ibcamel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vcamel = (VideoView)findViewById(R.id.vcamel);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.camel;
        Uri uri = Uri.parse(videoPath);
        vcamel.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vcamel.setMediaController(mediaController);
        mediaController.setAnchorView(vcamel);
    }

    public void openDialog()
    {
        CamelDialog cameldialog = new CamelDialog();
        cameldialog.show(getSupportFragmentManager(), "camel dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
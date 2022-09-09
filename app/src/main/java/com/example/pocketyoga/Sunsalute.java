package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sunsalute extends AppCompatActivity
{
    VideoView vsunsalute;
    ImageButton ibsunsalute;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunsalute);

        ibsunsalute = (ImageButton)findViewById(R.id.ibsunsalute);
        ibsunsalute.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vsunsalute = (VideoView)findViewById(R.id.vsunsalute);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.sunsalute;
        Uri uri = Uri.parse(videoPath);
        vsunsalute.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vsunsalute.setMediaController(mediaController);
        mediaController.setAnchorView(vsunsalute);
    }

    public void openDialog()
    {
        SunsaluteDialog sunsalutedialog = new SunsaluteDialog();
        sunsalutedialog.show(getSupportFragmentManager(), "sunsalute dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sirsasana extends AppCompatActivity
{
    VideoView vsirsasana;
    ImageButton ibsirsasana;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirsasana);

        ibsirsasana = (ImageButton)findViewById(R.id.ibsirsasana);
        ibsirsasana.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vsirsasana = (VideoView)findViewById(R.id.vsirsasana);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.sirsasana;
        Uri uri = Uri.parse(videoPath);
        vsirsasana.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vsirsasana.setMediaController(mediaController);
        mediaController.setAnchorView(vsirsasana);
    }

    public void openDialog()
    {
        SirsasanDialog sirsasandialog = new SirsasanDialog();
        sirsasandialog.show(getSupportFragmentManager(), "sirsasan dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
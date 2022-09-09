package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Tree extends AppCompatActivity 
{
    VideoView vtree;
    ImageButton ibtree;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        ibtree = (ImageButton)findViewById(R.id.ibtree);
        ibtree.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDialog();
            }
        });

        vtree = (VideoView)findViewById(R.id.vtree);
        String videoPath = "android.resource://" +getPackageName()+ "/" + R.raw.tree;
        Uri uri = Uri.parse(videoPath);
        vtree.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vtree.setMediaController(mediaController);
        mediaController.setAnchorView(vtree);
    }

    public void openDialog()
    {
        TreeDialog treedialog = new TreeDialog();
        treedialog.show(getSupportFragmentManager(), "tree dialog");
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
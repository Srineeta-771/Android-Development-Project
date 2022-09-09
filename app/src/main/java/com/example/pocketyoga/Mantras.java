package com.example.pocketyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Mantras extends AppCompatActivity
{
    MediaPlayer player_om, player_gayatri;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantras);
    }

    /* For Om */
    public void omplay(View v)
    {
        if(player_om == null)
        {
            player_om= MediaPlayer.create(this,R.raw.om);
            player_om.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    omstopPlayer();
                }
            });
        }
        player_om.start();
    }

    public void ompause(View v)
    {
        if(player_om != null)
        {
            player_om.pause();
        }
    }

    public void omstop(View v)
    {
        omstopPlayer();
    }

    private void omstopPlayer()
    {
        if(player_om != null)
        {
            player_om.release();
            player_om = null;
            Toast.makeText(this, "Sopped!", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop()
    {
        super.onStop();
        omstopPlayer();
        gayatristopPlayer();
    }

    public void gayatriplay(View v)
    {
        if(player_gayatri == null)
        {
            player_gayatri= MediaPlayer.create(this,R.raw.gayatri);
            player_gayatri.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    gayatristopPlayer();
                }
            });
        }
        player_gayatri.start();
    }

    public void gayatripause(View v)
    {
        if(player_gayatri != null)
        {
            player_gayatri.pause();
        }
    }

    public void gayatristop(View v)
    {
        gayatristopPlayer();
    }

    private void gayatristopPlayer()
    {
        if(player_gayatri != null)
        {
            player_gayatri.release();
            player_gayatri = null;
            Toast.makeText(this, "Sopped!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}
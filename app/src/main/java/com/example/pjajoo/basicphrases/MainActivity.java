package com.example.pjajoo.basicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    public void say(final View view) {

        final int id = view.getId();
        Log.i("Clicked id ", Integer.toString(id));

        final String ourId = view.getResources().getResourceEntryName(id);
        Log.i("Our id ", ourId);

        final int resourceId = getResources().getIdentifier(ourId, "raw", getPackageName());
        Log.i("Resource id ", ourId);

        this.mediaPlayer = MediaPlayer.create(this, resourceId);
        if (this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.stop();
        }
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

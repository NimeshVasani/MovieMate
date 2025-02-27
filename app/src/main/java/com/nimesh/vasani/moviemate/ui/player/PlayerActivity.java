package com.nimesh.vasani.moviemate.ui.player;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import com.nimesh.vasani.moviemate.R;

import fr.bmartel.youtubetv.YoutubeTvView;

public class PlayerActivity extends Activity {
    YoutubeTvView youtubeTvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        youtubeTvView = findViewById(R.id.player);
        Intent intent = getIntent();
        youtubeTvView.playVideo(intent.getStringExtra("videoId"));
    }
}

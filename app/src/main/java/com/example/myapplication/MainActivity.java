package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = findViewById(R.id.video_view);
        videoView.start();
        String videoPath = "https://dl.dropboxusercontent.com/s/ioadtcwuvww3ve0/fcd4ea4b9de54c84983b92a9e7e88aca.mp4";
       // String videoPath = "http://mbnhls-lh.akamaihd.net/i/MBN_1@118619/master.m3u8";

        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}
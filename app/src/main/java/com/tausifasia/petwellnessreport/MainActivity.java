package com.tausifasia.petwellnessreport;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //create class reference
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vid = (VideoView) findViewById(R.id.videoView);

        VideoView videoview = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.home_page_video_webm);
        videoview.setVideoURI(uri);
        videoview.start();


        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

    }

    public void playVideo(View v) {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);

//        String path = "android.resource://com.tausifasia.petwellnessreport/"+R.raw.home_page_video_webm;
        String path = "android.resource://" + getPackageName() + "/" + R.raw.home_page_video_webm;

        Uri u = Uri.parse(path);

        vid.setVideoURI(u);

        vid.start();

    }
}
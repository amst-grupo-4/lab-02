package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video_View extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, YouTubePlayer.PlaybackEventListener {
    String claveYoutube="AIzaSyB3OLnHz8hI5J669HsVVpPF_6ZNvMwXOAY";
    YouTubePlayerView youTubePlayerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__view);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(claveYoutube,this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean fueRestaurado) {
        if(!fueRestaurado){
            youTubePlayer.cueVideo("n1lfYh-aUk0&ab_channel=DopeLyrics"); //https://www.youtube.com/watch?v=n1lfYh-aUk0&ab_channel=DopeLyrics
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if(youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, 1).show();
        }else{
            String erro="Error al inicializar Youtube"+youTubeInitializationResult.toString();
            Toast.makeText(getApplication(), "error", Toast.LENGTH_LONG).show();
            
        }
    }
    protected void onActivityResult(int requestCode, int resultcode, Intent data){
        if(resultcode==1){
            getYoutubePlayerProvider().initialize(claveYoutube,this);
        }
    }
    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return youTubePlayerView;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}
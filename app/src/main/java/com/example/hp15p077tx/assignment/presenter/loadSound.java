package com.example.hp15p077tx.assignment.presenter;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

import java.io.IOException;
import java.net.URL;


/**
 * Created by HP 15 P077 TX on 29-05-2017.
 */

public class loadSound {

    public MediaPlayer prepareAudio(String Url,MediaPlayer mp){
        try {
            mp.setDataSource("http://a.tumblr.com/tumblr_m9iqs5Z79D1qczjobo1.mp3");
            mp.prepareAsync();
            Log.d("loadSound","reached here");
            mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    Log.d("loadSound","passed here");
                    startAudio(mediaPlayer);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mp;
    }
    public MediaPlayer startAudio(MediaPlayer mediaPlayer){
        Log.d("loadSound","ended here");
        mediaPlayer.start();
        return mediaPlayer;
    }
    public void stopAudio(MediaPlayer mediaPlayer){
        mediaPlayer.stop();
    }
}

package com.dvinfotech.services_app1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Myservice extends Service {

    private MediaPlayer player;
    String msg = "dvinfotech:";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                player = MediaPlayer.create(getBaseContext(), Settings.System.DEFAULT_RINGTONE_URI);
                player.setLooping(true);
                player.start();

            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        return START_STICKY;

    }

    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_SHORT).show();
        player.stop();
        Log.d(msg, "The onDetroy() invoked");
    }
}

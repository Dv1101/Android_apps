package com.dvinfotech.background_service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    static final String msg = "dvinfotech";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(msg, "Service started");
    }

    public MyService() {


    }

    public int onStartCommand(Intent intent, int flags, int startId){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=5;i++)
                {
                    try{
                        Thread.sleep(5000);

                    }
                    catch(Exception e)
                    {

                    }
                    Log.i(msg,"Service has completed the task :::" +Integer.toString(i));
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(msg, "Service destroyed");
    }
}
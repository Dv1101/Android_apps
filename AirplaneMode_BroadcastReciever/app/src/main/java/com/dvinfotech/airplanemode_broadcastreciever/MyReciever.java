package com.dvinfotech.airplanemode_broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.TextView;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (isAirplaneModeOn(context.getApplicationContext())) {
            Toast.makeText(context, "AirPlane mode is on", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "AirPlane mode is off", Toast.LENGTH_LONG).show();
        }
    }

    private boolean isAirplaneModeOn(Context applicationContext) {
        return Settings.System.getInt(applicationContext.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;
    }
}

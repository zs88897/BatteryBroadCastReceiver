package com.example.a17164.broadcast_receiver;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class BatteryBroadcastReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)){
            int level=intent.getIntExtra("level",0);
            int scale=intent.getIntExtra("scale", 100);
            AlertDialog dialog=new AlertDialog.Builder(context).create();
            dialog.setTitle("system show");
            dialog.setMessage("the remain of battery"+level*100/scale+"%");
            dialog.setButton(DialogInterface.BUTTON_POSITIVE, "ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            dialog.show();
        }
    }
}

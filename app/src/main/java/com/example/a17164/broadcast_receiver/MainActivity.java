package com.example.a17164.broadcast_receiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_battery:
                
                registerReceiver(new BatteryBroadcastReciver(),new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
                break;
                default:
                    break;
        }
    }
}

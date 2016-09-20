package com.example.rm40300.demobroadcastreceiver.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("DemoBroadCast", "Boot Finalizado");
        Toast.makeText(context, "Boot Finalizado", Toast.LENGTH_LONG).show();
    }
}

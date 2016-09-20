package com.example.rm40300.demobroadcastreceiver.broadcastreceiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import com.example.rm40300.demobroadcastreceiver.R;

public class MeuBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentTitle(intent.getStringExtra("TITULO"));
        builder.setContentText(intent.getStringExtra("DESCRICAO"));
        builder.setTicker(intent.getStringExtra("TICKER"));
        builder.setSmallIcon(R.mipmap.ic_launcher);

        notificationManager.notify(100, builder.build());

        Toast.makeText(context, "Meu broadcast sendo executado!!: " + intent.getStringExtra("TESTE"), Toast.LENGTH_LONG).show();
    }
}

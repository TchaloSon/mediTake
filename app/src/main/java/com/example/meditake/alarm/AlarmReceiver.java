package com.example.meditake.alarm;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.meditake.HomeActivity;
import com.example.meditake.R;

import java.util.Timer;
import java.util.TimerTask;

/***
 "Created by  TETEREOU Aboudourazakou on "11/21/2022
 "Project name "MediTake
 */
public class AlarmReceiver  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent intent1=new Intent(context, HomeActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,intent1,0);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(context,"takemedicament")
                .setSmallIcon(R.drawable.pill_icon).setContentTitle("Prise de medicament")
                .setContentText("Bonjour!Il est temps de prendre vos medicaments")
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent) ;
        NotificationManagerCompat notificationManagerCompat=NotificationManagerCompat.from(context);
        notificationManagerCompat.notify(12,builder.build());

    }
}

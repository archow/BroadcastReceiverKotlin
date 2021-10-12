package com.example.broadcastreceiverkotlin

import android.app.PendingIntent
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class MainActivity : AppCompatActivity() {
    private var mDynamicBroadcastReciever: DynamicBroadcastReciever? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //register your broadcast receiver by:
        //creating an intent filter
        //creating an instance of your broadcast receiver
        //passing both to the .registerReciever method from this context
        val intentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_BATTERY_OKAY)

        mDynamicBroadcastReciever = DynamicBroadcastReciever()
        this.registerReceiver(mDynamicBroadcastReciever, intentFilter)

        //to register local broadcast reciever:

        //to register local broadcast reciever:
        LocalBroadcastManager.getInstance(this)
            .registerReceiver(mDynamicBroadcastReciever!!, intentFilter)

//        val broadcastIntent = PendingIntent.getBroadcast()
    }

    override fun onPause() {
        super.onPause()
        //unregister your receiver here (or in on destroy)
        //but first, check if null
        mDynamicBroadcastReciever?.let {
            this.unregisterReceiver(it)

            //to unregister local broadcast reciever:
            LocalBroadcastManager.getInstance(this)
                .unregisterReceiver(it);
        }

        //
    }
}
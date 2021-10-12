package com.example.broadcastreceiverkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class StaticBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        //Since this is registered in the manifest, we don't have to register it dynamically
        // NOTE: after API 26, most receivers
        //should be registered dynamically anyway

        //Check the Intent action and perform the required operation
        if (intent.action == Intent.ACTION_BATTERY_LOW) {
//            val text: CharSequence = "Broadcast Received!"
//            val duration = Toast.LENGTH_SHORT
//            val toast = Toast.makeText(context, text, duration)
//            toast.show()
            Toast.makeText(context, "Broadcast Recieved!", Toast.LENGTH_LONG).show()
        }
    }
}
package com.example.broadcastreceiverkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class DynamicBroadcastReciever : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

        //Check the Intent action and perform the required operation
        if (intent.action == Intent.ACTION_BATTERY_OKAY) {
//            val text: CharSequence = "Broadcast Received!"
//            val duration = Toast.LENGTH_SHORT
//            val toast = Toast.makeText(context, text, duration)
//            toast.show()
            Toast.makeText(context, "Broadcast Recieved!", Toast.LENGTH_LONG).show()
        }
        if (intent.action == ACTION_NOTIFY) {
            Toast.makeText(context, "got the launching broadcast", Toast.LENGTH_LONG).show()
        }
    }
}
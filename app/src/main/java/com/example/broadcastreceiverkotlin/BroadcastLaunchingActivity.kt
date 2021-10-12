package com.example.broadcastreceiverkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class BroadcastLaunchingActivity : AppCompatActivity() {
    private lateinit var mBroadcastLaunchingBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_launching)

        mBroadcastLaunchingBtn = findViewById(R.id.launch_broadcast_btn)
        mBroadcastLaunchingBtn.setOnClickListener {

            //sending intent
            val broadcastIntent = Intent()
            broadcastIntent.action = ACTION_NOTIFY
            //an example of restricting your broadcast:
            //broadcastIntent.setPackage("com.example.broadcastreceiverkotlin")
            //To send local broadcast:

            //To send local broadcast:
            LocalBroadcastManager.getInstance(this)
                .sendBroadcast(broadcastIntent)
            val launchActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(launchActivityIntent)
        }
    }
}
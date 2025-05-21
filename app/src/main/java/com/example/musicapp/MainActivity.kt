package com.your_package_name

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var playButton: Button
    private lateinit var pauseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById(R.id.playButton)
        pauseButton = findViewById(R.id.pauseButton)

        // No logic yet for button clicks
    }
}
package com.example.techlounge

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvCount: TextView
    private lateinit var btnCheckIn: Button
    private lateinit var btnCheckOut: Button

    private var count = 0   // number of students inside

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connect XML views with Kotlin
        tvCount = findViewById(R.id.tvCount)
        btnCheckIn = findViewById(R.id.btnCheckIn)
        btnCheckOut = findViewById(R.id.btnCheckOut)

        // Check In logic
        btnCheckIn.setOnClickListener {
            count++
            tvCount.text = count.toString()
        }

        // Check Out logic
        btnCheckOut.setOnClickListener {
            if (count > 0) {
                count--
                tvCount.text = count.toString()
            }
        }
    }
}

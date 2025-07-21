package com.example.TodoAppSLEEP

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.TodoAppSLEEP.viewmodel.OnboardScreen1

class Landing : AppCompatActivity() {
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        handler.postDelayed({
            val intent = Intent(this, OnboardScreen1::class.java)
            startActivity(intent)
            finish()
        }, 2000L)
    }
}
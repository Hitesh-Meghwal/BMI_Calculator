package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Bmi_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_splash)


        Handler(Looper.getMainLooper()).postDelayed({
            var splash = Intent(this,MainActivity::class.java)
            startActivity(splash)
            finish()
        },3000)
    }
}
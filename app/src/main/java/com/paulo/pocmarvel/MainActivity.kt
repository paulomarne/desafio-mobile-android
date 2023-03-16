package com.paulo.pocmarvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.pocmarvel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.mavis.recyclerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mavis.recyclerdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent: Intent =  Intent (this, RecylerActivity::class.java)
            startActivity(intent)
        }
    }
}
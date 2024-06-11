package com.example.birds

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityBird2Binding
import com.example.birds.databinding.ActivityBird3Binding
import com.squareup.picasso.Picasso

class Bird3 : AppCompatActivity() {
    lateinit var binding: ActivityBird3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bird3)
        setContentView(binding.root)
        binding.rightarrow2.setOnClickListener{
            finish()
        }

        binding.leftarrow3.setOnClickListener {
            val intent = Intent(this, bird4::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTda-jh1km3AdOkofkcawndL8bZyik-i2zWrQ&s")
            .into(binding.bird34)

    }
}
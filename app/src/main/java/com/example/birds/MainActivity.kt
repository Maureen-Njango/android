package com.example.birds

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.arrowleft1.setOnClickListener{
            val intent = Intent(this, bird2::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQLevbW6bx2ebotLPuMUXr5zCHxYg8WsepcvtN7VQ7bCncJKA09")
            .into(binding.bird1)

    }
}
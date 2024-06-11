package com.example.birds

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityBird4Binding
import com.example.birds.databinding.ActivityBird5Binding
import com.example.birds.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class bird5 : AppCompatActivity() {
    lateinit var binding: ActivityBird5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird5)

        binding = ActivityBird5Binding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rightarrow4.setOnClickListener{
            finish()
        }

        Picasso
            .get()
            .load("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQLevbW6bx2ebotLPuMUXr5zCHxYg8WsepcvtN7VQ7bCncJKA09")
            .into(binding.imageView5)



    }
}
package com.example.birds

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.birds.databinding.ActivityBird3Binding
import com.example.birds.databinding.ActivityBird4Binding
import com.squareup.picasso.Picasso

class bird4 : AppCompatActivity() {
    lateinit var binding: ActivityBird4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBird4Binding.inflate(layoutInflater)


        setContentView(R.layout.activity_bird4)

        setContentView(binding.root)
        binding.rightarrow3.setOnClickListener{
            finish()
        }


        setContentView(binding.root)
        binding.leftarrow4.setOnClickListener{
            val intent = Intent(this, bird5::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaVdTSGVPswf39XhiDj_ozQmf6fwGew5_CaQ&s")
            .into(binding.imageView4)

    }
}
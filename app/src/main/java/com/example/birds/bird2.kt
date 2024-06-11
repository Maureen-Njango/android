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

class bird2 : AppCompatActivity() {
    lateinit var binding: ActivityBird2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBird2Binding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.leftarrow2.setOnClickListener{
            val intent = Intent(this,Bird3::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSWtLkrCI60Ozq8QB3zz8s702TEygiC09LgPsP61lBc6EQiWPiLDNsdV0OaoCtBC7BR0QCnhA04E6MFCRlq4sRcANLhSDm2fGNk1iGpPP8")
            .into(binding.bird2)

    }
}
package com.example.conversoreurodollar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversoreurodollar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoConvert.setOnClickListener{
            val euros = binding.editEuro.text.toString().toDouble()
            val dollars = String.format("%.2f", euros * 0.8)


            binding.textdollares.text = "${dollars},$"
        }


    }
}
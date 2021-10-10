package com.example.cristallball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristallball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.window.setOnClickListener {
            binding.window.text = getReto()
        }
    }
    private fun getReto(): String{
        return resources.getStringArray(R.array.retos)[randomNumber()]
    }
    private fun randomNumber(): Int{
        val size = resources.getStringArray(R.array.retos).size - 1
        return(0..size).random()
    }

}





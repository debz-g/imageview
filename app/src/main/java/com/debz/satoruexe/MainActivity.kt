package com.debz.satoruexe


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.debz.satoruexe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener(){
            binding.ivImage.setImageResource(R.drawable.itachi)

        }

        binding.btn2.setOnClickListener(){
            binding.ivImage.setImageResource(R.drawable.itachixx)
        }
    }
}
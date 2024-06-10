package com.example.animationsshowing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.animationsshowing.databinding.ActivityMain2Binding
import com.example.animationsshowing.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //sequential animation
        val sequentialAnimation = AnimationUtils.loadAnimation(this, R.anim.sequential)
        binding.sequential.setOnClickListener {
            it.startAnimation(sequentialAnimation)
        }

        //combination animation
        val combinationAnimation = AnimationUtils.loadAnimation(this, R.anim.combination)
        binding.combination.setOnClickListener {
            it.startAnimation(combinationAnimation)
        }

    }
}
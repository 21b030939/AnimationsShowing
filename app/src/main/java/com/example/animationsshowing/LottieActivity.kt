package com.example.animationsshowing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationsshowing.databinding.ActivityLottieBinding

class LottieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLottieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLottieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lottieAnimationView.playAnimation()

        binding.resume.setOnClickListener{
            binding.lottieAnimationView.resumeAnimation()
        }

        binding.pause.setOnClickListener{
            binding.lottieAnimationView.pauseAnimation()
        }
    }
}
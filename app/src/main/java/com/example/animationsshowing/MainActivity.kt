package com.example.animationsshowing

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsshowing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //fade-in animation
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        binding.fadeIn.setOnClickListener{
            it.startAnimation(fadeInAnimation)
        }

        //scale-up animation
        val scaleUpAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_up)
        binding.scaleUp.setOnClickListener{
            it.startAnimation(scaleUpAnimation)
        }

        //rotate animation
        val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        binding.rotate.setOnClickListener{
            it.startAnimation(rotateAnimation)
        }

        binding.nextPage.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}

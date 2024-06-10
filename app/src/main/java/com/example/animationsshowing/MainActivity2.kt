package com.example.animationsshowing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.animationsshowing.databinding.ActivityMain2Binding
import com.example.animationsshowing.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //translate animation
        val translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate)
        binding.translate.setOnClickListener{
            it.startAnimation(translateAnimation)
        }

        //bounce animation
        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        binding.bounce.setOnClickListener{
            it.startAnimation(bounceAnimation)
        }

        //blink animation
        val blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        binding.blink.setOnClickListener{
            it.startAnimation(blinkAnimation)
        }

        binding.nextPage.setOnClickListener{
            startActivity(Intent(this, MainActivity3::class.java))
        }

    }
}
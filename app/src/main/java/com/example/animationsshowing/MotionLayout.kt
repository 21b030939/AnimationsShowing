package com.example.animationsshowing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationsshowing.databinding.ActivityMotionLayoutBinding

class MotionLayout : AppCompatActivity() {

    private lateinit var binding: ActivityMotionLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMotionLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val motionLayout = binding.motionLayout
        val button = binding.motionButton

        button.setOnClickListener{
            if(motionLayout.currentState == R.id.end){
                motionLayout.transitionToStart()
            } else motionLayout.transitionToEnd()
        }

    }
}
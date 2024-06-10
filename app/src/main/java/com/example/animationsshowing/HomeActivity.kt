package com.example.animationsshowing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationsshowing.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewAnimation.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.propertyAnimation.setOnClickListener{
            startActivity(Intent(this, MainActivity4::class.java))
        }

        binding.viewTransactionAnimation.setOnClickListener{
            startActivity(Intent(this, TransitionPageFirst::class.java))
        }

        binding.lottieAnimation.setOnClickListener{
            startActivity(Intent(this, LottieActivity::class.java))
        }

        binding.motionLayout.setOnClickListener{
            startActivity(Intent(this, MotionLayout::class.java))
        }

    }
}
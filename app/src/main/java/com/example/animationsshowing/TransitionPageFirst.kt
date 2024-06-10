package com.example.animationsshowing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationsshowing.databinding.TransitionPageFirstBinding

class TransitionPageFirst : AppCompatActivity() {

    private lateinit var binding: TransitionPageFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TransitionPageFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            startActivity(Intent(this, TransitionPageSecond::class.java))
            overridePendingTransition(R.anim.fade_in_transition, R.anim.fade_out_transition)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.fade_in_transition, R.anim.fade_out_transition)
    }
}
package com.example.animationsshowing

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.animation.addListener
import com.example.animationsshowing.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val moveButton = binding.moveButton

        moveButton.setOnClickListener{
            val screenWidth = resources.displayMetrics.widthPixels
            val buttonWidth = moveButton.width

            val animator = ObjectAnimator.ofFloat(moveButton, "translationX", 0f, screenWidth-buttonWidth.toFloat())
            animator.duration = 1000
            animator.start()
        }

        val animateButton = binding.animateButton

        animateButton.setOnClickListener{
            val scaleUpX = ObjectAnimator.ofFloat(animateButton, "scaleX", 1.0f, 2.0f)
            val scaleUpY = ObjectAnimator.ofFloat(animateButton, "scaleY", 1.0f, 2.0f)
            val rotateAnimation = ObjectAnimator.ofFloat(animateButton, "rotation", 0f, 360f)
            val fadeOut = ObjectAnimator.ofFloat(animateButton, "alpha", 1.0f, 0.0f)

            val animatorSet = AnimatorSet().apply {
                playTogether(scaleUpX, scaleUpY, rotateAnimation, fadeOut)
                duration = 1000
                addListener(onEnd = {
                    animateButton.scaleX = 1.0f
                    animateButton.scaleY = 1.0f
                    animateButton.alpha = 1.0f
                    animateButton.rotation = 0f
                })
            }
            animatorSet.start()
        }
    }
}
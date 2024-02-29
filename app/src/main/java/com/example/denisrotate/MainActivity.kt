package com.example.denisrotate

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photoDenis: ImageView = findViewById(R.id.image)
        val button: Button = findViewById(R.id.button)

        var listQuationFoto = mutableListOf(
            R.drawable.q19,
            R.drawable.q20,
            R.drawable.q21,
            R.drawable.q22,
            R.drawable.q23,
            R.drawable.q24,
            R.drawable.q25,
            R.drawable.q26,
            R.drawable.q27,
            R.drawable.q28,
        )

        button.setOnClickListener {
            var time: Long = 1500
            var objectAnimator = ObjectAnimator.ofPropertyValuesHolder(photoDenis,
                PropertyValuesHolder.ofFloat(View.ROTATION,360*5f, 0f),
                PropertyValuesHolder.ofFloat(View.SCALE_X,1f, 0f, 1f),
//                PropertyValuesHolder.ofFloat(View.Y, 100f, 200f)
                )
            objectAnimator.duration = time
            objectAnimator.start()

//            Thread.sleep(time)

            photoDenis.setImageResource(listQuationFoto.random())

        }

    }

}
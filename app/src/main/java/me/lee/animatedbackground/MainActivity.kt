package me.lee.animatedbackground

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<ConstraintLayout>(R.id.mainLayout)
        val animationDrawable = layout.background as AnimationDrawable

        animationDrawable.apply {
            this.setEnterFadeDuration(2000)
            this.setExitFadeDuration(3000)
            this.start()
        }

    }
}
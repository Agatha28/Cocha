package com.example.cocha

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_two.*

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
            )
        }

        @Suppress("DEPRECATION")
        iv_two_next.setOnClickListener {
            val intentToPageThree = Intent (this, ThreeActivity::class.java)
            startActivity(intentToPageThree)
            finish()
        }

        @Suppress("DEPRECATION")
        iv_two_skip.setOnClickListener {
            val intentToMainPages = Intent(this, MainActivity::class.java)
            startActivity(intentToMainPages)
            finish()
        }
    }
}
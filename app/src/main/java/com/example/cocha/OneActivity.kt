package com.example.cocha

import android.content.Intent
import android.media.Image
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_one.*

class OneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

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
        iv_one_next.setOnClickListener {
            val intentToPageTwo = Intent (this, TwoActivity::class.java)
            startActivity(intentToPageTwo)
            finish()
        }

        @Suppress("DEPRECATION")
        iv_one_skip.setOnClickListener {
            val intentToMainPage = Intent(this, MainActivity::class.java)
            startActivity(intentToMainPage)
            finish()
        }
    }
}
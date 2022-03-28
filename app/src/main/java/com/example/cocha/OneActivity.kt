package com.example.cocha

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class OneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        iv_one_next.setOnClickListener {
            val intentToPageTwo = Intent (this, TwoActivity::class.java)
            startActivity(intentToPageTwo)
            finish()
        }

        iv_one_skip.setOnClickListener {
            val intentToMainPage = Intent(this, MainActivity::class.java)
            startActivity(intentToMainPage)
            finish()
        }
    }
}
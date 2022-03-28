package com.example.cocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_two.*

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        iv_two_next.setOnClickListener {
            val intentToPageThree = Intent (this, ThreeActivity::class.java)
            startActivity(intentToPageThree)
            finish()
        }

        iv_two_skip.setOnClickListener {
            val intentToMainPages = Intent(this, MainActivity::class.java)
            startActivity(intentToMainPages)
            finish()
        }
    }
}
package com.example.cocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_three.*

class ThreeActivity : AppCompatActivity() {

    var imgStart: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        imgStart = findViewById(R.id.iv_three_start)

        imgStart?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finishAffinity()
        }
    }
}
package com.ata.appbundle.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.ata.appbundle.R

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var handler: Handler
    private val splashScreen = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@MainActivity, FilmActivity::class.java)
            startActivity(intent)
            finish()
        }, splashScreen.toLong())
    }
}
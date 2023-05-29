package com.example.googlesigninapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.javaBtn).setOnClickListener {
            startActivity(Intent(this,JavaSignInActivity::class.java))
        }
        findViewById<Button>(R.id.kotlinBtn).setOnClickListener {
            startActivity(Intent(this,KotlinSignInActivity::class.java))

        }
    }
}
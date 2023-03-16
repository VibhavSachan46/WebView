package com.example.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Home : AppCompatActivity() {

    lateinit var cardGit: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        cardGit = findViewById(R.id.cardViewGit)

        cardGit.setOnClickListener{
            val intent = Intent(this@Home , GithuActivity::class.java)
            startActivity(intent)
        }
    }
}
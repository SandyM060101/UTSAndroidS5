package com.example.utspemrogrammanweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MenuActivity : AppCompatActivity() {
    private lateinit var btnKalkulator : CardView
    private lateinit var btnAbout : CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnKalkulator = findViewById(R.id.card1)
        btnAbout = findViewById(R.id.card2)

        btnKalkulator.setOnClickListener{
            val intent = Intent(this,KalkulatorActivity::class.java)
            startActivity(intent)
        }
        btnAbout.setOnClickListener{
            val intent = Intent(this,AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
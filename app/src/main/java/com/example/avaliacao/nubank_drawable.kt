package com.example.avaliacao

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class nubank_drawable : AppCompatActivity() {
    lateinit var bt_pix: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nubank_drawable)

        bt_pix = findViewById(R.id.pix)

        bt_pix.setOnClickListener{
            val intent = Intent (this, tela_segunda::class.java)
            startActivity(intent)

        }
    }
}